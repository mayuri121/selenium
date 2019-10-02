package javaprogaram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readExcelTest {
  @Test
  public void f() throws IOException {
	  String filepath = System.getProperty("user.dir")+"\\test data\\OrangeHRM_TestCases.xlsx";
	  //FileInputStream fis=new FileInputStream("F:\\selenium software\\MavenImplementation\\test data\\ReadExcelData.xlsx");
	  String Sheetname="hrm";
	  File f=new File(filepath);
	 FileInputStream is=new FileInputStream(f);
	  Workbook wb=null;
	  Sheet sheet=null;
	  Row row=null;
	  Cell cell=null;
	  if(filepath.endsWith(".xls"))
		  wb=new HSSFWorkbook(is);
	  else if(filepath.endsWith(".xlsx"))
		  wb=new XSSFWorkbook(is);
	  sheet=wb.getSheet("hrm");
	  int nr=sheet.getLastRowNum();
	  for(int i=0;i<=nr;i++)
	  {
		  cell=sheet.getRow(i).getCell(3);
		  switch(cell.getCellType()) {
		  case NUMERIC:
			  System.out.println(cell.getNumericCellValue()+"(intger)/t");
			  break;
		  case STRING:
			  
			  System.out.println(cell.getStringCellValue()+"(string)/t");
			  break;
		  case BOOLEAN:
			  
			  System.out.println(cell.getBooleanCellValue() + "(boolean)/t");
			  default:
				  System.out.println("unknown");
				  break;
		  }
		  System.out.println();
		  
	  }
		  
	  
	  
	  
  }
}
