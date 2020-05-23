package com.example.demoplus.service.pay.impl;

import com.example.demoplus.service.pay.PayService;
import org.springframework.stereotype.Service;

/**
 * @author ：haowenju
 * @date ：2020-04-02 19:25
 */
@Service("AllinPayService")
public class AllinPayService implements PayService {

    @Override
    public String pay() {

//        System.out.println("这是通联付款");
        return "付款成功，这是通联付款";
    }
}
