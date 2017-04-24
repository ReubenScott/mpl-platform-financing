package com.soak.invest.bond.dao.impl;

import com.soak.framework.dao.imp.JdbcDaoImp;
import com.soak.invest.bond.dao.BondDao;
import com.soak.invest.bond.model.Bond;

public class BondDaoImpl extends JdbcDaoImp implements BondDao {

  public void addBond(Bond bond) {
    saveAnnotatedBean(bond);
  }

  @Override
  public boolean wipeBonds() {
    wipe(Bond.class);
    return true;
  }
}
