package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Decleration of elements
		@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
		private WebElement un;
		@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
		private WebElement pwd;
		@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
		private WebElement login;
		@FindBy(xpath="//a[@class='_21JmK0 _1__46T']")
		private WebElement forgot;
		@FindBy(xpath="//button[text()='Request OTP']")
		private WebElement request;
		
	  //intialization of elements	
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	  //utilization of elements
		public void UserName(String uid)
		{
			un.sendKeys(uid);
		}
		public void password(String password)
		{
			pwd.sendKeys(password);
		}
		public void loginBu()
		{
			login.click();
		}
		public void forgotPass()
		{
			forgot.click();
		}
		public void requestOtp()
		{
			request.click();
		}
}
