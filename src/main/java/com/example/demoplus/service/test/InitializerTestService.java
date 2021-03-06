package com.example.demoplus.service.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author ：haowenju
 * @date ：2020-04-25 15:31
 */
@Service
public class InitializerTestService implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String test()
    {
        return applicationContext.getEnvironment().getProperty("key2");
    }
}
