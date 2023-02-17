package com;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\91969\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:4200/home");
		driver.manage().window().maximize();
		testingmedicare();

	}

	public static void screenshot(ChromeDriver driver, String screenshotName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File(screenshotName + ".png"));
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void testingmedicare() {

		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='form2Example17']")).sendKeys("aishu@gmail.com");
		driver.findElement(By.xpath("//input[@id='form2Example27']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		driver.findElement(By.xpath("//button[@value='signIn']")).click();
		driver.findElement(
				By.xpath("//div[@class='userdash']//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//button[1]"))
				.click();
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("aishwarya");
		driver.findElement(By.xpath(
				"//body/app-root/app-billing/div[@class='container']/div[@class='row']/div[@class='col-50']/form[@class='ng-pristine ng-invalid ng-touched']/input[1]"))
				.sendKeys("anna nagar");
		driver.findElement(By.xpath(
				"//body/app-root/app-billing/div[@class='container']/div[@class='row']/div[@class='col-50']/form[@class='ng-pristine ng-invalid ng-touched']/input[1]"))
				.sendKeys("chennai");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("600001");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("tamilnadu");
		driver.findElement(By.cssSelector("form[class='ng-pristine ng-invalid ng-touched']")).click();
		driver.findElement(By.xpath("//input[@id='cardname']")).sendKeys("aishwarya");
		driver.findElement(By.xpath("//input[@id='cardnumber']")).sendKeys("1234 5678 91234");
		driver.findElement(By.xpath("//input[@id='expmonth']")).sendKeys("09");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='expyear']")).sendKeys("2040");
		driver.findElement(By.cssSelector("//form[@class='ng-pristine ng-invalid ng-touched']")).click();
		driver.findElement(By.cssSelector(
				"driver.findElement(By.cssSelector(\"//form[@class='ng-pristine ng-invalid ng-touched']\")).click();"))
				.click();

	}
}
