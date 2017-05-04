package com.soak.invest.bond.dao.impl;

import java.util.List;

import com.soak.framework.dao.imp.JdbcDaoImp;
import com.soak.invest.bond.dao.BondDao;
import com.soak.invest.bond.model.Bond;

public class BondDaoImpl extends JdbcDaoImp implements BondDao {

  public void addBond(Bond... bond) {
    saveAnnotatedBean(bond);
  }
  
  public void addBonds(List<Bond> bonds) {
    saveAnnotatedBean(bonds);
  }

//  @Override
  public boolean wipeBonds() {
    return wipeTableData(Bond.class);
  }
}
