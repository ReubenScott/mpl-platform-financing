package com.kindustry.invest.bond.dao;

import java.util.Date;
import java.util.List;

import com.kindustry.invest.bond.model.Bond;

public interface BondDao {
  
  public void deleteBondsByDate(Date sourceDate) ;
  
  public void addBond(Bond... bond);

  public void addBonds(List<Bond> bonds);
  
  // 清空 债券数据
  public boolean wipeBonds();
  
  
}