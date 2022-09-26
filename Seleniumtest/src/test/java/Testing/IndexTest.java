package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class IndexTest {
	 String Drivepath="E:\\chromedriver_win32/chromedriver.exe";
	  public WebDriver driver;
	  public String baseurl="http://localhost:8080/Seleniumtest/";
  @Test
  public void f() {
 System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32/chromedriver.exe");
	  
	  driver=new ChromeDriver();
	  driver.get(baseurl);
	  System.out.println("title :"+driver.getTitle());
	  List<WebElement> allInputElements=driver.findElements(By.tagName("input"));
	  for(WebElement e:allInputElements)
			System.out.println("Input Id"+e.getAttribute("id"));
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}
