package day13and14;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class exceldatamultiplerecords {

	@Test
	public void readexcel()
	{
		System.out.println(System.getProperty("user.dir"));
		File src= new File(System.getProperty("user.dir")+"\\testdata\\testdataexcel.xlsx");
		try {
			FileInputStream fis= new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet ws= wb.getSheet("batchsep");
			int row_count=ws.getPhysicalNumberOfRows();
			for(int i=1;i<row_count;i++)
			{
				XSSFRow r= ws.getRow(i);
				int cell_count=r.getPhysicalNumberOfCells();
				for(int j=0;j<cell_count;j++)
				{
				
				r.getCell(j);
				System.out.println("data in the cell is " +r.getCell(j));
				}
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}		
	
	
}
