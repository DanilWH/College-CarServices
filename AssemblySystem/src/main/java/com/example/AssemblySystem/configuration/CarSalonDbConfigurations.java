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
        entityManagerFactoryRef = "carSalonEntityManagerFactory",
        basePackages = { "com.example.AssemblySystem.CarSalon.repository" }
)
public class CarSalonDbConfigurations {
    @Bean(name = "carSalonDataSource")
    @ConfigurationProperties(prefix = "car-salon.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "carSalonEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean carSalonEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("carSalonDataSource") DataSource dataSource
    ) {
        return builder
                    .dataSource(dataSource)
                    .packages("com.example.AssemblySystem.CarSalon.domain")
                    .persistenceUnit("CarSalon")
                    .build();
    }

    @Bean(name = "carSalonTransactionManager")
    public PlatformTransactionManager transactionManager (
            @Qualifier("carSalonEntityManagerFactory") EntityManagerFactory carSalonEntityManagerFactory
    ) {
        return new JpaTransactionManager(carSalonEntityManagerFactory);
    }
}
