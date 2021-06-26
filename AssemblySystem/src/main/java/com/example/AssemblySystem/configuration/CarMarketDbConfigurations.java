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
        entityManagerFactoryRef = "carMarketEntityManagerFactory",
        basePackages = { "com.example.AssemblySystem.CarMarket.repository" }
)
public class CarMarketDbConfigurations {
    @Bean(name = "carMarketDataSource")
    @ConfigurationProperties(prefix = "car-market.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "carMarketEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean carMarketEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("carMarketDataSource") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("com.example.AssemblySystem.CarMarket.domain")
                .persistenceUnit("CarMarket")
                .build();
    }

    @Bean(name = "carMarketTransactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("carMarketEntityManagerFactory") EntityManagerFactory carMarketEntityManagerFactory
    ) {
        return new JpaTransactionManager(carMarketEntityManagerFactory);
    }
}
