package com.kindustry.invest.bond.dao.imp;

import java.util.Date;
import java.util.List;

import com.kindustry.framework.dao.imp.JdbcDaoImp;
import com.kindustry.invest.bond.dao.BondDao;
import com.kindustry.invest.bond.model.Bond;

public class BondDaoImp extends JdbcDaoImp implements BondDao {
  
  
  public void deleteBondsByDate(Date sourceDate){
//    Bond example = new Bond();
//    example.setSourceDate(sourceDate);
//    jdbc.deleteAnnotatedBean(example);
    jdbc.execute("delete from finance.bond where src_dt = ? ", sourceDate);
  };

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
