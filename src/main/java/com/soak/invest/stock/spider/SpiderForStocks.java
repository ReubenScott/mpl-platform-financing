package com.soak.invest.stock.spider;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.soak.common.constant.CurrencyType;
import com.soak.common.http.JsoupUtil;
import com.soak.common.io.IOHandler;
import com.soak.common.util.NumberUtils;
import com.soak.common.util.StringUtil;
import com.soak.framework.jdbc.core.JdbcTemplate;
import com.soak.invest.financial.model.FinancialSummary;
import com.soak.invest.stock.model.StockTradeData;

public class SpiderForStocks {

  public void execute() {

  };

  /**
   * 
   * 新浪财经 交易数据
   * http://stock.finance.sina.com.cn/hkstock/history/02010.html
   * 02010
   */
  public List<StockTradeData> getStockTradeData(String symbol) {
    List<StockTradeData> stockTradeDatas = new ArrayList<StockTradeData>();
    // String url = "http://q.stock.sohu.com/cn/cb/" + shortDate + "/issued_publish_date_as_" + index + ".shtml";
    String url = "http://stock.finance.sina.com.cn/hkstock/history/" + symbol + ".html";
    Document doc = JsoupUtil.getWebDocument(url, "{year:2010,season:4}"); // 抓取网页
    Elements table = doc.select("table.tab05"); // 通过id 选取数据表格

    // TODO
    Elements trs = table.select("tbody tr"); // 取行数据
    for (int i = 1; i < trs.size(); i++) {
      StockTradeData stockTradeData = new StockTradeData();
      Elements tds = trs.get(i).select("td");
      stockTradeData.setSymbol(symbol);
      stockTradeData.setTradeDate(tds.get(0).text()); // // 日期
      stockTradeData.setClosingPrice(new Float(tds.get(1).text())); // 收盘价
      stockTradeData.setChangeAmount(new Float(tds.get(2).text())); // 涨跌额
      stockTradeData.setChangeRate(new Float(tds.get(3).text())); // 涨跌幅

      stockTradeData.setVolume(new Float(tds.get(4).text())); // 成交量
      stockTradeData.setTurnover(new Float(tds.get(5).text())); // 成交额
      stockTradeData.setOpeningPrice(new Float(tds.get(6).text())); // 开盘价
      stockTradeData.setHighest(new Float(tds.get(7).text())); // 最高价
      stockTradeData.setLowest(new Float(tds.get(8).text())); // 最低价
      stockTradeData.setAmplitude(new Float(tds.get(9).text())); // 振幅

      stockTradeDatas.add(stockTradeData);
    }

    return stockTradeDatas;
  }
  
  
  
  public void getStockTradeDataFromYahoo(String symbol) {
  }

  public static void main(String args[]) {
    String url = "https://table.finance.yahoo.com/table.csv?s=ibm" ;
//    InputStream in = new ByteArrayInputStream(IOHandler.readURLStream(url)) ; 
    JdbcTemplate.getInstance().loadCsvFile("finance", "stock_trade", IOHandler.getURLInputStream(url), ',', '"', 1);
    
//    SpiderForStocks spider = new SpiderForStocks();
//    List<StockTradeData> tradeDatas = spider.getStockTradeData("02010");
//    System.out.println(tradeDatas.size());
//    for (StockTradeData tradeData : tradeDatas) {
//      System.out.println(tradeData.getTradeDate());
//    }
  }

}
