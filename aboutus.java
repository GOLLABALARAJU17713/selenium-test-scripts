package project1;
// about us 
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class aboutus {
	 public static void main(String []args)
     {
    	 String path4="D:\\chromedriver.exe";
    	 System.setProperty("webdriver.chrome.driver", path4);
    	 WebDriver driver4=new ChromeDriver();
    	 driver4.get("file:///C:/Users/itctesting19/Desktop/Team1%20project/login1.html");
    	 driver4.findElement(By.id("username")).sendKeys("Balu17713");
    	 driver4.findElement(By.id("Password")).sendKeys("Balu17713");
    	 driver4.findElement(By.id("submit")).click();
    	 driver4.findElement(By.id("about")).click();
    	 //driver4.close();
     }

}
