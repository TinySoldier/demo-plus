package com.example.demoplus.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author ：haowenju
 * @date ：2020-05-05 17:42
 */
@Component
public class ApplicationContainer implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("ApplicationContainer begin");
    }
}
