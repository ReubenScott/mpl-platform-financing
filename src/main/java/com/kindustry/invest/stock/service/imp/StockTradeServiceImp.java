package com.kindustry.invest.stock.service.imp;

import java.util.List;

import com.kindustry.invest.stock.dao.StockDao;
import com.kindustry.invest.stock.dao.imp.StockDaoImp;
import com.kindustry.invest.stock.model.StockTradeData;
import com.kindustry.invest.stock.service.StockTradeService;
import com.kindustry.invest.stock.spider.SpiderForStocks;

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