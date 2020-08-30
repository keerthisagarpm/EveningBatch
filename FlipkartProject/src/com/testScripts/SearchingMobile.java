package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.basicOperations.BasicOperations;
import com.basicOperations.ExcelData;
import com.basicOperations.TakeSceenShot;
import com.pageObjectModel.HomePage;

public class SearchingMobile extends BasicOperations
{
  @Test
  public static void mobile() throws EncryptedDocumentException, IOException
  {
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", title);
	  HomePage hp = new HomePage(driver);
	  String search_value=ExcelData.exceldata("HomeScreen", 1, 0);
	  hp.search(search_value);
	  hp.searchIcon();
	  TakeSceenShot.screenshot("mobile");
  }
}
