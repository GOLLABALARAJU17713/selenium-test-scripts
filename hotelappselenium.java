package project1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hotelappselenium {
	 public static void main(String[] args)
	   {
		  String path2= "D:\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver",path2);
		  WebDriver driver2 =new ChromeDriver();
		 // driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver2.get("https://adactinhotelapp.com/");
		  
		  driver2.findElement(By.id("username")).sendKeys("Balu123");
		  driver2.findElement(By.id("password")).sendKeys("balu@123");
		  driver2.findElement(By.id("Login")).click();
		  
		 // Select dropDown=new Select(driver2.findElement(By.id("location")));
		  //dropDown.selectByIndex(2);
				  
		  driver2.close();
	   }

}
