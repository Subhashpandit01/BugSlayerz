package automate_web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetFunctions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/main/div/div[14]/div/div/div/div/div/a/picture/img"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(ele);
		
		
	}

}
