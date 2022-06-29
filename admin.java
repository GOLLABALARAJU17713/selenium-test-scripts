package project1;
// admin page
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class admin {
	 public static void main(String []args)
     {
   	  String path5="D:\\chromedriver.exe";
   	  System.setProperty("webdriver.chrome.driver", path5);
   	  WebDriver driver5=new ChromeDriver();
         driver5.get("file:///C:/Users/itctesting19/Desktop/Team1%20project/login1.html");
         driver5.findElement(By.id("username")).sendKeys("Balu17713");
         driver5.findElement(By.id("Password")).sendKeys("Balu17713");
         driver5.findElement(By.id("submit")).click();
         driver5.findElement(By.id("btn")).click();
         driver5.findElement(By.id("username")).sendKeys("Team1");
         driver5.findElement(By.id("Password")).sendKeys("Team1@1");
         driver5.findElement(By.id("btn")).click();
        // driver5.close();
     }

}
