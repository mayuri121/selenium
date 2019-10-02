package javaprogaram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class createexclesheetTest {
  @Test
  public void f() throws IOException {
	  String filepath=System.getProperty("user.dir")+ "\\test data\\excelsheet1.xlsx";
	  File f=new File(filepath);
	  Workbook wb=null;
	  org.apache.poi.ss.usermodel.Sheet sh=null;
	  Row row=null;
	  Cell cell=null;
	  if(filepath.endsWith(".xls"))
		  wb=new HSSFWorkbook();
	  else if(filepath.endsWith(".xlsx"))
		  wb=new XSSFWorkbook();
	  sh=wb.createSheet("testsheet");
	  for(int i=0;i<10;i++)
	  
	  {
		  row=sh.createRow(i);
		  for(int j=0;j<10;j++)
		  {
			  cell=row.createCell(j);
			  cell.setCellValue("test"+i+j);
			  
		  }
	  }
		FileOutputStream os=new FileOutputStream(f);
		wb.write(os);
		wb.close();
		
		  
  }
}
