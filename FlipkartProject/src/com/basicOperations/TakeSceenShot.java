package com.basicOperations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeSceenShot extends BasicOperations
{
   public static void screenshot(String File_name) throws IOException
   {
	  TakesScreenshot ts = (TakesScreenshot)driver;
      File scr= ts.getScreenshotAs(OutputType.FILE);
      File dst = new File("C://Documents//"+ File_name +".jpeg");
      FileUtils.copyFile(scr, dst);
   }
}
