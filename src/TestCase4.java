//package Pack1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class TestCase4 {
	  @Test
	  public void f()
	  {
		  System.out.println("f");
	  }
	  @BeforeClass
	  public void a()
	  {
		  System.out.println("a");
	  }
	  @AfterClass
	  public void b()
	  {
		  System.out.println("b");
	  }
	  @BeforeTest
	  public void c()
	  {
		  System.out.println("c");
	  }
	  @AfterTest
	  public void d()
	  {
		  System.out.println("d");
	  }
	 
}
