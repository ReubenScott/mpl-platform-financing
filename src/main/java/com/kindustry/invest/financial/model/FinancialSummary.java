package com.kindustry.invest.financial.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.kindustry.common.constant.CurrencyType;

/**
 * 财务摘要
 * 
 * @author soak
 * 
 */
@Entity
@Table(schema = "finance", name = "financial_summary")
public class FinancialSummary implements Serializable {

  private static final long serialVersionUID = 1L;

  // 报表所属期间之期末时间点 Period Ended
  // 所属月份 Reporting Period
  // 报出日期 Submit Date
  // 记账本位币币种 Local Reporting Currency
  // 审核人 Verifier
  // 填表人 Preparer

  @Id
  @Column(name = "stat_date")
  private String statDate; // 统计日期 2017-03-31

  @Id
  @Column
  private String code; // 代码

  @Column
  private String name; // 名称

  @Column
  private String currency; // 币种

  @Column(name = "net_asset_per_share")
  private BigDecimal netAssetPerShare; // 每股净资产 Net Asset Value per Share

  @Column(name = "earnings_per_share")
  private BigDecimal earningsPerShare; // 每股收益

  @Column(name = "cash_per_share")
  private BigDecimal cashPerShare; // 每股现金含量

  @Column(name = "capital_reserves_per_share")
  private BigDecimal capitalReservesPerShare; // 每股资本公积金

  @Column(name = "net_fixed_assets")
  private BigDecimal netFixedAssets; // 固定资产合计

  @Column(name = "total_current_assets")
  private BigDecimal totalCurrentAssets; // 流动资产合计

  @Column(name = "total_assets")
  private BigDecimal totalAssets; // 资产总计

  @Column(name = "total_longterm_liability")
  private BigDecimal totalLongtermLiability; // 长期负债合计

  @Column(name = "revenue")
  private BigDecimal revenue; // 主营业务收入

  @Column(name = "finance_expense")
  private BigDecimal financeExpense; // 财务费用

  @Column(name = "net_profit")
  private BigDecimal netProfit; // 净利润

  @Column(name = "main_revenue_growth_rate")
  private Float mainRevenueGrowthRate; // 主营收入增长率

  @Column(name = "net_profit_growth_rate")
  private Float netProfitGrowthRate; // 净利润增长率

  @Column(name = "net_assets_return_rate")
  private Float netAssetsReturnRate; // 净资产收益率
  
  

  public String getStatDate() {
    return statDate;
  }

  public void setStatDate(String statDate) {
    this.statDate = statDate;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BigDecimal getNetAssetPerShare() {
    return netAssetPerShare;
  }

  public void setNetAssetPerShare(BigDecimal netAssetPerShare) {
    this.netAssetPerShare = netAssetPerShare;
  }

  public BigDecimal getEarningsPerShare() {
    return earningsPerShare;
  }

  public void setEarningsPerShare(BigDecimal earningsPerShare) {
    this.earningsPerShare = earningsPerShare;
  }

  public BigDecimal getCashPerShare() {
    return cashPerShare;
  }

  public void setCashPerShare(BigDecimal cashPerShare) {
    this.cashPerShare = cashPerShare;
  }

  public BigDecimal getCapitalReservesPerShare() {
    return capitalReservesPerShare;
  }

  public void setCapitalReservesPerShare(BigDecimal capitalReservesPerShare) {
    this.capitalReservesPerShare = capitalReservesPerShare;
  }

  public BigDecimal getNetFixedAssets() {
    return netFixedAssets;
  }

  public void setNetFixedAssets(BigDecimal netFixedAssets) {
    this.netFixedAssets = netFixedAssets;
  }

  public BigDecimal getTotalCurrentAssets() {
    return totalCurrentAssets;
  }

  public void setTotalCurrentAssets(BigDecimal totalCurrentAssets) {
    this.totalCurrentAssets = totalCurrentAssets;
  }

  public BigDecimal getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(BigDecimal totalAssets) {
    this.totalAssets = totalAssets;
  }

  public BigDecimal getTotalLongtermLiability() {
    return totalLongtermLiability;
  }

  public void setTotalLongtermLiability(BigDecimal totalLongtermLiability) {
    this.totalLongtermLiability = totalLongtermLiability;
  }

  public BigDecimal getRevenue() {
    return revenue;
  }

  public void setRevenue(BigDecimal revenue) {
    this.revenue = revenue;
  }

  public BigDecimal getFinanceExpense() {
    return financeExpense;
  }

  public void setFinanceExpense(BigDecimal financeExpense) {
    this.financeExpense = financeExpense;
  }

  public BigDecimal getNetProfit() {
    return netProfit;
  }

  public void setNetProfit(BigDecimal netProfit) {
    this.netProfit = netProfit;
  }

  public Float getMainRevenueGrowthRate() {
    return mainRevenueGrowthRate;
  }

  public void setMainRevenueGrowthRate(Float mainRevenueGrowthRate) {
    this.mainRevenueGrowthRate = mainRevenueGrowthRate;
  }

  public Float getNetProfitGrowthRate() {
    return netProfitGrowthRate;
  }

  public void setNetProfitGrowthRate(Float netProfitGrowthRate) {
    this.netProfitGrowthRate = netProfitGrowthRate;
  }

  public Float getNetAssetsReturnRate() {
    return netAssetsReturnRate;
  }

  public void setNetAssetsReturnRate(Float netAssetsReturnRate) {
    this.netAssetsReturnRate = netAssetsReturnRate;
  }

  
  
}
