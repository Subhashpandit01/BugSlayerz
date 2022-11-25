package automate_web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_Web {

		public static void main(String[] args){

			WebDriverManager.chromedriver().setup();
			
//			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.myntra.com/");
		
			driver.manage().window().maximize();
//			driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[6]/div/div/div/div/img[1]"));
			
			WebElement ele = driver.findElement(By.xpath("/html/body/div[4]/div/div/footer/div/div[4]/h3[3]/strong"));
			
			Actions act = new Actions(driver);
		
			act.scrollToElement(ele).build().perform();
			
		}

}



















//			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
//	
//			WebDriver driver = new ChromeDriver();
//
//			driver.get("https://text-compare.com/");
//			driver.manage().window().maximize();
//			
//			WebElement box1 =  driver.findElement(By.xpath("//textarea[@id='inputText1']"));
//			WebElement box2 =  driver.findElement(By.xpath("//textarea[@id='inputText2']"));
//			
//			box1.sendKeys("Subhash Pandit");
//			
//			Actions act = new Actions(driver);
//			
//			//*control+ A 
//			
//			act.keyDown(Keys.CONTROL);
//			act.sendKeys("A");
//			act.keyUp(Keys.CONTROL);
//			act.perform();
//			
//			
//			//* control+ C
//			
//			act.keyDown(Keys.CONTROL);
//			act.sendKeys("C");
//			act.keyUp(Keys.CONTROL);
//			act.perform();
//			
//			//* control +tab
//			act.sendKeys(Keys.TAB);
//			act.perform();
//
//			//* control+v
//			act.keyDown(Keys.CONTROL);
//			act.sendKeys("V");
//			act.keyUp(Keys.CONTROL);
//			act.perform();









//			act.keyDown(Keys.CONTROL);
//			act.sendKeys("A");
//			act.keyUp(Keys.CONTROL);
//			act.perform();
//			
//			//ctl+C
//			act.keyDown(Keys.CONTROL);
//			act.sendKeys("C");
//			act.keyUp(Keys.CONTROL);
//			act.perform();
//
//			//press TAB
//			act.sendKeys(Keys.TAB);
//			act.perform();
//			
//			//ctl+V
//			act.keyDown(Keys.CONTROL);
//			act.sendKeys("V");
//			act.keyUp(Keys.CONTROL);
//			act.perform();


















//		public static void main(String[] args) throws InterruptedException {
//			
//			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
//	
//			WebDriver driver = new ChromeDriver();
//			
//			driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
//			
//			driver.manage().window().maximize();
//			
//			System.out.println("Current Url :" + driver.getCurrentUrl());
////			System.out.println("Page Resource :" +driver.getPageSource());
//			System.out.println("Title :" +driver.getTitle());
//			System.out.println("Window Handle :"+ driver.getWindowHandle());
//		}










