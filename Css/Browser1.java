package Sugar;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Functions;

import au.com.bytecode.opencsv.CSVReader;

public class Browser1 {
	
	static WebDriver driver;
	 
	public static void main(String []args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","lib/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://localhost/SugarPro-Full-7.9.2.0/");
		
	//driver.
//driver.findElement(By.name("q")).sendKeys("Rolustech");	
//driver.findElement(By.name("btnK")).click();
		   CSVReader reader = new CSVReader(new FileReader("css.csv"), ',' , '"' , 0);
		      List<String[]> arr=new ArrayList<String []>();

		      //Read CSV line by line and use the string array as you want
		      String[] nextLine;
		      
		      TimeUnit.SECONDS.sleep(3);	
			  	driver.findElement(By.cssSelector("input[name=username]")).sendKeys("admin");
			  	driver.findElement(By.cssSelector("input[name=password]")).sendKeys("admin");
			  	driver.findElement(By.cssSelector("a[name=login_button]")).click();
			  	TimeUnit.SECONDS.sleep(3);
				driver.findElement(By.xpath("//li[@data-module='Accounts']/span[contains(@class,'btn-group')]/a")).click();
			  	TimeUnit.SECONDS.sleep(2);
			  	driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();
			  	driver.findElement(By.xpath("//button[@class='btn btn-link btn-invisible more']")).click();
         	while ((nextLine = reader.readNext()) != null) {
		         if (nextLine != null) {
		            //Verifying the read data here
		     arr.add(nextLine);
		     String Xpp;
		    Xpp=nextLine[2];
		    String vall;
		    vall=nextLine[1];
		    System.out.println(vall);
		    
		    String Hook_st;
		    Hook_st=nextLine[3];
		    String type;
		    type=nextLine[4];    
            if (type.equals("field"))
            {
            	TimeUnit.SECONDS.sleep(2);
            	SetField(Hook_st,Xpp,vall);
            }
            else if (type.equals("dropdown"))
            {
            	TimeUnit.SECONDS.sleep(2);
            	SetDropdown(Hook_st,Xpp);
            	
            }
                  }
	  }
		  	driver.findElement(By.xpath("//div[@class='btn-toolbar pull-right']//a[@class='btn btn-primary']")).click();
          TimeUnit.SECONDS.sleep(10);
          boolean x = false;
		  	try{
		  		x=driver.findElement(By.xpath("//a[@name='duplicate_button']")).isDisplayed();
		      	System.out.println("temp"+x);
		  	}
		  	catch(Exception e){}
            TimeUnit.SECONDS.sleep(1);
            if(x==true)	
		  	{
		  	driver.findElement(By.xpath("//a[@name='duplicate_button']")).click();
		  	}
		 }
    private static String getText(String detailed_Xpp, String detailedHook_startegy) {
		String text ;
		text=driver.findElement(Strategy(detailedHook_startegy,detailed_Xpp)).getText();
return text;
	}
private static By Strategy(String hook, String xp) {
		hook=hook.toUpperCase();
		if (hook.equals("XPATH")){
			return(By.xpath(xp));
			
		}		
		else if (hook.equals("CSS"))
		{
			return(By.cssSelector(xp));
		}
		else if (hook.equals("name"))
		{
			return(By.name(xp));
		}
		else if (hook.equals("id"))
		{
			return(By.id(xp));
		}
		else
		return null;
	 
	}

private static void SetField(String hook_string, String xpp,String value) {
		driver.findElement(Strategy(hook_string,xpp)).sendKeys(""+value+"");	
	}
private static void SetDropdown(String hook_string, String xpp) throws InterruptedException {
	
		driver.findElement(Strategy(hook_string,xpp)).click();
	}

}

