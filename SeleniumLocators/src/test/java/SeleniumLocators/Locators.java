package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Locators {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		
			System.setProperty("webdriver.chrome.driver", "E:\\lib\\Chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.google.com/");
			
			//cssSelector
			driver.findElement(By.cssSelector("#gb > div > div:nth-child(1) > div > div:nth-child(2) > a")).click();
		    driver.navigate().back();
		    
		    
			//partialLinkText
			driver.findElement(By.partialLinkText("Sign")).click();
			driver.navigate().back();
			
			
			//linkText
			driver.findElement(By.linkText("Gmail")).click();
			driver.navigate().back();
			
			
			//name
			driver.findElement(By.name("q")).sendKeys("facebook");
			Thread.sleep(2000);
			
			
			//className
			driver.findElement(By.className("gNO89b")).click();
			
			
			//xpath(Absolute)
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
			
			
			//id
			driver.findElement(By.id("email")).sendKeys("Automation@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("automate@123");
			
			
			//tagNam
			driver.findElement(By.tagName("button")).click();
			Thread.sleep(10000);
			driver.close();
		

	}
	
}
