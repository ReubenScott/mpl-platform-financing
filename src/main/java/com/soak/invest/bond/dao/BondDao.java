package com.soak.invest.bond.dao;

import java.util.List;

import com.soak.invest.bond.model.Bond;

public interface BondDao {
  
  public void addBond(Bond... bond);

  public void addBonds(List<Bond> bonds);
  
  // 清空 债券数据
  public boolean wipeBonds();
  
  
}