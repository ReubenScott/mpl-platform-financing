package com.kindustry.invest.stock.service.imp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kindustry.invest.stock.service.imp.StockTradeServiceImp;

public class StockTradeServiceImpTest {

  @Test
  public void testCrawlingStockTradeData() {
    StockTradeServiceImp  service = new StockTradeServiceImp();
    service.crawlingStockTradeData("02010");
  }

}
