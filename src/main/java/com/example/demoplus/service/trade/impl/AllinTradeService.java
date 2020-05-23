package com.example.demoplus.service.trade.impl;

import com.example.demoplus.service.pay.PayService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author ：haowenju
 * @date ：2020-04-02 19:28
 */
@Service
public class AllinTradeService extends AbstractTradeService {

    public AllinTradeService(@Qualifier("AllinPayService") PayService payService) {
        this.payService = payService;
    }
}
