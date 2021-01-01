package com.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.BaseTest;
import com.pom.ActitimeLoginPage;

@Listeners(com.generics.Utility.class)
public class TESTActitimeLogin extends BaseTest {
	
	@Test
	public void login()
	{
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
	}

}
