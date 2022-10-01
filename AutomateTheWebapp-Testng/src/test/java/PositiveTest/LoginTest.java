package PositiveTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	String driverPath="E:\\chromedriver_win32/chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
  
  driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/users/sign_in?utm_source=google&utm_medium=cpc&utm_campaign=Search-Brand-India");
	
	driver.findElement(By.id("user_email_login")).sendKeys("xxx@gmail.com");
	TakesScreenshot ts = (TakesScreenshot) driver;	
	File rs = ts.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(rs,new File("L-email.png"));
	
	driver.findElement(By.id("user_password")).sendKeys("xxx");
	TakesScreenshot r = (TakesScreenshot) driver;	
	File k = r.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(k,new File("L-password.png"));
	
	driver.findElement(By.name("commit")).click();
	TakesScreenshot p = (TakesScreenshot) driver;	
	File f = p.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(f,new File("L-signin.png"));
	
	
}
@BeforeTest
public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32/chromedriver.exe");
	  
	  driver = new ChromeDriver();

}
	
	 @AfterTest
	  public void afterTest() {
		 System.out.println("After test is running");
	  }
}