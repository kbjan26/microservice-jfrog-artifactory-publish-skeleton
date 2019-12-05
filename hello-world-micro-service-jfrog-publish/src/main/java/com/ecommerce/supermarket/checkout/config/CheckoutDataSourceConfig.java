package com.ecommerce.supermarket.checkout.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CheckoutDataSourceConfig {

    @Autowired
    private CheckoutProperties checkoutProperties;

    @Bean
    public HikariDataSource checkouotDataSource() {
        CheckoutProperties.Database database =checkoutProperties.getDatabase();
        return DataSourceBuilder.create().driverClassName("oracle.jdbc.driver.OracleDriver")
                .url(database.getName()).username(database.getUsername())
                .password(database.getPassword()).type(HikariDataSource.class).build();
    }
}
