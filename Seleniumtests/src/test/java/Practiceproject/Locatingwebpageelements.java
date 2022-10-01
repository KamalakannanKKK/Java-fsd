package Practiceproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Locatingwebpageelements {
	String Drivepath="E:\\chromedriver_win32/chromedriver.exe";
	  public WebDriver driver;
	 // public String baseurl="https://www.tutorialspoint.com/videotutorials/subscription.php";
	 public String baseurl= "http://demo.guru99.com/test/link.html";	
  @Test
  public void f() throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32/chromedriver.exe");
	  
	  driver=new ChromeDriver();
	  driver.get(baseurl);
	  
	  /*locating element with id
	  WebElement n =driver.findElement(By.id("search-strings"));
	
	  Locating element with class
	  WebElement n = driver.findElement(By.className("input"));
	  
	  //locating element with name
	  WebElement n =driver.findElement(By.name("key"));
	  n.sendKeys("JavaScript");
      Thread.sleep(2000);
      
        //identify element with cssSelector
      WebElement n1 = driver.
      findElement(By.cssSelector("input[class='input']"));
      String str = n1.getAttribute("value");
      System.out.println("Attribute value is : " + str);
      
      //identify element with xpath
      WebElement p = driver.
      findElement(By.xpath("//input[@class='input']"));
      p.clear();
      */
	  
	  // identify element with link text
      WebElement n =driver.findElement(By.linkText("click here"));
      n.click();
	 
     
    
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
