package com.example.demo.spring_jdbc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JdbcConfiguration {

    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://javalearning.cgzy1ncl0xwr.eu-west-1.rds.amazonaws.com:3306/testdb?enabledTLSProtocols=TLSv1.2");
        dataSource.setUsername("spangli");
        dataSource.setPassword("evildevil21");

        return dataSource;
    }
}
