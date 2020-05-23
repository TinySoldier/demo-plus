package com.example.demoplus.service.business;

import com.example.demoplus.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAll();

    void bodyTest(String body);
}
