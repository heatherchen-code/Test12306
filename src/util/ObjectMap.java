package util;

import org.testng.annotations.Test;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;

public class ObjectMap {

	Properties properties;
	
	public ObjectMap(String propFile) {
		properties = new Properties();
		try {
			FileInputStream in = new FileInputStream(propFile);
			properties.load(in);
			in.close();
		}catch(IOException e ) {
			System.out.println("读取文件出错");
			e.printStackTrace();
		}
	}
	public By getLocator(String ElementName) throws Exception{
		String locator = properties.getProperty(ElementName);
		String locatorType = locator.split(">")[0];
		String locatorValue=locator.split(">")[1];
		locatorValue = new String(locatorValue.getBytes("ISO-8859-1"),"UTF-8");
		if (locatorType.toLowerCase().equals("id"))
			return By.id(locatorValue);
		else if(locatorType.toLowerCase().equals("classname"))
			
			return By.className(locatorValue);
		else if(locatorType.toLowerCase().equals("xpath"))
			
			return By.xpath(locatorValue);
		
		else 
			throw new Exception("输入的locatorType未定义"+locatorType);
	}
	
 // @Test
  public void f() {
	  
	  
  }
}
