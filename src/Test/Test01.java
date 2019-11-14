package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import pageObjects.*;
import util.*;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test01 {
	WebDriver driver;
  @Test
  public void f()throws Exception {
	//  driver.get("https://www.12306.cn");
	  queryAction.execute(driver,"南京","日照","2019-11-20");
	  Thread.sleep(4000);
	  Assert.assertTrue(driver.getPageSource().contains("南京"));
	  Thread.sleep(4000);
	  	  
	  String a= QueryPage.getText(driver);
	  System.out.println("车次信息为"+a);
	  
	  Assert.assertEquals(a, "K172");
	 // Assert.assertTrue(driver.getPageSource().contains("K172"));
	 // Assert.assertTrue(driver.getPageSource().c
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("WebDriver.firefox.bin", "D:\\Tools\\firefox43\\firefox.exe");
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 
  }

  @AfterMethod
  public void afterMethod() {
  
  }

}
