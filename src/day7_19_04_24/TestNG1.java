package day7_19_04_24;

import org.testng.annotations.Test;

public class TestNG1
{
	
	
	@Test
    public void test()  {
 	 System.out.println("test method "); 
 	 
  }
     @Test
       public void test1()  {
    	 System.out.println("test method 1");
    	 
     }
     @Test(priority=2,invocationCount=3)
     public void test2()  {
  	 System.out.println("test method 2");
     
     }
     @Test(priority=1)
     public void test3()  {
  	 System.out.println("test method 3");
     
     }
     @Test
     public void test4()  {
      	 System.out.println("test method 4");
         
         }
     @Test(priority=-1)
     public void test5()  {
      	 System.out.println("test method 5");
         
         }
     
     
     
     
     
     
     
	}


