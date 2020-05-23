package com.example.demoplus;

import com.example.demoplus.initializer.SecondInitializer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example") //如果启动类不在最外层目录，则需要制定包扫描路径
@MapperScan("com.example.demoplus.mapper")
public class DemoPlusApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoPlusApplication.class, args);

        SpringApplication springApplication = new SpringApplication(DemoPlusApplication.class);
//        springApplication.addInitializers(new SecondInitializer());
        springApplication.run(args);
    }


}
