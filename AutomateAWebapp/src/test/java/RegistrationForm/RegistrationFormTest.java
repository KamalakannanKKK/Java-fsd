package RegistrationForm;



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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationFormTest {


    final  String siteURL = "file:///C:\\Users\\VEL\\eclipse-workspace\\AutomateAWebapp\\src\\main\\webapp\\Registration.html";
    final String driverPath ="E:\\\\chromedriver_win32/chromedriver.exe"; 
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
	void atestEmail() throws InterruptedException {
		//Find Input Field
		WebElement input = driver.findElement(By.id("email"));
		assertTrue(input.isDisplayed());
		assertTrue(input.isEnabled());
		
		//Enter yourEmail
		input.sendKeys("kamal@gmail.com");
		Thread.sleep(2000);
		
	}
	
	@Test
	void btestPassword() throws InterruptedException, IOException {
		//Find Input Field
		WebElement input = driver.findElement(By.id("psw"));
		assertTrue(input.isDisplayed());
		assertTrue(input.isEnabled());
		
		//Enter yourEmail
		input.sendKeys("abcd1234");
		Thread.sleep(2000);
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("reg-pasword.png"));
				
		
		
	}
	
	@Test
	void ctestRepeatPassword() throws InterruptedException, IOException {
		//Find Input Field
		WebElement input = driver.findElement(By.id("psw-repeat"));
		assertTrue(input.isDisplayed());
		assertTrue(input.isEnabled());
		
		//Enter yourEmail
		input.sendKeys("abcd1234");
		Thread.sleep(2000);
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("reg-repet-password.png"));
				
		
		
	}
	
	@Test
    void dtestToVerifyRadioButtonExist() throws InterruptedException, IOException {
		WebElement radio1 = driver.findElement(By.id("admin"));
		assertEquals(true, radio1.isDisplayed());
		assertEquals(true, radio1.isEnabled());
		assertEquals(false, radio1.isSelected());
		
		WebElement radio2 = driver.findElement(By.id("user"));
		assertEquals(true, radio2.isDisplayed());
		assertEquals(true, radio2.isEnabled());
		assertEquals(false, radio2.isSelected());
		
		WebElement radio3 = driver.findElement(By.id("vendor"));
		assertEquals(true, radio3.isDisplayed());
		assertEquals(true, radio3.isEnabled());
		assertEquals(false, radio3.isSelected());
		
		Thread.sleep(2000);
	
		
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("reg-radio-buttons.png"));
				
		
	}
	
	@Test
    void etestToVerifyRadioButtonOneSelected() throws InterruptedException, IOException {
		WebElement radio = driver.findElement(By.id("admin"));
		assertEquals(true, radio.isDisplayed());
		assertEquals(true, radio.isEnabled());
		//select radio button 
		radio.click();
		Thread.sleep(2000);
		assertEquals(true, radio.isSelected());

	
		
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("radio-button-1.png"));
				
		
		
	}
	
	@Test
    void ftestToVerifyRadioButtonTwoSelected() throws InterruptedException, IOException {
		WebElement radio = driver.findElement(By.id("user"));
		assertEquals(true, radio.isDisplayed());
		assertEquals(true, radio.isEnabled());
		//select radio button 
		radio.click();
		Thread.sleep(2000);
		assertEquals(true, radio.isSelected());
				
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("radio-button-2.png"));
				
		
		
	}
	
	@Test
    void gtestToVerifyRadioButtonSelected() throws InterruptedException, IOException {
		WebElement radio = driver.findElement(By.id("vendor"));
		assertEquals(true, radio.isDisplayed());
		assertEquals(true, radio.isEnabled());
		//select radio button 
		radio.click();
		Thread.sleep(2000);
		assertEquals(true, radio.isSelected());
	
				
				
			 //Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("radio-button-3.png"));
						
				
		
	}
	
	@Test
	void htestToVerifyCheckboxExist() throws IOException {
		WebElement checkBox1 = driver.findElement(By.id("skill1"));
		assertEquals(true,checkBox1.isDisplayed());
		assertEquals(true,checkBox1.isEnabled());
		assertEquals(true,checkBox1.isSelected());
		
		WebElement checkBox2 = driver.findElement(By.id("skill2"));
		assertEquals(true,checkBox2.isDisplayed());
		assertEquals(true,checkBox2.isEnabled());
		assertEquals(false,checkBox2.isSelected());
		
		WebElement checkBox3 = driver.findElement(By.id("skill3"));
		assertEquals(true,checkBox3.isDisplayed());
		assertEquals(true,checkBox3.isEnabled());
		assertEquals(false,checkBox3.isSelected());
		
		
				
			 //Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("reg-check-box.png"));
						
				
	}
	
	@Test
	void htestToVerifyCheckBoxOneSelected() throws InterruptedException, IOException {
		WebElement checkBox1 = driver.findElement(By.id("skill1"));
		assertEquals(true,checkBox1.isDisplayed());
		assertEquals(true,checkBox1.isEnabled());
		
		//Select Check Box One
		checkBox1.click();
		Thread.sleep(2000);
		assertEquals(true,checkBox1.isSelected());
		
		
			 //Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("reg-check-box-1.png"));
						
				
		
	}
	
	@Test
	void itestToVerifyCheckBoxTwoSelected() throws InterruptedException, IOException {
		WebElement checkBox2 = driver.findElement(By.id("skill2"));
		assertEquals(true,checkBox2.isDisplayed());
		assertEquals(true,checkBox2.isEnabled());
		
		//Select Check Box One
		checkBox2.click();
		Thread.sleep(2000);
		assertEquals(true,checkBox2.isSelected());
		
				
			 //Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("reg-check-box-2.png"));
						
				
		
	}
	
	@Test
	void jtestToVerifyCheckBoxThreeSelected() throws InterruptedException, IOException {
		WebElement checkBox3 = driver.findElement(By.id("skill3"));
		assertEquals(true,checkBox3.isDisplayed());
		assertEquals(true,checkBox3.isEnabled());
		
		//Select Check Box One
		checkBox3.click();
		Thread.sleep(2000);
		assertEquals(true,checkBox3.isSelected());
	
		
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("reg-check-box-3.png"));
				
		
		
	}
	
	@Test
	void testToVerifyRegistrationButton() throws InterruptedException, IOException {
		WebElement button = driver.findElement(By.className("registerbtn"));
		assertEquals(true,button.isDisplayed());
		assertEquals(true,button.isEnabled());
		
		//Select Check Box One
		button.submit();
		Thread.sleep(2000);
		
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("reg-button.png"));
				
		
	}
	
}
