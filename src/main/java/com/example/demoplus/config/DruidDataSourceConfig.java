package com.example.demoplus.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Druid数据源配置类
 * @author ：haowenju
 * @date ：2020-04-09 9:07
 */
//@Configuration
public class DruidDataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource druidDataSource()
    {
        return new DruidDataSource();
    }
}
