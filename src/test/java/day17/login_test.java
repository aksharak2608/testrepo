package day17;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.helper;

public class login_test {
	@Test
	public void test()
	{
		WebDriver driver = null;
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver=helper.LaunchBrowser(url, driver);
		login login_obj=new login(driver);
		login_obj.enterUserName("Admin");
		login_obj.enterpassword("admin123");
		login_obj.submit();
	}

}
