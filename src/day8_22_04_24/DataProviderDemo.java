package day8_22_04_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@Test(dataProvider="dataset")
	public void login(String un,String pass)
	{
		System.out.println("Username is==>"+un+" "+"Password is===>"+pass);
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	
    	
    	driver.findElement(By.name("username")).sendKeys(un);
    	driver.findElement(By.name("password")).sendKeys(pass);
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
    	driver.findElement(By.linkText("Logout")).click();
    	
    
    	
    	
    	
	}
	@DataProvider(name="dataset")
	public Object[][] dataMethod(){
	Object[][] obj=new Object[3][2];
	obj[0][0]="Admin";
	obj[0][1]="admin123";
	
	obj[1][0]="HrAdmin";
	obj[1][1]="hr123";
	

	obj[2][0]="abcd";
	obj[2][1]="abcd123";
    
	return obj;
	
		
		
	}

}
