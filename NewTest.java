package project1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTest {
	WebDriver driver;
  @Test
  
  public void tstmd() {
	  String path1="D:\\chromedriver.exe";
	  System.setProperty("Webdriver.chrome.driver",path1);
	  driver=new ChromeDriver();
	  driver.get("file:///C:/Users/itctesting19/Desktop/Team1%20project/login1.html");
	//  String org="We are Lanches the Organ Donation Website...!";
	 // String actual=driver.getTitle();
	  //Assert.assertEquals(org,actual);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("website is starting..!");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
