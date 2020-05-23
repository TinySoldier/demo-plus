package com.example.demoplus.factory;

import com.example.demoplus.enums.TradeServiceEnum;
import com.example.demoplus.service.trade.TradeService;
import com.example.demoplus.util.SpringUtil;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author ：haowenju
 * @date ：2020-04-03 11:06
 */
public class TradeServiceFactory {

    public static TradeService getByType(String tradeType)
    {
        return getByType(NumberUtils.toInt(tradeType, -1));
    }

    public static TradeService getByType(int tradeType)
    {
        Class tradeServiceClass = null;
        for(TradeServiceEnum tradeServiceEnum : TradeServiceEnum.values())
        {
            if(tradeType == tradeServiceEnum.getTradeType())
            {
                tradeServiceClass = tradeServiceEnum.getClazz();
            }
        }
        if(tradeServiceClass == null)
        {
            return null;
        }
        return (TradeService) SpringUtil.getBean(tradeServiceClass);
    }
}
