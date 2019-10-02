package javaprogaram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class iteratorNewTest {
  @Test
  public void f() throws IOException {
	  String filepath=System.getProperty("user.dir") +"\\test data\\ReadExcelData.xlsx";
	  String sheetname="test";
	  File f=new File(filepath);
	  FileInputStream is=new FileInputStream(f);
	  Workbook wb = null;
		org.apache.poi.ss.usermodel.Sheet sh= null;
		Row row = null;
		Cell cell = null;
		if(filepath.endsWith(".xls"))
	  wb=new HSSFWorkbook(is);
		else if(filepath.endsWith(".xlsx"))
			wb=new XSSFWorkbook(is);
		sh=wb.getSheet("test");
		Iterator<Row> rowIte=sh.iterator();
		while (rowIte.hasNext())
			
		{
			Iterator<Cell> cellIter=rowIte.next().iterator();
			while(cellIter.hasNext()) {
				cell=cellIter.next();
				switch(cell.getCellType())
				{
				case NUMERIC:
					System.out.println(cell.getNumericCellValue() +"(integer)/t");
					break;
				case STRING:
					System.out.println(cell.getStringCellValue() +"(string)/t");
					break;
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue() +"(boolean)/t");
					default:
						System.out.println("unknown");
						break;
						
					
					
				}
			}
			System.out.println();
		}
		
  }
}
