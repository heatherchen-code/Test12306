package pageObjects;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import util.ObjectMap;
import org.openqa.selenium.JavascriptExecutor;


public class LoginPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap("D:\\xyz\\abc\\Test002\\src\\objectMap.properties");
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setAttribute_traindate(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
      //  js.executeScript("document.getElementById(element).readOnly=false");
        js.executeScript("arguments[0].readOnly=false",element);
        
       System.out.println(js.executeScript("arguments[0].readOnly",element));
	}
	public void setdisplay_calwrap(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
      //  js.executeScript("document.getElementById(element).readOnly=false");
        js.executeScript("arguments[0].style.visible='hidden'",element);
       
     //  System.out.println(js.executeScript("arguments[0].readOnly",element));
	}
	
	 protected void scrollToElement(WebElement element) {
	    //    WebElement e = findElement(driver, locator);
	      //  log.info("scroll view element");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        // roll down and keep the element to the center of browser
	        js.executeScript("arguments[0].scrollIntoView();", element);
	    }
	
	public WebElement fromStation() throws Exception{
		element = driver.findElement(objectMap.getLocator("LoginPage.fromStationText"));
			
		return element;
	}
	public WebElement toStation() throws Exception{
		element = driver.findElement(objectMap.getLocator("LoginPage.toStationText"));
		return element;		
	}
	public WebElement traindate() throws Exception{
		element = driver.findElement(objectMap.getLocator("LoginPage.train_date"));
		return element;
	}
	public WebElement searchone() throws Exception{
		element = driver.findElement(objectMap.getLocator("LoginPage.search_one"));
		return element;
	}
	public WebElement calwrap() throws Exception{
		element = driver.findElement(objectMap.getLocator("LoginPage.calwrap"));
		System.out.println("className¶¨Î»·¨"+element);
		return element;
	}
}
