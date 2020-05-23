package com.example.demoplus.controller;

import com.example.demoplus.entity.User;
import com.example.demoplus.service.business.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("selectAll")
    public String selectAll()
    {
        List<User> userList = userService.selectAll();
        if(userList == null || userList.size() == 0)
        {
            return "没有数据";
        }
        return userList.toString();
    }

    @ResponseBody
    @RequestMapping("postTest")
    public String postTest(@RequestBody String body)
    {
        System.out.println("postTest in controller body:" + body);
        return body;
    }
}
