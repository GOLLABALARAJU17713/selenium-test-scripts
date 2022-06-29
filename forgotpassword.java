package project1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class forgotpassword {
	 public static void main(String []args)
	  {
		  String path2="D:\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path2);
		  WebDriver driver2= new ChromeDriver();
		  driver2.get("file:///C:/Users/itctesting19/Desktop/Team1%20project/login1.html");
		  
		  driver2.findElement(By.id("forgot password")).click();
		  driver2.findElement(By.id("text")).sendKeys("GOLLA BALARAJU");
		  driver2.findElement(By.id("username")).sendKeys("Balaraju123");
		  driver2.findElement(By.id("email_id")).sendKeys("gollabalaraju177@gmail.com");
		  driver2.findElement(By.id("number")).sendKeys("9642352004");
		  driver2.findElement(By.id("Password")).sendKeys("Balaraju12");
		  driver2.findElement(By.id("ConfirmPassword")).sendKeys("Balaraju12");
		  driver2.findElement(By.id("submit")).click();
		  driver2.findElement(By.id("username")).sendKeys("Balaraju123");
		  driver2.findElement(By.id("Password")).sendKeys("Balaraju12");
		  driver2.findElement(By.id("submit")).click(); 
		  
		 // driver2.close();
		  
	  }

}
