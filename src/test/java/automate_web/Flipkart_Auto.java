package automate_web;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
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
	XSSFWorkbook workbook;
	
	XSSFSheet sheet;
	
	WebElement username, password, submit;
	
	
	
	@BeforeSuite
	public void beforeSuite() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		
		 workbook= new XSSFWorkbook("C:\\Users\\91727\\eclipse-workspace\\Automate\\ExcelFile\\WebAutomateFile.xlsx");
		 sheet = workbook.getSheet("sheet1");
		 
	}
	
	@BeforeTest
	public void beforeTest() {
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void beforeMethod() {
		
		username= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		password= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		submit = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
	}

	
	@Test (priority = 1)
	public void bothempty() {
		username.sendKeys("");
		password.sendKeys("");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		submit.click();
		
	}
	
	@Test (priority = 2)
	public void test1() {
		password.sendKeys("");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		submit.click();
	}
	
	@Test (priority = 3)
	public void test2() {
		username.sendKeys("");
		password.sendKeys("abcd@123");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		submit.click();
		
	}
	
	@Test (priority = 4)
	public void test3() {
		username.sendKeys("abcd");
		password.sendKeys("abcd@123");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		submit.click();
	}
	
	@Test (priority = 5)
	public void test4() {
		username.sendKeys("7020871462");
		password.sendKeys("");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		submit.click();
	}
	
	@Test (priority = 6)
	public void test5() throws InterruptedException {
		username.sendKeys("");
		password.sendKeys("7276");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		submit.click();
	}
	
	@Test (priority = 7)
	public void test6() throws InterruptedException {
		
		username.sendKeys("7020871462");
		password.sendKeys("7276526373");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		submit.click();
	}


//	@AfterTest
//	public void cleartest() {
//		username.clear();
//		password.clear();
//		
//	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {

		username.clear();
		password.clear();

		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
	
	@AfterSuite
	public void afterSuite() {
		driver.close();
	}

}


