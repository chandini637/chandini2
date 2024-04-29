package day5_17_04_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkshopDemo {

	public static void main(String[] args) {

		 WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();

	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get("https://demowebshop.tricentis.com/");
	       driver.findElement(By.linkText("Log in")).click();
	        driver.findElement(By.linkText("Email")).sendKeys("chandiniappikonda@gmail.com");
	        driver.findElement(By.linkText("Password")).sendKeys("chandini");
	        driver.close();
	        }

}
