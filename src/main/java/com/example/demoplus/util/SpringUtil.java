package com.example.demoplus.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author ：haowenju
 * @date ：2020-04-03 11:09
 */
@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext APPLICATION_CONTEXT;

    /**
     * 设置spring上下文
     *
     * @param applicationContext spring上下文
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        APPLICATION_CONTEXT = applicationContext;
    }

    /**
     * 获取容器
     *
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        return APPLICATION_CONTEXT;
    }

    /**
     * 获取容器对象
     *
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> type) {
        return APPLICATION_CONTEXT.getBean(type);
    }

    /**
     * 获取容器对象
     *
     * @param name
     * @param <T>
     * @return
     */
    public static <T> T getBean(String name) {
        return (T) APPLICATION_CONTEXT.getBean(name);
    }
}
