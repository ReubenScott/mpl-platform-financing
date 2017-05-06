package com.soak.invest.financial.service.imp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.soak.common.io.FileUtil;
import com.soak.invest.financial.service.FinancialStatementService;

public class FinancialStatementServiceImpTest {

  FinancialStatementService financialStatementService = new FinancialStatementServiceImp();

  String stockCode = "000001";

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void testCrawlingFinancialStatement() {
//    financialStatementService.crawlingFinancialStatement("000651");
    financialStatementService.crawlingFinancialStatementFromSohu("2017-03-31");
    
  }

//  @Test
  public void testCrawlingBalanceSheet() {
    financialStatementService.crawlingBalanceSheet("000651","2016");
  }
  
//  @Test
  public void testDownloadExcel() {
    String url = "http://money.finance.sina.com.cn/corp/go.php/vDOWN_BalanceSheet/displaytype/4/stockid/601088/ctrl/all.phtml" ;
    FileUtil.downloadFile(url, "D:\\未命名.xls");
  }
  

//  /**
//   * 下载文件
//   * 
//   */
//  public static void downLoadAcesssory(String url) {
//    HttpServletResponse response = ServletActionContext.getResponse();
//    response.reset(); // 非常重要 清空输出流
//    InputStream is = null;
//    OutputStream os = null;
//    try {
//      String fileDirectory = ServletActionContext.getServletContext().getRealPath("UploadFiles");
//      String tableFileName = ServletActionContext.getRequest().getParameter("fileUrl");
//      tableFileName = new String(tableFileName.getBytes("iso-8859-1"), "utf-8");
//      String fileUrl = fileDirectory + "\\" + file + "\\" + tableFileName;
//      String uploadFileName = tableFileName.substring(0, tableFileName.indexOf("_")) + tableFileName.substring(tableFileName.lastIndexOf("."));
//
//      // 设定输出文件头
//      // response.setContentType("application/msexcel");// 定义输出类型
//      response.setContentType("application/x-msdownload;charset='utf-8'");
//      response.setHeader("Content-Disposition", "attachment; filename=\"" + new String(uploadFileName.getBytes("gbk"), "iso-8859-1") + "");
//
//      is = new BufferedInputStream(new FileInputStream(fileUrl));
//      os = response.getOutputStream();
//      byte[] bytes = new byte[1024];
//      int temp = 0;
//      while ((temp = is.read(bytes)) != -1) {
//        os.write(bytes, 0, temp);
//      }
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    } finally {
//      if (is != null) {
//        try {
//          is.close();
//        } catch (IOException e) {
//          e.printStackTrace();
//        }
//      }
//      if (os != null) {
//        try {
//          os.flush();
//          os.close();
//        } catch (IOException e) {
//          e.printStackTrace();
//        }
//      }
//    }
//  }

}
