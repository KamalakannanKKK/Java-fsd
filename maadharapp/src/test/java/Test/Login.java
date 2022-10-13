package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/";

	@Test
	public void delete() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32/chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("//button[normalize-space()='Admin LogIn']")).click();
		webdriver.findElement(By.xpath("//input[@id='username']")).sendKeys("kamal");
		webdriver.findElement(By.xpath("//input[@id='password']")).sendKeys("kamal");
		webdriver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		System.out.println("Logged in Successfully");
		}}