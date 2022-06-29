package project1;
// home button
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class homebutton {
	 public static void main(String[] args)
	    {
	    	String path6="D:\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver", path6);
	    	WebDriver driver6= new ChromeDriver();
	    	driver6.get("file:///C:/Users/itctesting19/Desktop/Team1%20project/login1.html");
	    	driver6.findElement(By.id("username")).sendKeys("Balu17713");
	    	driver6.findElement(By.id("Password")).sendKeys("Balu17713");
	    	driver6.findElement(By.id("submit")).click();
	    	driver6.findElement(By.id("home")).click();
	    	//driver6.close();
	    }

}
