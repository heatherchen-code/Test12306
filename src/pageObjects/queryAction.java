package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class queryAction {
	//WebDriver driver;
	public static void execute(WebDriver driver,String fromStationText,String toStationText,String train_date)throws Exception{
		driver.get("https://www.12306.cn");
		KeyBoardutil kb = new KeyBoardutil();
		
		
		LoginPage loginpage = new LoginPage(driver);
		System.out.println(loginpage.fromStation());
		loginpage.fromStation().click();
		loginpage.fromStation().sendKeys(fromStationText);
		kb.pressEnterKey();
				
		loginpage.toStation().click();
		loginpage.toStation().sendKeys(toStationText);
		kb.pressEnterKey();
		// Thread.sleep(2000);
		 
		WebElement element=loginpage.traindate();
		
		loginpage.setAttribute_traindate(driver, element);
		loginpage.traindate().clear();
				
		loginpage.traindate().sendKeys(train_date);
	//	
		//Thread.sleep(2000);
		
		
		WebElement element1=loginpage.calwrap();
		
		loginpage.scrollToElement(element1);
		
		kb.pressTabKey();
		//loginpage.setdisplay_calwrap(driver, element1);
		element1.click(); 
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement element2=loginpage.searchone();
		//wait.until(ExpectedConditions.presenceOfElementLocated(element2);
		wait.until(ExpectedConditions.attributeContains(element2, "id", "search_one"));
		System.out.println("查询按钮出现了");
		element2.sendKeys(Keys.ENTER);
		//element2.click();
		
	}
	/*public static void main(String[] args) throws Exception{
		WebDriver driver;
		System.setProperty("WebDriver.firefox.bin", "D:\\Tools\\firefox43\\firefox.exe");
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	queryAction qa = new queryAction();
	qa.execute(driver,"南京","日照","2019-11-20");
}*/
}