package Practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Handlingvariouswebelements {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/Seleniumtests/");
		
		WebElement username = driver.findElement(By.id("uname"));
		WebElement password = driver.findElement(By.id("psw"));
		WebElement login = driver.findElement(By.name("submit"));
		
		username.clear();
		username.click();
		username.sendKeys("abc@gmail.com");
		
		password.clear();
		password.click();
		password.sendKeys("your_password");
		//driver.switchTo().alert().dismiss();
		login.click();
		
		String actualUrl = "http://localhost:8080/Seleniumtests/t.jsp";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
  }
}
