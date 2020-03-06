package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void launchapplication() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
	// Initialize browser
	  WebDriver driver=new ChromeDriver();
	   
	  // Open Google
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
	  // Close browser
	  driver.close();
  }
}
