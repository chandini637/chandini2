package day8_22_04_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Orangehrm {

	WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
		driver=new ChromeDriver();
		System.out.println("browser opened");
	}
	@Test
	public void Loginfunctionality() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		System.out.println("Website opened");
	}
	@Test(dataProvider="dataset")
	public void login(String un,String pass)
	{
		System.out.println("Username is==>"+un+" "+"Password is===>"+pass);
	}
	@DataProvider(name="dataset")
	public Object[][] dataMethod(){
	Object[][] obj=new Object[1][2];
	obj[0][0]="Admin";
	obj[0][1]="admin123";
   return obj;
	}	
	@AfterSuite
	public void closeBrowse() {
	driver.close();
		System.out.println("Browser closed");

	}
}
