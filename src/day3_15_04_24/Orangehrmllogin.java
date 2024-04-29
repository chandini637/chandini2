package day3_15_04_24;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge. EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Orangehrmllogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//select[@id='day']/ancestor::*
	    Thread.sleep(2000);


	}

}
