package automate_web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_1 {

//	public static void main(String[] args) throws InterruptedException {

		@Test
		public void validate() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")).click();

		
		
		Actions act = new Actions(driver);

//		driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[1]/yt-icon-button[2]/button")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"PopularPosts1\"]/div/article[2]/div/div/div[2]/div[4]/div[1]/div/span/a"));
		
		act.moveToElement(ele).click();
		act.scrollToElement(ele);
//		act.scrollToElement(ele1);
		
		act.build().perform();
		
//		Thread.sleep(5000);
//		
//		driver.quit();
		
	}

}
