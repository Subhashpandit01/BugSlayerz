package automate_web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	WebDriver driver;
	
	@BeforeTest
	public void prerequisit() {
		

		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority = 1)
	public void validate() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/h2")).isEnabled());
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[3]/span")).isEnabled());
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/h2")).isDisplayed());
	}
	

//	@Test(priority = 2)
//	public void button() {
//	}
//		
//		@Test(priority = 3)
//		public void title() {
//			
//	}
	
	@AfterTest
	public void end() {
		
		driver.quit();
	}
	
}


































	
//	@AfterTest
//	public void end() {
//		
//		driver.quit();
//		
//	}
	
	














//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		
//		driver.manage().window().maximize();
//		
//	WebDriver driver;
//	
//	@BeforeTest
//	public void prerequisit() {
//		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.goibibo.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//	}
//	
//	@Test (priority=1)
//	public void Test1() {
//		
//		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[3]/span")).isEnabled());
//		
//	}
//	
//	@Test (priority=2)
//	public void Test2() {
//		
//		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[3]/span")).isEnabled());
//		
//	}
//	
//	@Test (priority=3)
//	public void Test3() {
//		
//		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div[6]/footer/div/div[1]/ul[2]/li[1]")).isDisplayed());
//		