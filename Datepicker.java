package org.example.ActionsAndWindows;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/datepicker/");
	String targetDate = "03/20/2026";
	Calendar calender = Calendar.getInstance();
	
	SimpleDateFormat targetformate = new SimpleDateFormat("MMM/dd/yyyy");
	

}

}