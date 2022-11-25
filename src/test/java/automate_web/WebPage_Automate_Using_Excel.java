package automate_web;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class WebPage_Automate_Using_Excel {

	WebDriver driver;
	String fullname, email, caddr, paddr;  
	@BeforeSuite
	public void prerequisit() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@BeforeMethod
	public void prerequisit2() throws IOException {
		
		FileInputStream fils = new FileInputStream("C:\\Users\\91727\\eclipse-workspace\\Automate\\ExcelFile\\WebAutomateFile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fils);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");

		XSSFRow row1= sheet.getRow(1);
		XSSFRow row2= sheet.getRow(1);
		XSSFRow row3= sheet.getRow(1);
		XSSFRow row4= sheet.getRow(1);
		
		fullname = row1.getCell(0).getStringCellValue();
		email	= row2.getCell(1).getStringCellValue();
		caddr	= row3.getCell(2).getStringCellValue();
		paddr	= row4.getCell(3).getStringCellValue();
		
	}
	
	@Test
	public void test1() {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		driver.findElement(By.cssSelector("#userName")).sendKeys(fullname);
		driver.findElement(By.cssSelector("#userEmail")).sendKeys(email);
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys(caddr);
		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys(paddr);
		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys(Keys.TAB, Keys.ENTER);
		
	}
	
	@AfterMethod
	public void weight() throws InterruptedException {
		
		Thread.sleep(5000);
	}
	
	@AfterSuite
	
	public void end() {
		driver.close();
	}
	
}
























//	WebDriver driver;
//	
//	@BeforeSuite
//	public void beforeSuite() {
//	
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//	}
//	
//	@BeforeMethod
//	public void beforeMethod() {
//
//		driver.get("https://demoqa.com/text-box");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//	}
//
//		
//	@Test
//	public void test1() throws IOException{
//
//		FileInputStream fis = new FileInputStream("C:\\Users\\91727\\eclipse-workspace\\Automate\\ExcelFile\\WebAutomateFile.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet shit= workbook.getSheet("sheet1");
//		
//		XSSFRow celldata = shit.getRow(1);
//		XSSFRow celldata1 = shit.getRow(1);
//		XSSFRow celldata2 = shit.getRow(1);
//		XSSFRow celldata3 = shit.getRow(1);
//		
//		
//		String fullname = celldata.getCell(0).getStringCellValue();
//		String email= celldata1.getCell(1).getStringCellValue();
//		String caddr= celldata2.getCell(2).getStringCellValue();
//		String paddr= celldata3.getCell(3).getStringCellValue();
//
//		
//		driver.findElement(By.cssSelector("#userName")).sendKeys(fullname);
//		driver.findElement(By.cssSelector("#userEmail")).sendKeys(email);
//		driver.findElement(By.cssSelector("#currentAddress")).sendKeys(caddr);
//		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys(paddr);
//		
//		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys(Keys.TAB, Keys.ENTER);
//		
//		
//		System.out.println("Data in file: " + fullname +"||" +email+"||"+caddr+"||"+paddr);
////		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button")).click();
//		
//	}
//	
//
//  @AfterMethod
//  public void afterMethod() throws InterruptedException {
//  
//	  Thread.sleep(10000);
//	  
//  }
//
//
//  @AfterSuite
//  public void afterSuite() {
//	  driver.close();
//  }



//		@BeforeTest
//		public void beforeTest() {
//			
//			XSSFWorkbook workbook = new XSSFWorkbook();
//			XSSFSheet sheet= workbook.getSheet("sheet1");
//			System.out.println(workbook.getProperties());
//
//			
//		}