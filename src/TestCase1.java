//package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
  @Test
  public void verifyTitle() {
	  System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\geckodriver\\geckodriver.exe");
	  String baseUrl = "http://newtours.demoaut.com";
      WebDriver driver = new FirefoxDriver();      
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = "";
      actualTitle = driver.getTitle();
    
      Assert.assertEquals(actualTitle,expectedTitle);
  }
}
