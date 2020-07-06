//package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
public class TestCase2 {
    public WebDriver driver ; 
    
     @AfterTest                            //Jumbled
      public void terminateBrowser(){
          driver.close();
      }
   
      @Test                                //Jumbled
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
      
      @BeforeTest                            //Jumbled
      public void launchBrowser() {
          System.out.println("launching firefox browser"); 
          System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\geckodriver\\geckodriver.exe");
    	  String baseUrl = "http://newtours.demoaut.com";
          driver = new FirefoxDriver();
          driver.get(baseUrl);
      }
}

