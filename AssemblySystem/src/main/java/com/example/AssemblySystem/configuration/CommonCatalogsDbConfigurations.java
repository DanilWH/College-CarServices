package com.example.AssemblySystem.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "commonCatalogsEntityManagerFactory",
        basePackages = { "com.example.AssemblySystem.CommonCatalogs.repository" }
)
public class CommonCatalogsDbConfigurations {
    @Bean(name = "commonCatalogsDataSource")
    @ConfigurationProperties(prefix = "common-catalogs.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "commonCatalogsEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean commonCatalogsEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("commonCatalogsDataSource") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("com.example.AssemblySystem.commonCatalogs.domain")
                .persistenceUnit("commonCatalogs")
                .build();
    }

    @Bean(name = "commonCatalogsTransactionManager")
    public PlatformTransactionManager transactionManager (
            @Qualifier("commonCatalogsEntityManagerFactory") EntityManagerFactory commonCatalogsEntityManagerFactory
    ) {
        return new JpaTransactionManager(commonCatalogsEntityManagerFactory);
    }
}
