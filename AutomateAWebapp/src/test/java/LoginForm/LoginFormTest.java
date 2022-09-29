package LoginForm;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFormTest {
	

     final  String siteURL = "http://localhost:8080/AutomateAWebapp/";
     final String driverPath ="E:\\chromedriver_win32/chromedriver.exe"; 
     WebDriver driver;
    
	@BeforeTest
	void setUp() throws Exception {
		//Set Up
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver=new ChromeDriver();
        driver.get(siteURL);
        //Add maximize size for snapshot
        driver.manage().window().maximize();
		
	}
	@Test
	void ftestLogInButton() throws InterruptedException, IOException {
		//Find Input Field
				WebElement button = driver.findElement(By.cssSelector("body > form > fieldset > div:nth-child(1) > button"));
				assertTrue(button.isDisplayed());
				assertTrue(button.isEnabled());
				
             
				button.submit();
				Thread.sleep(2000);
				
				//Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("login.png"));
						
				
	}
	

	@Test
	void detestLink() throws InterruptedException, IOException {
		//Find Input Field
				WebElement link = driver.findElement(By.cssSelector("body > form > fieldset > div:nth-child(3) > span > a"));
				assertTrue(link.isDisplayed());
				assertTrue(link.isEnabled());
				

				
				link.click();
				
				Thread.sleep(2000);
				
				//Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("link-verification.png"));
						
	}


	
	@Test
	void btestUserInput() throws InterruptedException, IOException {
		//Find Input Field
				WebElement input = driver.findElement(By.cssSelector("body > form > fieldset > div:nth-child(1) > input[type=text]:nth-child(2)"));
				assertTrue(input.isDisplayed());
				assertTrue(input.isEnabled());
				
					
				
				//Enter yourEmail
				input.sendKeys("kamal");
				 //Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("user.png"));
				Thread.sleep(2000);
				
	    }
			 
	
	@Test
	void ctestUserPassword() throws InterruptedException, IOException {
		//Find Input Field
				WebElement input = driver.findElement(By.cssSelector("body > form > fieldset > div:nth-child(1) > input[type=password]:nth-child(6)"));
				assertTrue(input.isDisplayed());
				assertTrue(input.isEnabled());
				
				//Enter yourEmail
				input.sendKeys("1234qwe");
				Thread.sleep(2000);
				

			
				
			 //Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("password.png"));
						
				
	}
	@Test
	void dtestCheckBox() throws InterruptedException, IOException {
		//Find Input Field
				WebElement checkbox = driver.findElement(By.cssSelector("body > form > fieldset > div:nth-child(1) > label:nth-child(11) > input[type=checkbox]"));
				assertEquals(true, checkbox.isDisplayed());
				assertEquals(true, checkbox.isEnabled());
				
             
				checkbox.click();
				assertEquals(false, checkbox.isSelected());
				Thread.sleep(2000);
				
				//Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("checkBox.png"));
						
				
	}
		
}