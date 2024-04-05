package test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Irctc_pageclass;


public class Irctc_testclass {
	WebDriver driver;
	  @BeforeTest
	  public void setup()

	         {
	  	   driver = new ChromeDriver();
	           	
	           }
	  
	  @BeforeMethod
	  public void urlopen()
	  {
	  	driver.get("https://www.irctc.co.in/nget/train-search");
	  	//driver.manage().window().maximize();
	  }
	  @Test
	  public void test() throws IOException 
	  
	  {
		  Irctc_pageclass  ir=new Irctc_pageclass (driver);
		  ir.setvalues("ernakulam", "kollam");
         
         ir.click();
         ir.datepicker();
	 
	  ir.dropdown();

	  WebElement logo =driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[2]"));
		File src= logo.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./screen//logo.png"));
		  
		  
		  
		  
		  
	  }	  
		  
}
