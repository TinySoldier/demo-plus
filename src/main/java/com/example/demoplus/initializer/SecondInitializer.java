package com.example.demoplus.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：haowenju
 * @date ：2020-04-25 15:14
 */
@Order(2)
public class SecondInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        Map<String, Object> map = new HashMap<>();
        map.put("key2", "value2");
        MapPropertySource firstInitializer = new MapPropertySource("SecondInitializer", map);
        applicationContext.getEnvironment().getPropertySources().addLast(firstInitializer);
        System.out.println("run SecondInitializer");
    }
}
