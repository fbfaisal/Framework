package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;



public class LoginTestOrangeLive extends BaseClass{
	

	
	@Test
	public void loginapp() {
	
	
		logger.info("Starting Application");
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.logintoOrange(excel.getstringdata("Sheet1", 0, 0), excel.getstringdata("Sheet1", 0, 1));
		logger.pass("Login Successful");
		
	}


}
