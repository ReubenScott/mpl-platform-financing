package com.kindustry.invest.financial.dao;import java.util.List;import com.kindustry.framework.dao.IBasicDao;import com.kindustry.invest.financial.model.FinancialSummary;public interface FinancialStatementDao extends IBasicDao {    public void addFinancialSummary(FinancialSummary... financialSummary);  public void addFinancialSummarys(List<FinancialSummary> financialSummarys);    }