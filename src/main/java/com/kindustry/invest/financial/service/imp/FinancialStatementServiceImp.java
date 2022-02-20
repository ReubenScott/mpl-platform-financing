package com.kindustry.invest.financial.service.imp;import java.util.List;import com.kindustry.invest.financial.dao.FinancialStatementDao;import com.kindustry.invest.financial.dao.imp.FinancialStatementDaoImp;import com.kindustry.invest.financial.model.BalanceSheet;import com.kindustry.invest.financial.model.FinancialSummary;import com.kindustry.invest.financial.service.FinancialStatementService;import com.kindustry.invest.financial.spider.FinancialSpiderFromSohu;import com.kindustry.invest.financial.spider.SpiderForFinancialStatement;public class FinancialStatementServiceImp implements FinancialStatementService {    private FinancialStatementDao financialStatementDao  = new FinancialStatementDaoImp();  @Override  public List<FinancialSummary> crawlingFinancialStatement(String stockcode) {    SpiderForFinancialStatement  instance = new SpiderForFinancialStatement();    List<FinancialSummary> financialSummarys = instance.getFinancialSummaryData(stockcode) ;    financialStatementDao.saveAnnotatedEntity(financialSummarys);    return financialSummarys;  }    /**   * 爬取财务摘要    */  public List<FinancialSummary> crawlingFinancialStatementFromSohu(String shortdate){    FinancialSpiderFromSohu  instance = new FinancialSpiderFromSohu();    List<FinancialSummary> financialSummarys = instance.getFinancialSummaryData(shortdate) ;    financialStatementDao.saveAnnotatedEntity(financialSummarys);    return financialSummarys;  }    /**   * 資產負債表   */  public List<BalanceSheet> crawlingBalanceSheet(String stockcode, String year) {    SpiderForFinancialStatement  instance = new SpiderForFinancialStatement();    List<BalanceSheet> balanceSheets = instance.getBalanceSheetData(stockcode,year) ;    financialStatementDao.saveAnnotatedEntity(balanceSheets);    return balanceSheets;  }    }