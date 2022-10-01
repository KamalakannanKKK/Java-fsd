package SearchAndaddtoCart;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchandAddToCartTest {
	WebDriver driver;

	public void launchBrowser() throws IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		// Step-1 :: type cast driver object into takeScreenshot instance
		TakesScreenshot tsc = (TakesScreenshot) driver;
		// Step-2 :: Generate a screenshot as file
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc, new File("ebaypage.png"));

	}

	public void searchProduct() throws InterruptedException, IOException {

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("JBL Speakers");
		Thread.sleep(2000);
		// Step-1 :: type cast driver object into takeScreenshot instance
		TakesScreenshot tsc = (TakesScreenshot) driver;
		// Step-2 :: Generate a screenshot as file
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc, new File("productname.png"));

		driver.findElement(By.cssSelector("#gh-btn")).click();

		Thread.sleep(2000);
		TakesScreenshot t = (TakesScreenshot) driver;
		// Step-2 :: Generate a screenshot as file
		File r = t.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(r, new File("productpage.png"));
		driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[2]/div/div[2]/a/div/span")).click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		// Step-2 :: Generate a screenshot as file
		File rs = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rs, new File("productdetail.png"));
		System.out.println("The title of the page is :" + driver.getTitle());

	}

	public void Addtocart() throws InterruptedException, IOException {

		driver.get(
				"https://www.ebay.com/itm/225165750502?hash=item346cecb0e6:g:w-8AAOSwrChjJGOd&amdata=enc%3AAQAHAAAAoHWzbJf9hgtGCophdU3sB%2FSI2vAFdAEmVCt%2FAhl58LBETXliPzaYcNTSR5umK4YdJsS3J1mqRt%2FDO2dhvpA%2B%2FuKN1t93sV9Wg68pveu322laDup7gXuIr065F78eCX%2BbGo1OOIYenErKvkx3vdWU75Sr3rkesa3uw%2BAIjsmBIIJIi3veH0ce6AcG3rQd6SHrEl3wCGNifQGnWFE1qm8nbc8%3D%7Ctkp%3ABk9SR86XitPxYA");
		driver.findElement(By.xpath("//*[@id=\"isCartBtn_btn\"]")).click();
		Thread.sleep(2000);
		TakesScreenshot tsc = (TakesScreenshot) driver;
		// Step-2 :: Generate a screenshot as file
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc, new File("addtocart.png"));

	}

	public void closeBrowser() {

		driver.quit();

	}

	@Test
	public void f() throws IOException {

		SearchandAddToCartTest obj = new SearchandAddToCartTest();
		try {
			obj.launchBrowser();

			obj.searchProduct();

			obj.Addtocart();

			obj.closeBrowser();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
