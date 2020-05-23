package com.example.demoplus.controller;

import com.example.demoplus.annotation.DataExport;
import com.example.demoplus.event.MyEvent;
import com.example.demoplus.service.test.InitializerTestService;
import com.example.hello.service.HelloService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author ：haowenju
 * @date ：2020-04-04 12:10
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private HelloService helloService;

    @Autowired
    private InitializerTestService initializerTestService;

    @RequestMapping("msgPublish")
    public String msgPublish(String msg)
    {
        if(StringUtils.isBlank(msg))
        {
            msg = "哈哈";
        }
        context.publishEvent(new MyEvent(context, msg));
        return "发布成功";
    }

    @DataExport
    @RequestMapping("hello")
    public String hello(String name, HttpServletResponse response)
    {
        System.out.println("response in hello:" + response);
        return helloService.hello(name);
    }

    @RequestMapping("testEncoding")
    public String testEncoding()
    {

        return "你好";
    }

    @RequestMapping("test")
    public String test()
    {

        return initializerTestService.test();
    }
}
