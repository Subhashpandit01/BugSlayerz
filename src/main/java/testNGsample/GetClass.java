package testNGsample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html#/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"full_name\"]")).sendKeys("Subhash S Pandit");
		
		Actions act = new Actions(driver);
		
		
		
		
//		driver.findElement(By.xpath("//*[@id=\"father_name\"]")).sendKeys("Sudhakar R Pandit");
		
		driver.getTitle();
		
		
		
	}

}
