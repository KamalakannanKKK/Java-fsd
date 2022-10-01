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

public class RegistrationTest {
	String driverPath="E:\\chromedriver_win32/chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
  
  driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/users/sign_up");
	
	driver.findElement(By.id("user_full_name")).sendKeys("kkk");
	TakesScreenshot tsc = (TakesScreenshot) driver;	
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("R-user.png"));
	
	driver.findElement(By.id("user_email_login")).sendKeys("xxx@gmail.com");
	TakesScreenshot ts = (TakesScreenshot) driver;	
	File rs = ts.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(rs,new File("R-email.png"));
	
	driver.findElement(By.id("user_password")).sendKeys("xxx");
	TakesScreenshot r = (TakesScreenshot) driver;	
	File k = r.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(k,new File("R-password.png"));
	Thread.sleep(30);
	driver.findElement(By.id("tnc_checkbox")).click();
	
	driver.findElement(By.name("commit")).click();
	TakesScreenshot p = (TakesScreenshot) driver;	
	File f = p.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(f,new File("R-signup.png"));
	
	
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
