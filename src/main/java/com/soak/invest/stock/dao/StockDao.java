package com.soak.invest.stock.dao;

import java.util.List;

import com.soak.invest.stock.model.Stock;


public interface StockDao {
  
  public void addBond(Stock... stock);

  public void addBonds(List<Stock> stocks);
  
  public boolean wipeStocks();
  
  
}