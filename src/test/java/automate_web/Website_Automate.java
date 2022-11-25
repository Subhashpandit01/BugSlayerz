package automate_web;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class Website_Automate {

	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
	}

	
	@BeforeTest
	public void beforeTest() {
	
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		
	}
	

	@Test 
	public void test1() {
		
		driver.findElement(By.xpath(""));
		
	}
	

	@AfterMethod
	public void afterMethod() {
	}
  
	@AfterTest
	public void afterTest() {
	}
  
	@AfterSuite
	public void afterSuite() {
	}

}
