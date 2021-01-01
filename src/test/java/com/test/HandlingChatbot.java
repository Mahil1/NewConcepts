package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingChatbot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.findElement(By.id("corover-close-btn")).click(); //to close chatbot
		
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("corover-disha-icon")));
		
		driver.findElement(By.id("corover-disha-icon")).click();
		driver.switchTo().frame("corover-chat-frame");
		driver.findElement(By.xpath("//input[@placeholder='Enter your query here']")).sendKeys("train to noida");

	}

}
