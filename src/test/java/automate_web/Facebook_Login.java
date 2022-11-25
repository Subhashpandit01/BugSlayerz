package automate_web;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Login {

	
		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("adsf");

			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("35456");
			
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			}
		}
		
		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	WebDriver driver;
//	WebElement username, password, submit;
//
//	@BeforeSuite
//	public void beforeSuite() {
//		
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver(); 
//		driver.manage().window().maximize();
//		
//	}
//	
//	@BeforeMethod
//	public void website() {
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	}
//	
//	
//	@Test (priority = 1)
//	public void test1() throws InterruptedException {
//		
//		username =	driver.findElement(By.xpath("//*[@id=\"email\"]"));
//		password = driver.findElement(By.xpath("//*[@id=\"u_0_2_zw\"]/div[1]/div[2]"));
//		submit = driver.findElement(By.xpath("//*[@id=\"u_0_5_mz\"]"));
//		
//		username.sendKeys("abcd");
//		password.sendKeys("@123");
//		Thread.sleep(5000);
//		submit.click();
//		
//	}
//
//	@Test 
//	public void test2() {
//		
//		driver.close();
//	}
//	
//}



