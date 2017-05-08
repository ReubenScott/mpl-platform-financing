package com.soak.invest.stock.service.imp;

import static org.junit.Assert.*;

import org.junit.Test;

public class StockTradeServiceImpTest {

  @Test
  public void testCrawlingStockTradeData() {
    StockTradeServiceImp  service = new StockTradeServiceImp();
    service.crawlingStockTradeData("02010");
  }

}
