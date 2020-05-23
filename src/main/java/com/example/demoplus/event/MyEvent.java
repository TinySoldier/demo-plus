package com.example.demoplus.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author ：haowenju
 * @date ：2020-04-04 12:03
 */
public class MyEvent extends ApplicationEvent {

    private String msg;

    public MyEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
