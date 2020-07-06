import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class HandleScroll {
 
 @Test
 public void scrollDown() throws InterruptedException{
 System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\geckodriver\\geckodriver.exe");
 WebDriver driver = new FirefoxDriver();
 driver.navigate().to("https://www.softwaretestingmaterial.com");
 //to perform Scroll on application using  Selenium
 JavascriptExecutor js = (JavascriptExecutor) driver;
 //js.executeScript("window.scrollBy(0,250)", "");
 
 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
 
 //Thread.sleep(3000);
// js.executeScript("window.scrollBy(0,-250)", "");
 
 }
}
