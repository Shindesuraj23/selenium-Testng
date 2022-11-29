package TestngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	
  @Test
  public void launchchrome() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Suraj\\Desktop\\work\\Selenium_practice\\binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	 }
  @Test
  public void launchedge() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Suraj\\Desktop\\work\\Selenium_practice\\binary\\chromedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("https://www.google.com");
  }
}
