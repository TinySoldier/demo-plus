package com.example.demoplus.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ：haowenju
 * @date ：2020-05-05 16:00
 */
@Order(2)
@Component
public class SecondListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationStartedEvent.class.isAssignableFrom(eventType) || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return true;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Hello second, " + event);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
