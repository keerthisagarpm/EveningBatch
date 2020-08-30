package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	//Decleration
			@FindBy(xpath="//input[@name='q']")
			private WebElement search;
			@FindBy(xpath="//span[text()='Cart']")
			private WebElement cart;
			@FindBy(xpath="//button[@class='vh79eN']")
			private WebElement seIc;
			
		  //initialization
			public HomePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
		
	     //Utilize
			public void search(String value)
			{
				search.sendKeys(value);
			}
			public void cart()
			{
				cart.click();
			}
			public void searchIcon()
			{
				seIc.click();
			}
}
