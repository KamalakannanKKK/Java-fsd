package ecommerce;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Automation {
	WebDriver driver;

	@Test(groups = "Chrome", priority=3)
	public void LaunchChrome() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32/chromedriver.exe");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(groups = "Chrome", dependsOnMethods = "LaunchChrome",priority=4)
	public void f() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot tsc = (TakesScreenshot) driver;
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc, new File("CFlipkartload.png"));

//		To find the load time and print on console

		Long loadtime = (Long) ((JavascriptExecutor) driver)
				.executeScript("return performance.timing.loadEventEnd - performance.timing.navigationStart;");
		System.out.println("Load time of the website is :- " + loadtime);

//		To search the given text in search bar

		driver.findElement(By.className("_3704LK")).sendKeys("iphone 13");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File rs = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rs, new File("CSearchbar.png"));
		Thread.sleep(2000);

		driver.findElement(By.className("L0Z3Pu")).click();
		TakesScreenshot t = (TakesScreenshot) driver;
		File r = t.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(r, new File("CclickSearch.png"));
		Thread.sleep(2000);

		// Check if the images are loaded and visible till the screen height only
		WebElement i = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
		Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		if (p) {
			System.out.println("Image is loaded");
			TakesScreenshot ml = (TakesScreenshot) driver;
			File dr = ml.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(dr, new File("Cproductimage.png"));
			Thread.sleep(2000);
		} else {
			System.out.println("Image not loaded");
		}
		String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
		JavascriptExecutor scrollBarPresent = (JavascriptExecutor) driver;
		Boolean test = (Boolean) (scrollBarPresent.executeScript(execScript));
		if (test == true) {
			System.out.print("Scrollbar is present.");
		} else if (test == false) {
			System.out.print("Scrollbar is not present.");
		}

		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,2500);");
		//verify that the image is downloaded just before user sccroll down
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		WebElement fl = w.until(new Function<WebDriver, WebElement>() {
			// customized condition for fluent wait
			public WebElement apply(WebDriver driver) {
				WebElement er = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[11]/div/div/div/a/div[2]/div[1]/div[1]"));
				if (er.isDisplayed()) {
					Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",er);
					if (p) {
						System.out.println("Verified APPLE iPhone 13 ((PRODUCT)RED, 256 GB) image is loaded just before the user scrolls");

						try {
							TakesScreenshot ml = (TakesScreenshot) driver;
							File dr = ml.getScreenshotAs(OutputType.FILE);
							FileHandler.copy(dr, new File("CScrollproductimage.png"));
						} catch (IOException e) {
							e.printStackTrace();
						}

					} else {
						System.out.println("Image not downloaded");
					}

					return er;
				} else {
					return null;
				}
			}
		});
		try {
			long lastHeight = Long.parseLong(
					((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight").toString());
			System.out.println(lastHeight);

			while (true) {
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
				Thread.sleep(2000);

				long newHeight = Long.parseLong(
						((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight").toString());
				if (newHeight == lastHeight) {

					
					TakesScreenshot rf = (TakesScreenshot) driver;
					File lk = rf.getScreenshotAs(OutputType.FILE);
					FileHandler.copy(lk, new File("CScrolllast.png"));
					Thread.sleep(2000);
					break;
				}
				// Verify that it navigates to the bottom of the page
				Assert.assertSame(lastHeight, newHeight);
				System.out.println("Verified that it navigates to the bottom of the page");
				lastHeight = newHeight;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(groups = "Internet Explorer",priority=1)
	public void LaunchIE() {
		System.setProperty("webdriver.ie.driver", "E:\\IEDriverServer_Win32_4.5.0/IEDriverServer.exe");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(groups="Internet Explorer", dependsOnMethods="LaunchIE",priority=2)
	public void IE() throws IOException, InterruptedException {
		WebDriver driver=new InternetExplorerDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot tsc = (TakesScreenshot) driver;
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc, new File("IEFlipkartload.png"));

//		To find the load time and print on console

		Long loadtime = (Long) ((JavascriptExecutor) driver)
				.executeScript("return performance.timing.loadEventEnd - performance.timing.navigationStart;");
		System.out.println("Load time of the website is :- " + loadtime);

//		To search the given text in search bar

		driver.findElement(By.className("_3704LK")).sendKeys("iphone 13");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File rs = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rs, new File("IESearchbar.png"));
		Thread.sleep(2000);

		driver.findElement(By.className("L0Z3Pu")).click();
		TakesScreenshot t = (TakesScreenshot) driver;
		File r = t.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(r, new File("IEclickSearch.png"));
		Thread.sleep(2000);

		// Check if the images are loaded and visible till the screen height only
		WebElement i = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
		Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		if (p) {
			System.out.println("Image is loaded");
			TakesScreenshot ml = (TakesScreenshot) driver;
			File dr = ml.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(dr, new File("IEproductimage.png"));
			Thread.sleep(2000);
		} else {
			System.out.println("Image not loaded");
		}
		String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
		JavascriptExecutor scrollBarPresent = (JavascriptExecutor) driver;
		Boolean test = (Boolean) (scrollBarPresent.executeScript(execScript));
		if (test == true) {
			System.out.print("Scrollbar is present.");
		} else if (test == false) {
			System.out.print("Scrollbar is not present.");
		}

		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,2000);");
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		WebElement fl = w.until(new Function<WebDriver, WebElement>() {
			// customized condition for fluent wait
			public WebElement apply(WebDriver driver) {
				WebElement er = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[11]/div/div/div/a/div[2]/div[1]/div[1]"));
				if (er.isDisplayed()) {
					Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",er);
					if (p) {
						System.out.println("Verified APPLE iPhone 13 ((PRODUCT)RED, 256 GB) image is loaded just before the user scrolls");

						try {
							TakesScreenshot ml = (TakesScreenshot) driver;
							File dr = ml.getScreenshotAs(OutputType.FILE);
							FileHandler.copy(dr, new File("IEScrollproductimage.png"));
						} catch (IOException e) {
							e.printStackTrace();
						}

					} else {
						System.out.println("Image not downloaded");
					}

					return er;
				} else {
					return null;
				}
			}
		});
		try {
			long lastHeight = Long.parseLong(
					((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight").toString());
			System.out.println(lastHeight);

			while (true) {
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
				Thread.sleep(2000);

				long newHeight = Long.parseLong(
						((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight").toString());
				if (newHeight == lastHeight) {

					
					TakesScreenshot rf = (TakesScreenshot) driver;
					File lk = rf.getScreenshotAs(OutputType.FILE);
					FileHandler.copy(lk, new File("IEScrolllast.png"));
					Thread.sleep(2000);
					break;
				}
				// Verify that it navigates to the bottom of the page
				Assert.assertSame((long)lastHeight,(long) newHeight);
				System.out.println("Verified that it navigates to the bottom of the page");
				lastHeight = newHeight;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}