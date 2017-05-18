package com.soak.invest.financial.spider;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.soak.common.constant.CurrencyType;
import com.soak.common.date.DateUtil;
import com.soak.common.http.JsoupUtil;
import com.soak.common.util.NumberUtil;
import com.soak.common.util.StringUtil;
import com.soak.invest.financial.model.BalanceSheet;
import com.soak.invest.financial.model.FinancialSummary;

public class SpiderForFinancialStatement {

  public void execute() {

  };
  
  
  /**
   * 
   * 财务摘要 数据
   * 新浪财经 http://money.finance.sina.com.cn/corp/go.php/vFD_FinanceSummary/stockid/000001.phtml
   */
  public List<FinancialSummary> getFinancialSummaryData(String stockcode) {
    String url = "http://money.finance.sina.com.cn/corp/go.php/vFD_FinanceSummary/stockid/" + stockcode + ".phtml";
    List<FinancialSummary> financialSummarys = new ArrayList<FinancialSummary>();

    Date sysDate = DateUtil.getCurrentShortDate();
    Document doc = JsoupUtil.getWebDocument(url); // 抓取网页
    Elements table = doc.select("table#FundHoldSharesTable"); // 通过id 选取数据表格
    Elements head = table.select("thead tr").eq(0); // 取表头 标题
    String stockName = head.select("th").get(0).text();
    stockName = stockName.substring(0, stockName.indexOf("(")); // 获取名称

    Elements trs = table.select("tbody tr"); // 取行数据
    int group = 13;
    for (int i = 0; i < trs.size() / group; i++) {
      FinancialSummary financialSummary = new FinancialSummary();
      financialSummary.setCode(stockcode);
      financialSummary.setName(stockName);
      financialSummary.setCurrency(CurrencyType.CNY.getValue());

      financialSummary.setStatDate(trs.get(i * group).select("td").get(1).text()); // 截止日期

      String netAssetPerShare = trs.get(i * group + 1).select("td").get(1).text().replace("元", ""); // 每股净资产
      if (!StringUtil.isEmpty(netAssetPerShare)) {
        financialSummary.setNetAssetPerShare(NumberUtil.parseBigDecimal(netAssetPerShare)); // 每股净资产
      }

      String earningsPerShare = trs.get(i * group + 2).select("td").get(1).text().replace("元", ""); // 每股收益
      if (!StringUtil.isEmpty(earningsPerShare)) {
        financialSummary.setEarningsPerShare(NumberUtil.parseBigDecimal(earningsPerShare)); // 每股收益
      }

      String cashPerShare = trs.get(i * group + 3).select("td").get(1).text().replace("元", ""); // 每股现金含量
      if (!StringUtil.isEmpty(cashPerShare)) {
        financialSummary.setCashPerShare(NumberUtil.parseBigDecimal(cashPerShare)); // 每股现金含量
      }

      String capitalReservesPerShare = trs.get(i * group + 4).select("td").get(1).text().replace("元", ""); // 每股资本公积金
      if (!StringUtil.isEmpty(capitalReservesPerShare)) {
        financialSummary.setCapitalReservesPerShare(NumberUtil.parseBigDecimal(capitalReservesPerShare)); // 每股资本公积金
      }

      String netFixedAssets = trs.get(i * group + 5).select("td").get(1).text().replace("元", ""); // 固定资产合计
      if (!StringUtil.isEmpty(netFixedAssets)) {
        financialSummary.setNetFixedAssets(NumberUtil.parseBigDecimal(netFixedAssets)); // 固定资产合计
      }

      String totalCurrentAssets = trs.get(i * group + 6).select("td").get(1).text().replace("元", ""); // 流动资产合计
      if (!StringUtil.isEmpty(totalCurrentAssets)) {
        financialSummary.setTotalCurrentAssets(NumberUtil.parseBigDecimal(totalCurrentAssets)); // 流动资产合计
      }

      String totalAssets = trs.get(i * group + 7).select("td").get(1).text().replace("元", ""); // 资产总计
      if (!StringUtil.isEmpty(totalAssets)) {
        financialSummary.setTotalAssets(NumberUtil.parseBigDecimal(totalAssets)); // 资产总计
      }

      String totalLongtermLiability = trs.get(i * group + 8).select("td").get(1).text().replace("元", ""); // 长期负债合计
      if (!StringUtil.isEmpty(totalLongtermLiability)) {
        financialSummary.setTotalLongtermLiability(NumberUtil.parseBigDecimal(totalLongtermLiability)); // 长期负债合计
      }

      String revenue = trs.get(i * group + 9).select("td").get(1).text().replace("元", ""); // 主营业务收入
      if (!StringUtil.isEmpty(revenue)) {
        financialSummary.setRevenue(NumberUtil.parseBigDecimal(revenue)); // 主营业务收入
      }

      String financeExpense = trs.get(i * group + 10).select("td").get(1).text().replace("元", ""); // 财务费用
      if (!StringUtil.isEmpty(financeExpense)) {
        financialSummary.setFinanceExpense(NumberUtil.parseBigDecimal(financeExpense)); // 财务费用
      }

      String netProfit = trs.get(i * group + 11).select("td").get(1).text().replace("元", ""); // 净利润
      if (!StringUtil.isEmpty(netProfit)) {
        financialSummary.setNetProfit(NumberUtil.parseBigDecimal(netProfit)); // 净利润
      }

      financialSummarys.add(financialSummary);
    }

    return financialSummarys;
  }


  /**
   * 
   * 資產負債表
   * 新浪财经
   * http://money.finance.sina.com.cn/corp/go.php/vFD_BalanceSheet/stockid/000651/ctrl/2016/displaytype/4.phtml
   */
  public List<BalanceSheet> getBalanceSheetData(String stockcode, String year) {
    String url = "http://money.finance.sina.com.cn/corp/go.php/vFD_BalanceSheet/stockid/"+stockcode + "/ctrl/"+ year +"/displaytype/4.phtml" ;
    List<BalanceSheet> balanceSheets = new ArrayList<BalanceSheet>();

    Date sysDate = DateUtil.getCurrentShortDate();
    Document doc = JsoupUtil.getWebDocument(url); // 抓取网页
    Elements table = doc.select("table#BalanceSheetNewTable0"); // 通过id 选取数据表格
    Elements head = table.select("thead tr").eq(0); // 取表头 标题
    String stockName = head.select("th").get(0).text();
    stockName = stockName.substring(0, stockName.indexOf("(")); // 获取名称
    
    
    
    
    return null;
  }

  public static void main(String args[]) {
    String stockCode = "000001";
    SpiderForFinancialStatement instance = new SpiderForFinancialStatement();
    instance.getFinancialSummaryData(stockCode);
  }

}
