package com.soak.invest.stock.service.imp;

import java.util.List;

import com.soak.invest.stock.dao.StockDao;
import com.soak.invest.stock.dao.imp.StockDaoImp;
import com.soak.invest.stock.model.StockTradeData;
import com.soak.invest.stock.service.StockTradeService;
import com.soak.invest.stock.spider.SpiderForStocks;

public class StockTradeServiceImp implements StockTradeService {

   private StockDao StockTradeDao = new StockDaoImp();

  @Override
  public List<StockTradeData> crawlingStockTradeData(String symbol) {
    SpiderForStocks instance = new SpiderForStocks();
    List<StockTradeData> stockTradeDatas = instance.getStockTradeData(symbol);
    StockTradeDao.saveAnnotatedBean(stockTradeDatas);
    return stockTradeDatas;
  }

}