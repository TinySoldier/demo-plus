package com.example.demoplus.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：haowenju
 * @date ：2020-04-04 12:07
 */
@Component
public class MyListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("MyListener收到了MyEvent的消息：" + event.getMsg());
    }
}
