package io.davidarchanjo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    entityManagerFactoryRef = "barEntityManagerFactory",
    basePackages = { "io.davidarchanjo.bar.repo" }
)
public class BarDataSourceConfig {

    @Bean
    public DataSource barDataSource(
        @Value("${bar.datasource.url}") String url,
        @Value("${bar.datasource.username}") String username,
        @Value("${bar.datasource.password}") String password,
        @Value("${bar.datasource.driver-class-name}") String driverClassName
    ) {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(url);
        dataSourceBuilder.username(username);
        dataSourceBuilder.password(password);
        dataSourceBuilder.driverClassName(driverClassName);
        DataSource dataSource = dataSourceBuilder.build();

        Resource initSchema = new ClassPathResource("schema-hsqldb.sql");
        Resource initData = new ClassPathResource("data-hsqldb.sql");
        DatabasePopulator databasePopulator = new ResourceDatabasePopulator(initSchema, initData);
        DatabasePopulatorUtils.execute(databasePopulator, dataSource);

        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean barEntityManagerFactory(
        EntityManagerFactoryBuilder builder,
        @Qualifier("barDataSource") DataSource dataSource
    ) {
        return builder.dataSource(dataSource)        
            .packages("io.davidarchanjo.bar.domain")
            .persistenceUnit("bar")
            .build();
    }
    @Bean(name = "barTransactionManager")
    public PlatformTransactionManager barTransactionManager(
        @Qualifier("barEntityManagerFactory") EntityManagerFactory barEntityManagerFactory
    ) {
        return new JpaTransactionManager(barEntityManagerFactory);
    }
}