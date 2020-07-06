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

public class NewTestTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }


  @Test
  public void aTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void a_testTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void atestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void bTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void b_testTest() {
    throw new RuntimeException("Test not implemented");
  }

 

  @Test
  public void beforeTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void cTest() {
    throw new RuntimeException("Test not implemented");
  }
  @Test
  public void dTest() {
    throw new RuntimeException("Test not implemented");
  }
  @Test
  public void d_testTest() {
    throw new RuntimeException("Test not implemented");
  }
  @Test
  public void fTest() {
    throw new RuntimeException("Test not implemented");
  }


  @Test
  public void f_testTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void goBackToHomepageTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void launchBrowserTest() {
    throw new RuntimeException("Test not implemented");
  }


  @Test
  public void registerTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void supportTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void terminateBrowserTest() {
    throw new RuntimeException("Test not implemented");
 
  }

  @Test
  public void verifyHomepageTitleTest() {
    throw new RuntimeException("Test not implemented");
  }



  @Test
  public void verifyTitleTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void ztestTest() {
    throw new RuntimeException("Test not implemented");
  }
}
