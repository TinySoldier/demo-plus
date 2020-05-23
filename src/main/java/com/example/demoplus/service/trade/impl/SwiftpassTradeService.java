package com.example.demoplus.service.trade.impl;

import com.example.demoplus.service.pay.PayService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author ：haowenju
 * @date ：2020-04-03 10:30
 */
@Service
public class SwiftpassTradeService extends AbstractTradeService {

    public SwiftpassTradeService(@Qualifier("SwiftpassPayService") PayService payService) {
        this.payService = payService;
    }
}
