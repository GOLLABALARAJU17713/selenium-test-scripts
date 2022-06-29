package project1;
// login page and blood & organ registration  
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class bloodorgandonationform {
	public static void main(String []args)
	{
	   String path3="D:\\chromedriver.exe";
	   System.setProperty("webdriver.chrome.driver", path3);
	   WebDriver driver3=new ChromeDriver();
	   driver3.get("file:///C:/Users/itctesting19/Desktop/Team1%20project/login1.html");
	   driver3.findElement(By.id("username")).sendKeys("Balu17713");
	   driver3.findElement(By.id("Password")).sendKeys("Balu17713");
	   driver3.findElement(By.id("submit")).click();
	    //blood & organ register form
	   driver3.findElement(By.id("blood & organ")).click();
	   driver3.findElement(By.id("First_Name")).sendKeys("Balaraju");
	   driver3.findElement(By.id("Last_Name")).sendKeys("Golla");
	   driver3.findElement(By.id("date")).sendKeys("02-03-2000");
	   driver3.findElement(By.id("Email_Id")).sendKeys("gollabalaraju616@gmail.com");
	   driver3.findElement(By.id("Mobile_Number")).sendKeys("9014143304");
	   WebElement radio1=driver3.findElement(By.id("male"));
	   radio1.click();
	   driver3.findElement(By.id("Address")).sendKeys("5-18, Narasapuram, Ananthapuram, AndhraPradesh");
	   driver3.findElement(By.id("City")).sendKeys("Ananthapuram");
	   driver3.findElement(By.id("Pincode")).sendKeys("515763");
	   WebElement ddrop = driver3.findElement(By.id("text"));
	   Select select = new Select(ddrop);
	   select.selectByIndex(1);
	   
	   WebElement radio2=driver3.findElement(By.id("AB+"));
	   radio2.click();
	   driver3.findElement(By.id("Eyes")).click();
	   driver3.findElement(By.id("Heart")).click();
	   driver3.findElement(By.id("Lung")).click();
	   driver3.findElement(By.id("Pancreas")).click();
	   
	   driver3.findElement(By.id("adhaar")).sendKeys("669802947397");
	   driver3.findElement(By.id("submit")).click();
	 //  driver3.close();
		
		
		
		
	}

}
