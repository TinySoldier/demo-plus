package com.example.demoplus.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ：haowenju
 * @date ：2020-04-04 21:54
 */
@Component
@Order(7)
@Slf4j
public class MyApplicationRunner1 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        args.getOptionNames().forEach(s -> stringBuffer.append(s).append("=").append(args.getOptionValues(s)).append(","));
        log.info("MyApplicationRunner1    "+stringBuffer.toString());
    }
}
