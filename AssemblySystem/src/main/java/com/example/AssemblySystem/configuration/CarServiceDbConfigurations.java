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
        entityManagerFactoryRef = "carServiceEntityManagerFactory",
        basePackages = { "com.example.AssemblySystem.CarService.repository" }
)
public class CarServiceDbConfigurations {
    @Bean(name = "carServiceDataSource")
    @ConfigurationProperties(prefix = "car-service.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "carServiceEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean carServiceEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("carServiceDataSource") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("com.example.AssemblySystem.CarService.domain")
                .persistenceUnit("CarService")
                .build();
    }

    @Bean(name = "carServiceTransactionManager")
    public PlatformTransactionManager transactionManager (
            @Qualifier("carServiceEntityManagerFactory") EntityManagerFactory carServiceEntityManagerFactory
    ) {
        return new JpaTransactionManager(carServiceEntityManagerFactory);
    }
}
