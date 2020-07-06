import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrame {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\geckodriver\\geckodriver.exe");
		         WebDriver driver = new FirefoxDriver();
		          
		         //Puts a Implicit wait, Will wait for 10 seconds before throwing exception
		         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		         driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		           
			       driver.switchTo().frame("classFrame");
			       // driver.switchTo().frame(2);
			        driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
			        System.out.println("Frame3");         
		     }
}
