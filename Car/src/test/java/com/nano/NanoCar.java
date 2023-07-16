package com.nano;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NanoCar {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("[inputtype=\"email]")).sendKeys("toshif");
		
		
	}

}
