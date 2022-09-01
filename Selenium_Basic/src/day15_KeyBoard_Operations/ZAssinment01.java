package day15_KeyBoard_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ZAssinment01 {

	public static void main(String[] args) throws IOException, InterruptedException { //Assignment to fill forms and validate it.
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to store data in property files
		FileInputStream file = new FileInputStream(""
				+ "D:\\Acceleration\\May_13_Workspace\\Selenium_Basic\\Property_Files\\FormData");
		Properties prop=new Properties();
		prop.load(file);
		//open url
		driver.get("https://demo.automationtesting.in/Register.html");
		//1.Enter full name and validate it.
        WebElement InputFirstName= driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
        System.out.println("is First Name is Disable :"+InputFirstName.isDisplayed());
        System.out.println("is First Name is enables :"+InputFirstName.isEnabled());
        System.out.println(" default value in InputFirstName:"+InputFirstName.getAttribute("ng-model"));
        WebElement InputLastName= driver.findElement(By.xpath("//input[@ng-model='LastName']"));
        InputFirstName.clear();
        InputFirstName.sendKeys("Sumit",Keys.TAB);
        InputLastName.clear();
        InputLastName.sendKeys("Kolhe",Keys.TAB);
        //2.Enter Address
        WebElement InputAddress= driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        String address=prop.getProperty("Address");
        InputAddress.sendKeys(address,Keys.TAB);
        //2.Enter Address
        WebElement InputEmail= driver.findElement(By.xpath("//input[@type='email']"));
        String email=prop.getProperty("Email");
        InputEmail.sendKeys(email,Keys.TAB);
        //3.Enter phone Number
        WebElement InputPhone= driver.findElement(By.xpath("//input[@ng-model='Phone']"));
        String PhoneNum=prop.getProperty("PhoneNum");
        InputPhone.sendKeys(PhoneNum,Keys.TAB);
        //4.click and check gender and validate it.
        WebElement RadioMaleButton= driver.findElement(By.xpath("//input[@value='Male']"));
        System.out.println("is Radio Button is Disable :"+RadioMaleButton.isDisplayed());
        System.out.println("is Radio Button is enables :"+RadioMaleButton.isEnabled());
        RadioMaleButton.click();
        System.out.println("is Radio Button is Selected :"+RadioMaleButton.isSelected());
        //System.out.println("Name of Radio Button is :"+RadioButton.getText());
        //5.select Hobbies and validate it.
        WebElement Selectcricket=driver.findElement(By.xpath("//input[@value='Cricket']"));
        WebElement SelectMovies=driver.findElement(By.xpath("//input[@value='Movies']"));
        Selectcricket.click();
        SelectMovies.click();
        System.out.println("is Cricket is Selected :"+Selectcricket.isSelected());
        System.out.println("is Movie is Selected :"+SelectMovies.isSelected());
        //6.Select languages
        List<WebElement> LangList=driver.findElements(By.xpath("//div[@style='display: block;']/ul/li"));
	  //get option count 
	  	System.out.println("Option count is:"+LangList.size());
		//Get dropdown option names
	  	for(int i=0;i<LangList.size();i++) {
	  		System.out.println("Option "+i+": "+LangList.get(i).getText());
	  	}  		 
	  	//select options from dropdown
//	  	SelectLang.selectByIndex(2);
//	  	SelectLang.selectByIndex(3);
//	  	SelectLang.selectByValue("Hindi");//change by value
//	  	SelectLang.selectByVisibleText("English");
//	  		
//	  	//get all the selected options
//	  	List<WebElement> selectedOpt=SelectLang.getAllSelectedOptions();
//		System.out.println("Selected options count: "+selectedOpt.size());
//	  		
//	  	//unselect already select options
////	  	SelectLang.deselectByIndex(2);
////	  	SelectLang.deselectByValue("Hyundaix");//change
////		SelectLang.deselectByVisibleText("English");
//	  				//or
//	  	SelectLang.deselectAll();
//	  	//7.Select skills
//	  	WebElement SelectSkill=driver.findElement(By.xpath("//select[@ng-model='Skill']"));
//	  	Select SelectSkills= new Select(SelectSkill);
//	  	System.out.println("Is dropdown has multiple option: "+SelectSkills.isMultiple());
	  	
	  	
	  	
	  	
	}
}
