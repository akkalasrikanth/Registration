package org.example.ActionsAndWindows;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class Actionns {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com/");
		 driver.findElement(By.cssSelector("[alt=\"Continue shopping\"]")).click();
		 Actions a = new Actions(driver);
		 
		 WebElement move = driver.findElement(By.cssSelector("div[id=\"nav-link-accountList\"]")); 
		 a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();	
		 Thread.sleep(2000);
		 a.moveToElement(move).contextClick().perform();	
		 
	}
}
