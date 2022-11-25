package testNGsample;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Flipkart_Auto {

	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		
		driver= new ChromeDriver(); 
		
		WebDriverManager.chromedriver().setup();
		
	}
	
	@BeforeTest
	public void beforeTest() {
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void beforeMethod() {
		WebElement username= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"));
		WebElement password= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[2]/input"));
		WebElement submit= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[4]/button/span"));
		
	}
	
	@Test
	public void test1() {
		
		
		
	}

	
	@AfterTest
	public void afterTest() {
	}
	
	@AfterMethod
	public void afterMethod() {
	}
	
	@AfterSuite
	public void afterSuite() {
	}


}
