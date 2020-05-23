package com.example.demoplus.service.business.impl;

import com.example.demoplus.entity.User;
import com.example.demoplus.mapper.UserMapper;
import com.example.demoplus.service.business.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        System.out.println("selectAll");
        return userMapper.selectList(null);
    }

    @Override
    public void bodyTest(@RequestBody String body) {
        System.out.println("postTest in service body:" + body);

    }
}
