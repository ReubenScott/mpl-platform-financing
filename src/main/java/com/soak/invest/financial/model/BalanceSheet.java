package com.soak.invest.financial.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  


/**
 * 資產負債表 
 * @author soak
 *
 */
@Entity
@Table(schema = "finance", name = "bond")
public class BalanceSheet implements Serializable{

  private static final long serialVersionUID = 1L;
  
  @Id
  @Column
  private String code; // 代码

  @Column
  private String name; // 名称
  

  @Column(name = "bank_and_cash")
  private Float bankAndCash ;  //  货币资金  
//  存放中央银行款 --  --  --  --  --
//  结算准备金 --  --  --  --  --
//  贵金属 10,813,700.00 9,378,700.00  10,148,200.00 9,217,300.00  6,934,900.00
//  存放同业款项  17,306,600.00 16,688,200.00 12,307,800.00 15,813,000.00 18,087,100.00
//  拆出资金  6,900,900.00  9,745,000.00  5,017,200.00  6,707,000.00  8,721,200.00
//  其中:拆放同业 --  --  --  --  --
//  拆放金融性公司 --  --  --  --  --
//  存放联行款项  --  --  --  --  --
//  存出发钞基金  --  --  --  --  --
//  衍生金融工具资产  418,800.00  873,000.00  583,200.00  1,160,300.00  767,600.00
//  交易性金融资产 4,404,400.00  5,717,900.00  1,598,400.00  4,114,800.00  3,706,000.00
//  买入返售金融资产  81,000.00 887,600.00  3,765,500.00  5,216,200.00  3,404,500.00
//  贴现  --  --  --  --  --
//  进出口押汇 --  --  --  --  --
//  应收账款  522,600.00  556,800.00  570,400.00  612,200.00  580,300.00
//  预付账款  --  --  --  --  --
//  应收利息  1,707,100.00  1,577,000.00  1,347,100.00  1,411,600.00  1,441,000.00
//  发放贷款及垫款<客户贷款> 154,816,200.00  147,580,100.00  143,051,400.00  135,802,100.00  126,278,600.00
//  减:贷款损失准备  4,397,800.00  3,993,200.00  3,666,000.00  3,408,600.00  3,180,100.00
//  代理业务资产  --  --  --  --  --
//  可供出售金融资产  123,800.00  117,900.00  150,200.00  128,000.00  274,600.00
//  持有至到期投资 29,143,300.00 28,680,200.00 28,286,200.00 28,459,800.00 28,927,600.00
//  其他应收款 --  --  --  --  --
//  长期应收款 --  --  --  --  --
//  长期股权投资  --  --  54,200.00 54,200.00 52,100.00
//  其中:投资子公司  --  --  --  --  --
//  投资性房地产  22,100.00 22,100.00 21,100.00 22,800.00 22,900.00
//  应收投资款项  46,528,000.00 41,427,800.00 40,827,300.00 42,629,200.00 38,456,800.00
//  待摊费用  --  --  --  --  --
//  固定资产净额  811,900.00  831,600.00  740,700.00  531,000.00  465,000.00
//  在建工程  --  --  --  --  --
//  固定资产清理  --  --  --  --  --
//  无形资产  473,400.00  477,100.00  463,100.00  474,100.00  483,800.00
//  商誉  756,800.00  756,800.00  756,800.00  756,800.00  756,800.00
//  长期待摊费用  --  --  --  --  --
//  待处理抵债资产 --  --  --  --  --
//  减:抵债资产减值准备  --  --  --  --  --
//  待处理抵债资产净额 --  --  --  --  --
//  递延税款借项  1,893,500.00  1,783,100.00  1,336,100.00  1,173,200.00  973,200.00
//  其他资产  1,339,100.00  1,109,900.00  1,371,300.00  1,405,500.00  1,347,200.00
//  减:不良资产处置损失专项准备  --  --  --  --  --
//  资产总计  300,619,500.00  295,343,400.00  279,123,800.00  280,098,300.00  268,115,500
  
  
  
}
