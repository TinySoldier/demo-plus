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
@Order(2)
@Slf4j
public class MyCommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("MyCommandLineRunner2    " + Arrays.asList(args));
    }
}
