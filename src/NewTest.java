//package Pack1;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest {
	@Test(priority=3, enabled=false)
	  public void c_test()
	  
	  {
		  //Assert.fail();
		Assert.assertTrue(true);
	  }
	  @Test(priority=0, enabled=true)
	  public void d_test()
	  {
		  Assert.assertTrue(true);
	  }
	  @Test(priority=8)
	  public void b_test()
	  {
		  Assert.assertTrue(true);
		 //throw new SkipException("Skipping b test....");
	  }
	  
}
