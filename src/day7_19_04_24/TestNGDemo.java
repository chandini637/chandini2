package day7_19_04_24;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
      @BeforeSuite
      public void beforeSuite()  {
      System.out.println("beforeSuite");
      }
      @BeforeTest
      public void beforetest()  {
          System.out.println("beforetest");
          }
      @BeforeClass
      public void beforeclass()  {
          System.out.println("beforeclass");
          }
      @BeforeMethod
      public void beforemetho()  {
          System.out.println("beforemethod");
          }
      @Test
      public void test()  {
    	 	 System.out.println("testcase "); 
    	 	  }
      @AfterMethod
      public void aftermetho()  {
          System.out.println("afteremethod");
          }
      @AfterClass
      public void afterclass()  {
          System.out.println("afterclass");
          }
      @AfterTest
      public void aftertest()  {
          System.out.println("aftertest");
          }
      @AfterSuite
      public void afterSuite()  {
      System.out.println("afterSuite");
      }
      
      
      
      
      
      
}