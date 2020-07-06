//package Pack
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestCase6 {
	@Test
	  public void f_test()
	  {
		  System.out.println("f");
	  }
	  @Test
	  public void atest()
	  {
		  System.out.println("a");
	  }
	  @Test
	  public void ztest()
	  {
		  System.out.println("b");
	  }
	  @Test
	  public void b_test()
	  {
		  System.out.println("c");
	  }
	  @Test(enabled=false)
	  public void d_test()
	  {
		  System.out.println("d");
	  }
	 
}
