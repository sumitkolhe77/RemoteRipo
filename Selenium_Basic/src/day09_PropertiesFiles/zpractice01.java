package day09_PropertiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zpractice01 {

	public static void main(String[] args) throws IOException {
    FileInputStream file=new FileInputStream(".\\Property_Files\\VtigerWidget");
    Properties prop=new Properties();
    prop.load(file);
    String driverKey=prop.getProperty("driverKey");
    String path=prop.getProperty("ExecutablePath");
    String Url=prop.getProperty("appUrl");
    String signin=prop.getProperty("signin");
    String Widget=prop.getProperty("Widget");
    String WidgetButton=prop.getProperty("WidgetButton");
    String History=prop.getProperty("History");
    String WidgetButton2=prop.getProperty("WidgetButton2");
    String History2=prop.getProperty("History2");
   
    System.out.println(driverKey+"\n"+path+"\n"+Url+"\n"+signin);
    String ChromePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	System.setProperty(driverKey, ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get(Url);
	driver.findElement(By.cssSelector(signin)).click();
	// click on Widget button
	driver.findElement(By.cssSelector(Widget)).click();
	// select History
	driver.findElement(By.cssSelector(History)).click();

	// click on Widget button
	driver.findElement(By.cssSelector(WidgetButton)).click();
	// select History
	driver.findElement(By.cssSelector(History2)).click();

	// click on Widget button
	driver.findElement(By.cssSelector(WidgetButton2)).click();
	// select History
//	driver.findElement(By.cssSelector(History2)).click();
//			
//	driver.findElement(By.cssSelector("a[name='dclose']")).click();
//	driver.findElement(By.cssSelector(".confirm-box-ok")).click();
//			
//	driver.navigate().refresh();
//			
//	driver.findElement(By.cssSelector("a[name='dclose']")).click();
//	driver.findElement(By.cssSelector(".confirm-box-ok")).click();
	}
}
