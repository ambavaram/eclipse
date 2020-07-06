//package Pack1;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class Testase7 {
  private  WebDriver driver;

@Test
  public void verifingHomepagTitle() {
	  String expectedTitle = "Welcome:Mercury Tours";
	 String autualTitle = driver.getTitle();
	 Assert.assertEquals(autualTitle, expectedTitle);
  }  
  
  @BeforeTest
  public void launchBrowser() {
	  System.out.println("Launching firefox browser");
	  System.setProperty("Webdriver.gecko.driver","c:\\selenium\\geckodriver\\geckodriver.exe");
	  String baseUrl = "http://newtours.demoaut.com";
	  driver = new FirefoxDriver();
	  driver.get(baseUrl);
	  
  }

  @AfterTest
  public void terminateBrowser() {
	//  driver.close();
	 // driver.quit();
  }
  

}
