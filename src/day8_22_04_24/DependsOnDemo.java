package day8_22_04_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnDemo {
	WebDriver driver;
     @Test
	public void openBrowser()  {
		System.out.println("Browser is opened");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(dependsOnMethods = {"openBrowser"})
	public void enterUrl()  {
		driver.get("https://www.facebook.com/");
		
	}
	
	
	
	
}
