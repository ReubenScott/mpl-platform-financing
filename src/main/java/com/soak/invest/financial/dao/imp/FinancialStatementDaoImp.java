package com.soak.invest.financial.dao.imp;import java.util.Date;import java.util.List;import com.soak.framework.dao.imp.JdbcDaoImp;import com.soak.invest.bond.dao.BondDao;import com.soak.invest.bond.model.Bond;import com.soak.invest.financial.dao.FinancialStatementDao;import com.soak.invest.financial.model.FinancialSummary;public class FinancialStatementDaoImp extends JdbcDaoImp implements FinancialStatementDao {      public void deleteBondsByDate(Date sourceDate){//    Bond example = new Bond();//    example.setSourceDate(sourceDate);//    jdbc.deleteAnnotatedBean(example);    jdbc.execute("delete from finance.bond where src_dt = ? ", sourceDate);  };  public void addBond(Bond... bond) {    saveAnnotatedBean(bond);  }    public void addBonds(List<Bond> bonds) {    saveAnnotatedBean(bonds);  }//  @Override  public boolean wipeBonds() {    return wipeTableData(Bond.class);  }      @Override  public void addFinancialSummary(FinancialSummary... financialSummary) {    // TODO Auto-generated method stub      }    @Override  public void addFinancialSummarys(List<FinancialSummary> financialSummarys) {    // TODO Auto-generated method stub      }      }