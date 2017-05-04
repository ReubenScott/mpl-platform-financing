package com.soak.invest.finance.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  


/**
 * 财务摘要
 * @author soak
 *
 */
@Entity
@Table(schema = "finance", name = "bond")
public class FinancialSummary implements Serializable{

  private static final long serialVersionUID = 1L;
  
  @Id
  @Column
  private String code; // 代码

  @Column
  private String name; // 名称
  
  @Column
  private Float facePrice; // 面值

  @Column
  private Float netPrice; // 净价
  
  @Column
  private Float fullPrice; // 全价
  
  @Column
  private Float accruedInterest; // 应计利息
  
  @Column
  private Float turnVolume; // 成交额(万元)
  
  @Column
  private Integer inpaydays; // 距付息天数 Interest payment days
  
  @Column
  private Float couponRate; // 票息
  
  @Column
  private String bondCredit; // 债券信用
  
  @Column
  private String mainCredit; // 主体信用
  
  @Column
  private String assukind; // 担保方式
  
  @Column
  private Date dueDate; // 到期日
  
  @Column
  private Float amount; // 规模 (亿)


  
//  截止日期  2017-03-31
//  每股净资产   10.9369元
//  每股收益  0.3619元
//  每股现金含量  -6.6982元
//  每股资本公积金   3.2886元
//  固定资产合计   
//  流动资产合计   
//  资产总计  3,006,200,000,000.00元
//  长期负债合计   
//  主营业务收入  27,712,000,000.00元
//  财务费用   
//  净利润   6,214,000,000.00元
}
