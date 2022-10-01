package MessageTestngExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
public class NewTest {
  @Test
  public void f() throws MalformedURLException {
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32/chromedriver.exe");
	  WebDriver driver;
	  driver=new ChromeDriver();
	   String URL;
	String Node;
	  DesiredCapabilities caps=new DesiredCapabilities();
	  caps.setPlatform(Platform.WIN8);
	   URL = "http://www.google.com";
	  System.out.println(" Executing on CHROME");
      caps.setBrowserName("chrome");
      Node = "http://192.168.43.110:4444/wd/hub";
      driver = new RemoteWebDriver(new URL(Node), caps);
      driver = new RemoteWebDriver(caps);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      // Launch website
      driver.navigate().to(URL);
  }
}
