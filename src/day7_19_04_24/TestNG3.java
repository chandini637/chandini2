package day7_19_04_24;


	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.annotations.AfterSuite;

	import org.testng.annotations.BeforeSuite;

	import org.testng.annotations.Test;

	public class TestNG3 {

	

		WebDriver driver;

		

		@BeforeSuite

		public void openBrowser() {

			driver=new ChromeDriver();

			System.out.println("browser opened");

		}

		

		@Test

		public void Loginfunctionality() {

			driver.get("https://practicetestautomation.com/practice-test-login/");

			System.out.println("Website opened");

			driver.findElement(By.id("username")).sendKeys("student");

			driver.findElement(By.id("password")).sendKeys("Password123");

			driver.findElement(By.id("submit")).click();
			

		}

		

		@AfterSuite

		public void clloseBrowse() {

			driver.close();

			System.out.println("Browser closed");

		}

	 

	}

