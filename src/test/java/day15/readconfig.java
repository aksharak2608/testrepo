package day15;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class readconfig {
@Test
public void readconfigdata()
{
	File src= new File(System.getProperty("user.dir")+"\\testdata\\config.properties");
	try {
		FileInputStream fis= new FileInputStream(src);
		Properties pro= new Properties();
		pro.load(fis);
		String url=(String)pro.getProperty("Url");
		String ver=pro.getProperty("version");
		System.out.println(url);
		System.out.println(pro.getProperty("Browser"));
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
}

}
