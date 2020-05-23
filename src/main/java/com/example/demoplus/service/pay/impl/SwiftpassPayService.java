package com.example.demoplus.service.pay.impl;

import com.example.demoplus.service.pay.PayService;
import org.springframework.stereotype.Service;

/**
 * @author ：haowenju
 * @date ：2020-04-03 10:26
 */
@Service("SwiftpassPayService")
public class SwiftpassPayService implements PayService {

    @Override
    public String pay() {

//        System.out.println("这是全付通付款");
        return "付款成功，这是全付通付款";
    }
}
