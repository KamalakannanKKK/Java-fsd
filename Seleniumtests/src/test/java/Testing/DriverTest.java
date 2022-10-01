package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DriverTest {
	  String Drivepath="E:\\chromedriver_win32/chromedriver.exe";
	  public WebDriver driver;
  @Test
  public void f() {
	//driver.get("http://www.ebay.com/");
	  driver.get("https://login.yahoo.com");
	System.out.println("The title"+driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32/chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
