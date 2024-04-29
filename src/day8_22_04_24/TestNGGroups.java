package day8_22_04_24;

import org.testng.annotations.Test;

public class TestNGGroups 
{
	@Test(groups= {"Smoke"})
	public void test()  {
	System.out.println("test method");
	}
	@Test(groups= {"Smoke","Sanity"})
	public void test1()  {
	System.out.println("test 1");
	}
	@Test(groups= {"Smoke"})
	public void test2()  {
	System.out.println("test 2");
	}
	@Test(groups= {"Sanity"})
	public void test3()  {
	System.out.println("test 3");
	}
	@Test(groups= {"Regression"})
	public void test4()  {
	System.out.println("test 4");
	}
	@Test(groups= {"Regression","Sanity"})
	public void test5()  {
	System.out.println("test 5");
	}
	@Test(groups= {"Regression"})
	public void test6()  {
	System.out.println("test 6");
	}
	
	
	
	

}
