package com.kindustry.invest.bond.dao.imp;

import java.util.Date;
import java.util.List;

import com.kindustry.framework.dao.imp.BasicDaoImp;
import com.kindustry.invest.bond.dao.BondDao;
import com.kindustry.invest.bond.model.Bond;

public class BondDaoImp extends BasicDaoImp implements BondDao {
  
  
  public void deleteBondsByDate(Date sourceDate){
//    Bond example = new Bond();
//    example.setSourceDate(sourceDate);
//    jdbc.deleteAnnotatedBean(example);
    jdbcTemplate.execute("delete from finance.bond where src_dt = ? ", sourceDate);
  };

  public void addBond(Bond... bond) {
    saveAnnotatedEntity(bond);
  }
  
  public void addBonds(List<Bond> bonds) {
    saveAnnotatedEntity(bonds);
  }

//  @Override
  public boolean wipeBonds() {
    return wipeTableData(Bond.class);
  }
}
