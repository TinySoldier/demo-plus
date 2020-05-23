package com.example.demoplus.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author ：haowenju
 * @date ：2020-04-04 21:56
 */
@Component
@Order(4)
@Slf4j
public class MyCommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("MyCommandLineRunner1    " + Arrays.asList(args));
    }
}
