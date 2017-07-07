package com.kindustry.invest.financial.spider;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.kindustry.common.constant.CurrencyType;
import com.kindustry.common.date.DateUtil;
import com.kindustry.common.http.JsoupUtil;
import com.kindustry.common.util.NumberUtil;
import com.kindustry.common.util.StringUtil;
import com.kindustry.invest.financial.model.BalanceSheet;
import com.kindustry.invest.financial.model.FinancialSummary;

public class FinancialSpiderFromSohu {

  public void execute() {

  };

  /**
   * 
   * 财务摘要 数据
   * 搜狐财经
   * http://q.stock.sohu.com/cn/cb/2017-03-31/issued_publish_date_as_1.shtml
   * 
   */
  public List<FinancialSummary> getFinancialSummaryData(String shortDate) {
    List<FinancialSummary> financialSummarys = new ArrayList<FinancialSummary>();
    for (int index = 1; index <= 7; index++) {
      String url = "http://q.stock.sohu.com/cn/cb/" + shortDate + "/issued_publish_date_as_" + index + ".shtml";
      Document doc = JsoupUtil.getWebDocument(url); // 抓取网页
      Elements table = doc.select("table#BIZ_MS_JDPH"); // 通过id 选取数据表格

      Elements trs = table.select("tbody tr"); // 取行数据
      for (int i = 0; i < trs.size(); i++) {
        FinancialSummary financialSummary = new FinancialSummary();
        Elements tds = trs.get(i).select("td");
        financialSummary.setCurrency(CurrencyType.CNY.getValue());
        financialSummary.setCode(tds.get(1).text()); // 股票代码
        financialSummary.setName(tds.get(2).text()); // 股票名称
        // 公告日期
        financialSummary.setStatDate(tds.get(4).text()); // 报告期

        String earningsPerShare = tds.get(5).text().replace("--", ""); // 每股收益
        if (!StringUtil.isEmpty(earningsPerShare)) {
          financialSummary.setEarningsPerShare(NumberUtil.parseBigDecimal(earningsPerShare)); // 每股收益
        }
        String netAssetPerShare = tds.get(6).text().replace("--", ""); // 每股净资产
        if (!StringUtil.isEmpty(netAssetPerShare)) {
          financialSummary.setNetAssetPerShare(NumberUtil.parseBigDecimal(netAssetPerShare)); // 每股净资产
        }
        String capitalReservesPerShare = tds.get(7).text().replace("--", ""); // 每股资本公积金
        if (!StringUtil.isEmpty(capitalReservesPerShare)) {
          financialSummary.setCapitalReservesPerShare(NumberUtil.parseBigDecimal(capitalReservesPerShare)); // 每股资本公积金
        }

        String mainRevenueGrowthRate = tds.get(8).text().replace("--", ""); // 主营收入增长率
        if (!StringUtil.isEmpty(mainRevenueGrowthRate)) {
          financialSummary.setMainRevenueGrowthRate(new Float(mainRevenueGrowthRate)); // 主营收入增长率
        }

        String netProfitGrowthRate = tds.get(9).text().replace("--", ""); // 净利润增长率
        if (!StringUtil.isEmpty(netProfitGrowthRate)) {
          financialSummary.setNetProfitGrowthRate(new Float(netProfitGrowthRate)); // 主营收入增长率
        }

        String netAssetsReturnRate = tds.get(10).text().replace("--", ""); // 净资产收益率
        if (!StringUtil.isEmpty(netAssetsReturnRate)) {
          financialSummary.setNetAssetsReturnRate(new Float(netAssetsReturnRate)); // 净资产收益率
        }

        financialSummarys.add(financialSummary);
      }
    }

    return financialSummarys;
  }

  /**
   * 
   * 資產負債表
   * 新浪财经
   * http://money.finance.sina.com.cn/corp/go.php/vFD_BalanceSheet/stockid/000651/ctrl/2016/displaytype/4.phtml
   * http://money.finance.sina.com.cn/corp/go.php/vDOWN_BalanceSheet/displaytype/4/stockid/000651/ctrl/all.phtml
   */
  public List<BalanceSheet> getBalanceSheetData(String stockcode, String year) {
    String url = "http://money.finance.sina.com.cn/corp/go.php/vFD_BalanceSheet/stockid/" + stockcode + "/ctrl/" + year + "/displaytype/4.phtml";
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
    String shortDate = "2017-03-31";
    FinancialSpiderFromSohu instance = new FinancialSpiderFromSohu();
    instance.getFinancialSummaryData(shortDate);
  }

}
