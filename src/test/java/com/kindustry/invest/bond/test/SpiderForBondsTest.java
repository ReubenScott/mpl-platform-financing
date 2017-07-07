package com.kindustry.invest.bond.test;

import java.util.List;
import org.junit.Test;

import com.kindustry.common.date.DateUtil;
import com.kindustry.invest.bond.dao.BondDao;
import com.kindustry.invest.bond.dao.imp.BondDaoImp;
import com.kindustry.invest.bond.model.Bond;
import com.kindustry.invest.bond.spider.SpiderForBonds;

public class SpiderForBondsTest {

  @Test
  public void testGetBonds() {
    BondDao bondDao = new BondDaoImp();
    bondDao.deleteBondsByDate(DateUtil.getCurrentShortDate());
    SpiderForBonds splider = new SpiderForBonds();
    List<Bond> bonds = splider.getBonds();
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
