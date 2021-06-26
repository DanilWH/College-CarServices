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
        entityManagerFactoryRef = "carWashEntityManagerFactory",
        basePackages = { "com.example.AssemblySystem.CarWash.repository" }
)
public class CarWashDbConfigurations {
    @Bean(name = "carWashDataSource")
    @ConfigurationProperties(prefix = "car-wash.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "carWashEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean carWashEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("carWashDataSource") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("com.example.AssemblySystem.CarWash.domain")
                .persistenceUnit("CarWash")
                .build();
    }

    @Bean(name = "carWashTransactionManager")
    public PlatformTransactionManager transactionManager (
            @Qualifier("carWashEntityManagerFactory") EntityManagerFactory carWashEntityManagerFactory
    ) {
        return new JpaTransactionManager(carWashEntityManagerFactory);
    }
}
