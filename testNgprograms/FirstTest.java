package TestngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	public WebDriver driver;
@Test
public void first() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Suraj\\Desktop\\work\\Selenium_practice\\binary\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.get("https://www.facebook.com");
}
@Test
public void second() {
	WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	username.sendKeys("suraj shinde");
	pass.sendKeys("12345678");
	login.click();
}
}
