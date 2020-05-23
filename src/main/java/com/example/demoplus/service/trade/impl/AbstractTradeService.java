package com.example.demoplus.service.trade.impl;

import com.example.demoplus.service.pay.PayService;
import com.example.demoplus.service.trade.TradeService;

import java.util.Map;

/**
 * @author ：haowenju
 * @date ：2020-04-02 19:23
 */
public abstract class AbstractTradeService implements TradeService {

    protected PayService payService;

    @Override
    public String pay() {
        return payService.pay();
    }

    @Override
    public Map<String, String> query() {
        return null;
    }

    @Override
    public Map<String, String> refund() {
        return null;
    }

    public PayService getPayService() {
        return payService;
    }

    public void setPayService(PayService payService) {
        this.payService = payService;
    }
}
