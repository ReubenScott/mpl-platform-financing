package com.soak.invest.financial.spider;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import ch.qos.logback.classic.Logger;

import com.soak.common.date.DateUtil;
import com.soak.common.util.StringUtil;
import com.soak.invest.bond.model.Bond;
import com.soak.invest.financial.model.FinancialSummary;

public class SpiderForFinancialStatement {
  
  public void execute(){
    
    
  };
  
  // 通过 新浪财经   取 财务摘要   数据
  // http://money.finance.sina.com.cn/corp/go.php/vFD_FinanceSummary/stockid/000001.phtml
  public void getFinancialSummaryData() {
    String stockCode = "000001" ;
    String url = "http://money.finance.sina.com.cn/corp/go.php/vFD_FinanceSummary/stockid/"+stockCode +".phtml";
    try {
      Date sysDate = DateUtil.getCurrentShortDate();
      Connection connect = HttpConnection.connect(url);
      // Connection connect = Jsoup.connect(url);
      // connect.timeout(timeout);
      connect.header("Accept-Encoding", "gzip,deflate,sdch");
      connect.header("Connection", "close");
      connect.validateTLSCertificates(false);

      // String yellowNews = conn.execute().body();
      connect.maxBodySize(10 * 1024 * 1024); // 设置最大 10M jsoup 默许抓取页面大小为1M
      Document doc = connect.get();
      Elements table = doc.select("table#FundHoldSharesTable"); // 通过id 选取数据表格 
      Elements trs = table.select("tbody tr"); // 取行数据

      
      int group =  13 ;
      for (int i = 0; i < trs.size()/group ; i++) {
        FinancialSummary financialSummary = new FinancialSummary();
        financialSummary.setStatDate(trs.get(i*group).select("td").get(1).text()); // 截止日期 
        
        String netAssetPerShare = trs.get(i*group + 1).select("td").get(1).text().replace("元", "") ;  // 每股净资产
        if(!StringUtil.isEmpty(netAssetPerShare)){
          financialSummary.setNetAssetPerShare(setNuber(netAssetPerShare)); // 每股净资产
        }
        
        String earningsPerShare = trs.get(i*group + 2).select("td").get(1).text().replace("元", "") ;  // 每股收益
        if(!StringUtil.isEmpty(earningsPerShare)){
          financialSummary.setEarningsPerShare(setNuber(earningsPerShare)); // 每股收益
        }
        
        System.out.println(financialSummary);
      }
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private BigDecimal setNuber(String number){
    try {
      return  new BigDecimal(number.trim()) ;
    }catch (NumberFormatException e) {
      e.printStackTrace();
      System.out.println(StringUtil.isEmpty(number));
      System.out.println(number);
      throw e ;
    }
  }
  
  public static void main(String args[]){
    SpiderForFinancialStatement  instance = new SpiderForFinancialStatement();
    instance.getFinancialSummaryData();
  }
  
}
