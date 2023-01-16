package com.stctv.utilities;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TestCapture {

  public static void CaptureScreenshot(WebDriver driver, String screenShotName) {

    // Take screenshot and store as a file format
    String path = System.getProperty("user.dir");

    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try {
      FileHandler.copy(src, new File(path + "/screenshots" + screenShotName));

    } catch (IOException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
