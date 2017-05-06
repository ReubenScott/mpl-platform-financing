package com.soak.invest.financial.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 資產負債表
 * 
 * @author soak
 * 
 */
@Entity
@Table(schema = "finance", name = "balance_sheet")
public class BalanceSheet implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column
  private String code; // 代码

  @Column
  private String name; // 名称

  @Column(name = "bank_and_cash")
  private Float bankAndCash; // 货币资金
  // 存放中央银行款 -- -- -- -- --
  // 结算准备金 -- -- -- -- --
  // 贵金属 10,813,700.00 9,378,700.00 10,148,200.00 9,217,300.00 6,934,900.00
  // 存放同业款项 17,306,600.00 16,688,200.00 12,307,800.00 15,813,000.00 18,087,100.00
  // 拆出资金 6,900,900.00 9,745,000.00 5,017,200.00 6,707,000.00 8,721,200.00
  // 其中:拆放同业 -- -- -- -- --
  // 拆放金融性公司 -- -- -- -- --
  // 存放联行款项 -- -- -- -- --
  // 存出发钞基金 -- -- -- -- --
  // 衍生金融工具资产 418,800.00 873,000.00 583,200.00 1,160,300.00 767,600.00
  // 交易性金融资产 4,404,400.00 5,717,900.00 1,598,400.00 4,114,800.00 3,706,000.00
  // 买入返售金融资产 81,000.00 887,600.00 3,765,500.00 5,216,200.00 3,404,500.00
  // 贴现 -- -- -- -- --
  // 进出口押汇 -- -- -- -- --
  // 应收账款 522,600.00 556,800.00 570,400.00 612,200.00 580,300.00
  // 预付账款 -- -- -- -- --
  // 应收利息 1,707,100.00 1,577,000.00 1,347,100.00 1,411,600.00 1,441,000.00
  // 发放贷款及垫款<客户贷款> 154,816,200.00 147,580,100.00 143,051,400.00 135,802,100.00 126,278,600.00
  // 减:贷款损失准备 4,397,800.00 3,993,200.00 3,666,000.00 3,408,600.00 3,180,100.00
  // 代理业务资产 -- -- -- -- --
  // 可供出售金融资产 123,800.00 117,900.00 150,200.00 128,000.00 274,600.00
  // 持有至到期投资 29,143,300.00 28,680,200.00 28,286,200.00 28,459,800.00 28,927,600.00
  // 其他应收款 -- -- -- -- --
  // 长期应收款 -- -- -- -- --
  // 长期股权投资 -- -- 54,200.00 54,200.00 52,100.00
  // 其中:投资子公司 -- -- -- -- --
  // 投资性房地产 22,100.00 22,100.00 21,100.00 22,800.00 22,900.00
  // 应收投资款项 46,528,000.00 41,427,800.00 40,827,300.00 42,629,200.00 38,456,800.00
  // 待摊费用 -- -- -- -- --
  // 固定资产净额 811,900.00 831,600.00 740,700.00 531,000.00 465,000.00
  // 在建工程 -- -- -- -- --
  // 固定资产清理 -- -- -- -- --
  // 无形资产 473,400.00 477,100.00 463,100.00 474,100.00 483,800.00
  // 商誉 756,800.00 756,800.00 756,800.00 756,800.00 756,800.00
  // 长期待摊费用 -- -- -- -- --
  // 待处理抵债资产 -- -- -- -- --
  // 减:抵债资产减值准备 -- -- -- -- --
  // 待处理抵债资产净额 -- -- -- -- --
  // 递延税款借项 1,893,500.00 1,783,100.00 1,336,100.00 1,173,200.00 973,200.00
  // 其他资产 1,339,100.00 1,109,900.00 1,371,300.00 1,405,500.00 1,347,200.00
  // 减:不良资产处置损失专项准备 -- -- -- -- --
  // 资产总计 300,619,500.00 295,343,400.00 279,123,800.00 280,098,300.00 268,115,500

  private int error_code;// 返回码
  private String reason;// 返回说明
  private String reportType;// 报告类型
  private String secID;// 证券内部ID
  private Date endDate;// 截止日期
  private Date publishDate;// 发布日期
  private Date endDateRep;// 报表截止日期
  private int partyID;// 机构内部ID
  private String ticker;// 股票代码
  private String secShortName;// 证券简称
  private String exchangeCD;// 交易市场代码
  private String actPubtime;// 实际披露时间
  private String mergedFlag;// 合并标志
  private String fiscalPeriod;// 会计期间
  private String accoutingStandards;// 会计准则
  private String currencyCD;// 货币代码
  private double loanToOthBankFi;// 拆出资金
  private double tradingFA;// 交易性金融资产
  private double intReceiv;// 应收利息
  private double purResaleFa;// 买入返售金融资产
  private double disburLA;// 发放委托贷款及垫款
  private double availForSaleFA;// 可供出售金融资产
  private double htmInvest;// 持有至到期投资
  private double LTEquityInvest;// 长期股权投资
  private double investRealEstate;// 投资性房地产
  private double fixedAssets;// 固定资产
  private double CIP;// 在建工程
  private double intanAssets;// 无形资产
  private double goodwill;// 商誉
  private double deferTaxAssets;// 递延所得税资产
  private double CReserCB;// 现金及存放中央银行款项
  private double deposInOthBfi;// 存放同业款项
  private double preciMetals;// 贵金属
  private double derivAssets;// 衍生金融资产
  private double finanLeaseReceiv;// 应收融资租赁款
  private double investAsReceiv;// 应收款项类投资
  private double othAssets;// 其他资产
  private double TAssets;// 资产总计
  private double CBBorr;// 向中央银行借款
  private double depos;// 吸收存款
  private double loanFrOthBankFi;// 拆入资金
  private double tradingFL;// 交易性金融负债
  private double soldForRepurFa;// 卖出回购金融资产款
  private double payrollPayable;// 应付职工薪酬
  private double taxesPayable;// 应交税费
  private double intPayable;// 应付利息
  private double bondPayable;// 应付债券
  private double estimatedLiab;// 预计负债
  private double deferTaxLiab;// 递延所得税负债
  private double deposFrOthBfi;// 同业及其他金融机构存放款项
  private double derivLiab;// 衍生金融负债
  private double othLiab;// 其他负债
  private double TLiab;// 负债合计
  private double paidInCapital;// 实收资本(或股本)
  private double capitalReser;// 资本公积
  private double treasuryShare;// 减:库存股
  private double surplusReser;// 盈余公积
  private double ordinRiskReser;// 一般风险准备
  private double retainedEarnings;// 未分配利润
  private double forexDiffer;// 外币报表折算差额
  private double TEquityAttrP;// 归属于母公司所有者权益合计
  private double minorityInt;// 少数股东权益
  private double TShEquity;// 所有者权益合计
  private double TLiabEquity;// 负债和所有者权益总计
  
  

}
