package day01.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class zpractice02 {

	public static void main(String[] args) {
		String path1="D:\\Acceleration\\May_13_Workspace\\Selenium_Basic\\Exicutable\\chromedriver.exe";
        String path2=".\\Exicutable\\chromedriver.exe";
        String path3=System.getProperty("user.dir")+".\\Exicutable\\chromedriver.exe";
        //System.out.println(System.getProperty("user.dir"));
        System.out.println(path3);
        System.setProperty("webdriver.chrome.driver", path3);
        ChromeDriver cd=new ChromeDriver();
        cd.get("https://www.google.com");        
 	}
}
//D:\Acceleration\May_13_Workspace\Selenium_Basic\Exicutable\chromedriver.exe
