package com.kindustry.invest.stock.model;import java.io.Serializable;import java.util.Date;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.Id;import javax.persistence.IdClass;import javax.persistence.Table;@Entity@Table(schema = "finance", name = "stock_trade_data")public class StockTradeData implements Serializable {  private static final long serialVersionUID = 1L;  @Id  @Column  private String symbol; // 代码  @Column  private String name; // 名称  @Column(name="trade_date")  private String tradeDate; // 日期  @Column(name = "opening_price")  private Float openingPrice; // 开盘价  @Column(name = "last_trade")  private Float lastTrade; // 最新价  @Column(name = "closing_price")  private Float closingPrice; // 收盘价  @Column(name = "change_rate")  private Float changeRate; // 涨跌幅  @Column(name = "change_amount")  private Float changeAmount; // 涨跌额  @Column  private Float volume; // 成交量  @Column  private Float turnover; // 成交额  @Column  private Float highest; // 最高价  @Column  private Float lowest; // 最低价  @Column  private Float amplitude; // 振幅  public String getSymbol() {    return symbol;  }  public void setSymbol(String symbol) {    this.symbol = symbol;  }  public String getName() {    return name;  }  public void setName(String name) {    this.name = name;  }  public String getTradeDate() {    return tradeDate;  }  public void setTradeDate(String tradeDate) {    this.tradeDate = tradeDate;  }  public Float getOpeningPrice() {    return openingPrice;  }  public void setOpeningPrice(Float openingPrice) {    this.openingPrice = openingPrice;  }  public Float getLastTrade() {    return lastTrade;  }  public void setLastTrade(Float lastTrade) {    this.lastTrade = lastTrade;  }  public Float getClosingPrice() {    return closingPrice;  }  public void setClosingPrice(Float closingPrice) {    this.closingPrice = closingPrice;  }  public Float getChangeRate() {    return changeRate;  }  public void setChangeRate(Float changeRate) {    this.changeRate = changeRate;  }  public Float getChangeAmount() {    return changeAmount;  }  public void setChangeAmount(Float changeAmount) {    this.changeAmount = changeAmount;  }  public Float getVolume() {    return volume;  }  public void setVolume(Float volume) {    this.volume = volume;  }  public Float getTurnover() {    return turnover;  }  public void setTurnover(Float turnover) {    this.turnover = turnover;  }  public Float getHighest() {    return highest;  }  public void setHighest(Float highest) {    this.highest = highest;  }  public Float getLowest() {    return lowest;  }  public void setLowest(Float lowest) {    this.lowest = lowest;  }  public Float getAmplitude() {    return amplitude;  }  public void setAmplitude(Float amplitude) {    this.amplitude = amplitude;  }    }