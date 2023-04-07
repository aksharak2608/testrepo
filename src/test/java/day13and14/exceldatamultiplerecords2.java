package day13and14;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class exceldatamultiplerecords2 {

	@Test
	public void readexcel()
	{
		System.out.println(System.getProperty("user.dir"));
		
		try {
			
			@SuppressWarnings("resource")
			int row_count=new XSSFWorkbook(
	    			new FileInputStream(new File(System.getProperty("user.dir")+"\\testdata\\testdataexcel.xlsx")))
					.getSheet("batchsep").getPhysicalNumberOfRows();
			for(int i=1;i<row_count;i++)
			{
				
				int cell_count=new XSSFWorkbook(
		    			new FileInputStream(new File(System.getProperty("user.dir")+"\\testdata\\testdataexcel.xlsx")))
						.getSheet("batchsep").getRow(i).getPhysicalNumberOfCells();
				for(int j=0;j<cell_count;j++)
				{
				
					XSSFCell op=new XSSFWorkbook(
			    			new FileInputStream(new File(System.getProperty("user.dir")+"\\testdata\\testdataexcel.xlsx")))
							.getSheet("batchsep").getRow(i).getCell(j);
				System.out.println("data in the cell is " +op.toString());
				}
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}		
	
	
}
