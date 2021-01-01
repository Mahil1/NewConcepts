package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

		public WebDriver driver;
		//declaration
		
		@FindBy(id="username")
		private WebElement usernameTextfield;
		
		@FindBy(xpath="//input[@name='pwd']")
		private WebElement passwordTextfield;
		
		@FindBy(id="keepLoggedInCheckBox")
		private WebElement keepmeloggedinCheckbox;
		
		@FindBy(id="loginButton")
		private WebElement loginButton;
		
		@FindBy(xpath="//a[.='Forgot your password?']")
		private WebElement forgotyourpasswordLink;
		
		@FindBy(xpath="//a[.='actiTIME Inc.']")
		private WebElement actitimeincLink;
		
		//initialization
		
		public ActitimeLoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		
		public void loginMethod()
		{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		keepmeloggedinCheckbox.click();
		loginButton.click();
		}

}
