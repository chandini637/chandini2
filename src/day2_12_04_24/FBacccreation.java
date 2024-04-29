package day2_12_04_24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FBacccreation {

	public static void main(String[] args)  throws InterruptedException{
		 WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	       WebElement emailTxtBox=driver.findElement(By.id("email"));
	       emailTxtBox.sendKeys("chandini@gmail.com");
	       Thread.sleep(2000);
	       emailTxtBox.clear();
	       

	}

}
