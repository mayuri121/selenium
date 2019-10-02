package javaprogaram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class datadrivenTest {
  @Test
  public void f() throws IOException {
	  FileInputStream fis=new FileInputStream("F:\\selenium software\\MavenImplementation\\test data\\ReadExcelData.xlsx");
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);
	  XSSFSheet sheet=workbook.getSheet("test");
	  for (int i=0;i<=sheet.getLastRowNum();i++) 
	  {
	  System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
  }
}
}