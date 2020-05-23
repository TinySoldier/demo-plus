package com.example.demoplus.enums;

import com.example.demoplus.service.trade.TradeService;
import com.example.demoplus.service.trade.impl.AllinTradeService;
import com.example.demoplus.service.trade.impl.SwiftpassTradeService;

/**
 * @author ：haowenju
 * @date ：2020-04-03 10:35
 */
public enum TradeServiceEnum {
    
    ALLIN(1, AllinTradeService.class),

    SWIFT_PASS(2, SwiftpassTradeService.class);

    int tradeType;
    Class<? extends TradeService> clazz;

    TradeServiceEnum(int tradeType, Class<? extends TradeService> clazz) {
        this.tradeType = tradeType;
        this.clazz = clazz;
    }

    public int getTradeType() {
        return tradeType;
    }

    public Class<? extends TradeService> getClazz() {
        return clazz;
    }
}
