package automate_web;

import java.awt.Desktop.Action;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Class {

	public static void main(String[] args) throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
		
//		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']")).click();
		
		ArrayList<String> allWindows = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println("Window size: "+allWindows.size());
		
		for(int i=0;i<allWindows.size();i++) {
			driver.switchTo().window(allWindows.get(i));
			String actualTitle =driver.getTitle();
			System.out.println("Page Tiltle = " +actualTitle);
			
			if(actualTitle.contains("LinkedIn")) {
				System.out.println("Getting my expeted page =" +driver.getTitle()+"  "+ driver.getCurrentUrl());
			}
			
		}
		
		driver.quit();

	}		
		
			
	}

//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://text-compare.com/");
//		
//		driver.manage().window().maximize();
//		
//		WebElement ele = driver.findElement(By.xpath("//textarea[@name='text1']"));
//		
//		ele.sendKeys("Hello Subhash");
//		
//		Actions actions = new Actions(driver);
//
//		actions.keyDown(Keys.CONTROL);
//		actions.sendKeys("A");
//		actions.keyUp(Keys.CONTROL);
//		actions.build().perform();
//		
//		actions.keyDown(Keys.CONTROL);
//		actions.sendKeys("C");
//		actions.keyUp(Keys.CONTROL);
//		actions.build().perform();
//		
//		actions.keyDown(Keys.TAB);
//		actions.keyUp(Keys.TAB);
//		actions.build().perform();
//		
//		
//		actions.keyDown(Keys.CONTROL);
//		actions.sendKeys("V");
//		actions.keyUp(Keys.CONTROL);
//		actions.build().perform();
//		
//		Thread.sleep(5000);
//		
//		driver.quit();