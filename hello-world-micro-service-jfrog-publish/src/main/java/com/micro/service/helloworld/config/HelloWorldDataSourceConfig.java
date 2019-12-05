package com.micro.service.helloworld.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldDataSourceConfig {

    @Autowired
    private HelloWorldProperties helloWorldProperties;

    @Bean
    public HikariDataSource checkouotDataSource() {
        HelloWorldProperties.Database database = helloWorldProperties.getDatabase();
        return DataSourceBuilder.create().driverClassName("oracle.jdbc.driver.OracleDriver")
                .url(database.getName()).username(database.getUsername())
                .password(database.getPassword()).type(HikariDataSource.class).build();
    }
}
