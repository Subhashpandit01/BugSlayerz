package automate_web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form_Automate {

	WebDriver driver;
	
	@BeforeSuite
	public void prerequisit1() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void prerequisit2() {
//		driver.findElement(By.id("item-0")).click();
//		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[2]/div/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void test1() throws InterruptedException {
		
		driver.findElement(By.id("firstName")).sendKeys("Subhash");
		driver.findElement(By.id("lastName")).sendKeys("Pandit");

//		WebElement ele = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"));
//		Actions act = new Actions(driver);
//		act.scrollToElement(ele);
		
		
		driver.findElement(By.id("userEmail")).sendKeys("subhashpandit5555@gmail.com");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("7020871462");

		
//		driver.findElements(By.xpath("//*[@id=\"dateOfBirthInput\"]") By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[92]").)
		
	}

	
	@AfterSuite
	public void end() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		
	}
	

}
