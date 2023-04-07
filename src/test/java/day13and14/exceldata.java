package day13and14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class exceldata {

	@Test
	public void readexcel()
	{
		System.out.println(System.getProperty("user.dir"));
		File src= new File(System.getProperty("user.dir")+"\\testdata\\testdataexcel.xlsx");
		try {
			FileInputStream fis= new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet ws= wb.getSheet("batchsep");
			XSSFRow r1= ws.getRow(1);
			XSSFCell c1=r1.getCell(1);
			System.out.println("data in the cell is " +c1);	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Test
	public void readexcel1()
	{
	
		try {
			
			System.out.println("data in the cell is " +new XSSFWorkbook(
					new FileInputStream(
							new File(System.getProperty("user.dir")+"\\testdata\\testdataexcel.xlsx")))
					.getSheet("batchsep").getRow(1).getCell(1).getNumericCellValue());	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
