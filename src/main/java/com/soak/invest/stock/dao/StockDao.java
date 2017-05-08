package com.soak.invest.stock.dao;

import java.util.List;

import com.soak.framework.dao.IBasicDao;
import com.soak.invest.stock.model.StockTradeData;


public interface StockDao extends IBasicDao{
  
  public void addStockTradeData(StockTradeData... stockTradeData);

  public void addStockTradeDatas(List<StockTradeData> stockTradeDatas);
  
  public boolean wipeStocks();
  
  
}