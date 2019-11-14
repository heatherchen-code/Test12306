package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ObjectMap;


import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.Iterator;
import java.util.Set;

//import util.ObjectMap;
import org.openqa.selenium.JavascriptExecutor;

public class QueryPage {
	
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap("D:\\xyz\\abc\\Test002\\src\\objectMap.properties");
	private WebDriver driver;
	
	public QueryPage(WebDriver driver) {
		this.driver = driver;
	}
	/*public static String getText(WebDriver driver)throws Exception {
		QueryPage qp = new QueryPage(driver);
		WebElement we=qp.number1();
		System.out.println("车次元素为"+we);
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
	    return (String)js.executeScript("arguments[0].click()",we);
		
		//return we.getText();
		
	}*/
	public static String getText(WebDriver driver)throws Exception {
		QueryPage qp = new QueryPage(driver);
		
		String currentWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        while (it.hasNext()) {
            String handle = it.next();
            if (currentWindow.equals(handle))
                continue;
            driver.switchTo().window(handle);
        }
        WebElement we=qp.number1();
        
        return we.getText();
	}
	
	public WebElement number1() throws Exception{
		element = driver.findElement(objectMap.getLocator("QueryPage.number1"));
			
		return element;
	}
}
