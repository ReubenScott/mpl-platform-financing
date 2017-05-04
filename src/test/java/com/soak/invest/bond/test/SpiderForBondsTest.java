package com.soak.invest.bond.test;

import java.util.List;
import org.junit.Test;

import com.soak.invest.bond.dao.BondDao;
import com.soak.invest.bond.dao.impl.BondDaoImpl;
import com.soak.invest.bond.model.Bond;
import com.soak.invest.bond.spider.SpiderForBonds;

public class SpiderForBondsTest {

  @Test
  public void testGetBonds() {
    SpiderForBonds splider = new SpiderForBonds();
    List<Bond> bonds = splider.getBonds();
    BondDao bondDao = new BondDaoImpl();
    bondDao.wipeBonds();
    bondDao.addBonds(bonds);

  }

  // public void batchAddExamlog(List examlogList) throws SQLException {
  // SqlMapClient smc = this.getSqlMapClient();
  // try {
  // smc.startTransaction();
  // smc.startBatch();
  // for (Iterator iter = examlogList.iterator(); iter.hasNext();) {
  // Examlog log = (Examlog) iter.next();
  // smc.update("insertExamlog", log);
  // }
  // smc.executeBatch();
  // } finally {
  // smc.commitTransaction();
  // smc.endTransaction();
  // }
  // }

}
