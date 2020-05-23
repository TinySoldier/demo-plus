package com.example.demoplus.controller;

import com.example.demoplus.factory.TradeServiceFactory;
import com.example.demoplus.service.trade.TradeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：haowenju
 * @date ：2020-04-02 19:26
 */
@RestController
@RequestMapping("trade")
public class TradeController {

    /**
     *
     * @param tradeType
     * @return
     */
    @RequestMapping("pay")
    public String pay(String tradeType)
    {
        TradeService tradeService = TradeServiceFactory.getByType(tradeType);
        if(tradeService == null)
        {
            return "交易类型无效";
        }
        return tradeService.pay();
    }
}
