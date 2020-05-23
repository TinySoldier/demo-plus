package com.example.demoplus.service.trade;

import java.util.Map;

/**
 * @author ：haowenju
 * @date ：2020-04-02 19:15
 */
public interface TradeService {

    String pay();

    Map<String, String> query();

    Map<String, String> refund();
}
