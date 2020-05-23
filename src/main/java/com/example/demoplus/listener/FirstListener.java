package com.example.demoplus.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：haowenju
 * @date ：2020-05-05 12:15
 */
@Component
public class FirstListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        System.out.println("Hello first listener");
    }
}
