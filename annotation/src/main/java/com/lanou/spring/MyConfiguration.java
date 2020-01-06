package com.lanou.spring;

import com.alibaba.druid.pool.DruidDataSource;

import com.lanou.spring.bean.Girl;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.lanou.spring")
@PropertySource("classpath:/jdbc.properties")
public class MyConfiguration {


    @Value("jdbc:mysql://localhost:3306/library?characterEncoding=utf8")
    private String url;
    @Value("${jdbc.user}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.driver}")
    private String driverClassName;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    @Bean
    public QueryRunner queryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }

    @Bean
    public Girl girl(){
        return new Girl("武则天");
    }
    @Bean
    public Girl daqiao(){
        return new Girl("大乔");
    }

    @Bean
    public Girl xiaoqiao(){
        return new Girl("小乔");
    }

}
