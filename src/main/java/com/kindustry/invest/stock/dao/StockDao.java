package com.kindustry.invest.stock.dao;

import java.util.List;

import com.kindustry.framework.dao.IBasicDao;
import com.kindustry.invest.stock.model.StockTradeData;


public interface StockDao extends IBasicDao{
  
  public void addStockTradeData(StockTradeData... stockTradeData);

  public void addStockTradeDatas(List<StockTradeData> stockTradeDatas);
  
  public boolean wipeStocks();
  
  
}