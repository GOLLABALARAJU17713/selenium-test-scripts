package project1;
import java.util.concurrent.TimeUnit;

//new user create an account
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createanaccountselenium {

public static void main(String[] args) {
		
		String path1 ="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver1=new ChromeDriver();
		
	  //driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Wait w= new FluentWait(driver1).withTimeout(30,TimeUnit.SECONDS);
		//WebDriverWait wait =new WebDriverWait(driver1);
				
		driver1.get("file:///C:/Users/itctesting19/Desktop/Team1%20project/login1.html");
	   
		driver1.findElement(By.id("create an account")).click();
		driver1.findElement(By.id("Text")).sendKeys("GOLLA BALARAJU");
		driver1.findElement(By.id("Username")).sendKeys("Balaraju13");
		driver1.findElement(By.id("Email_Id")).sendKeys("gollabalaraju616@gmail.com");
		driver1.findElement(By.id("Number")).sendKeys("9014143304");
		driver1.findElement(By.id("Password")).sendKeys("Balaraju123");
		driver1.findElement(By.id("ConfirmPassword")).sendKeys("Balaraju123");
		WebElement radio= driver1.findElement(By.id("male"));
		radio.click();
		driver1.findElement(By.id("submit")).click();
		driver1.findElement(By.id("username")).sendKeys("Balaraju13");
		driver1.findElement(By.id("Password")).sendKeys("Balaraju123");
		driver1.findElement(By.id("submit")).click();
		driver1.switchTo().alert();
	    Alert alert =driver1.switchTo().alert();
	    alert.accept();
	    driver1.switchTo().alert();
	    Alert alert1 =driver1.switchTo().alert();
	    alert1.accept();
	    driver1.switchTo().alert();
	    Alert alert2 =driver1.switchTo().alert();
	    alert2.accept();
	     //alert.ok();
		//driver1.close();
	}
}
