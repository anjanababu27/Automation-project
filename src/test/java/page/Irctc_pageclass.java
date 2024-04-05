package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Irctc_pageclass {
	WebDriver driver;
	By Ifrom=By.xpath("//*[@id=\"origin\"]/span/input");
	By Ito=By.xpath("//*[@id=\"destination\"]/span/input");
	By Idate=By.xpath("//*[@id=\"jDate\"]/span/input");
	By Imonth= By.xpath("//*[@id=\\\"jDate\\\"]/span/div/div/div[1]/div/span[1]");
    By Iarrow=By.xpath("//*[@id=\\\"jDate\\\"]/span/div/div/div[1]/a[2]/span/span");
    By Ialldate=By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[2]/td[6]/a");
	By Idrop=By.xpath("//*[@id=\"journeyClass\"]/div/div[3]/span");
	
	public  Irctc_pageclass(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void setvalues(String from,String to)
	{
		//driver.findElement(login).click();
		driver.findElement(Ifrom).sendKeys(from);
		driver.findElement(Ito).sendKeys(to);
		
	}
	/*public void alert()
	{
		driver.switchTo().alert().accept();
	}*/
	public void click()
	{
	driver.findElement(Idate).click();
	
	}
	public void datepicker() 
	{
		driver.findElement(Idate).click();
		  while(true)
		  {
			  WebElement month=driver.findElement(Imonth);
			  String month1=month.getText();
			  if(month1.equalsIgnoreCase("March 2024"))
			  {
				  System.out.println(month1);
				  break;
			  }
			  else
			  {
				driver.findElement(Iarrow).click();  
			  }
			  
		}
		List <WebElement> alldates1=driver.findElements(Ialldate);
		  for( WebElement dates:alldates1)
		  {
			  String s=dates.getText();
			  System.out.println(s);
			  if(s.equals("5"))
			  {
				  System.out.println(s);
				  dates.click();
			  System.out.println("date selected");
			  break;
			  }
		
	}
		}
	
	public void dropdown()	
	{
		driver.findElement(Idrop).click();
	}
	}
	
		
	
	

