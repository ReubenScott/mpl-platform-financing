package com.soak.invest.finance.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  


/**
 * 損益表 
 * @author soak
 *
 */
@Entity
@Table(schema = "finance", name = "bond")
public class IncomeStatement implements Serializable{

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

  public Float getFacePrice() {
    return facePrice;
  }

  public void setFacePrice(Float facePrice) {
    this.facePrice = facePrice;
  }

  public Float getNetPrice() {
    return netPrice;
  }

  public void setNetPrice(Float netPrice) {
    this.netPrice = netPrice;
  }

  public Float getFullPrice() {
    return fullPrice;
  }

  public void setFullPrice(Float fullPrice) {
    this.fullPrice = fullPrice;
  }

  public Float getAccruedInterest() {
    return accruedInterest;
  }

  public void setAccruedInterest(Float accruedInterest) {
    this.accruedInterest = accruedInterest;
  }

  public Float getTurnVolume() {
    return turnVolume;
  }

  public void setTurnVolume(Float turnVolume) {
    this.turnVolume = turnVolume;
  }

  public Integer getInpaydays() {
    return inpaydays;
  }

  public void setInpaydays(Integer inpaydays) {
    this.inpaydays = inpaydays;
  }

  public Float getCouponRate() {
    return couponRate;
  }

  public void setCouponRate(Float couponRate) {
    this.couponRate = couponRate;
  }

  public String getBondCredit() {
    return bondCredit;
  }

  public void setBondCredit(String bondCredit) {
    this.bondCredit = bondCredit;
  }

  public String getMainCredit() {
    return mainCredit;
  }

  public void setMainCredit(String mainCredit) {
    this.mainCredit = mainCredit;
  }

  public String getAssukind() {
    return assukind;
  }

  public void setAssukind(String assukind) {
    this.assukind = assukind;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }
  
  

}
