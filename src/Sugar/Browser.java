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

public class Browser {
	
	static WebDriver driver;
	 
	public static void main(String []args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","lib/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://localhost/SugarPro-Full-7.9.2.0/");
		
	//driver.
//driver.findElement(By.name("q")).sendKeys("Rolustech");	
//driver.findElement(By.name("btnK")).click();
		   CSVReader reader = new CSVReader(new FileReader("practice.csv"), ',' , '"' , 0);
		      List<String[]> arr=new ArrayList<String []>();

		      //Read CSV line by line and use the string array as you want
		      String[] nextLine;
		      while ((nextLine = reader.readNext()) != null) {
		         if (nextLine != null) {
		            //Verifying the read data here
		      arr.add(nextLine);
		     
		        //	 System.out.println(Arrays.toString(nextLine));
		            
		   
		         }
		       }
String n;
String v;
String xp;
String hook1;	
//System.out.println(v);
//System.out.println(xp);
//TimeUnit.SECONDS.sleep(3000);
TimeUnit.SECONDS.sleep(3);
v=arr.get(19)[1];
xp=arr.get(19)[2];
hook1=arr.get(19)[3];

driver.findElement(Strategy(hook1,xp)).sendKeys(v);
//driver.findElement(By.xpath(xp)).sendKeys(v);
v=arr.get(20)[1];
xp=arr.get(20)[2];
hook1=arr.get(20)[3];
driver.findElement(Strategy(hook1,xp)).sendKeys(v);
//driver.findElement(By.xpath(xp)).sendKeys(v);
driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
TimeUnit.SECONDS.sleep(2);
driver.findElement(By.xpath("//li[@data-module='Accounts']/span[contains(@class,'btn-group')]/a")).click();
TimeUnit.SECONDS.sleep(1);
driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
TimeUnit.SECONDS.sleep(3);

v=arr.get(1)[1];
xp=arr.get(1)[2];
hook1=arr.get(1)[3];
driver.findElement(Strategy(hook1,xp)).sendKeys(v);
//driver.findElement(By.xpath(xp)).sendKeys(v);
TimeUnit.SECONDS.sleep(1);
v=arr.get(2)[1];
xp=arr.get(2)[2];
hook1=arr.get(2)[3];
driver.findElement(Strategy(hook1,xp)).sendKeys(v);
//driver.findElement(By.xpath(xp)).sendKeys(v);
v=arr.get(3)[1];
xp=arr.get(3)[2];
hook1=arr.get(3)[3];
driver.findElement(Strategy(hook1,xp)).click();
//driver.findElement(By.xpath(xp)).click();
v=arr.get(13)[1];
xp=arr.get(13)[2];
hook1=arr.get(13)[3];
driver.findElement(Strategy(hook1,xp)).click();
//driver.findElement(By.xpath(xp)).click();

v=arr.get(5)[1];
xp=arr.get(5)[2];
hook1=arr.get(5)[3];
driver.findElement(Strategy(hook1,xp)).click();
//driver.findElement(By.xpath(xp)).click();
		
v=arr.get(14)[1];
xp=arr.get(14)[2];
hook1=arr.get(14)[3];
driver.findElement(Strategy(hook1,xp)).click();
//driver.findElement(By.xpath(xp)).click();

TimeUnit.SECONDS.sleep(2);
v=arr.get(6)[1];
xp=arr.get(6)[2];
hook1=arr.get(6)[3];
driver.findElement(Strategy(hook1,xp)).click();
//driver.findElement(By.xpath(xp)).click();

TimeUnit.SECONDS.sleep(1);
v=arr.get(15)[1];
xp=arr.get(15)[2];
hook1=arr.get(15)[3];
driver.findElement(Strategy(hook1,xp)).click();
//driver.findElement(By.xpath(xp)).click();

TimeUnit.SECONDS.sleep(2);
v=arr.get(16)[1];
xp=arr.get(16)[2];
hook1=arr.get(16)[3];
driver.findElement(Strategy(hook1,xp)).click();
//driver.findElement(By.xpath(xp)).click();
v=arr.get(4)[1];
xp=arr.get(4)[2];
hook1=arr.get(4)[3];
TimeUnit.SECONDS.sleep(2);
driver.findElement(Strategy(hook1,xp)).click();
//driver.findElement(By.xpath(xp)).click();
TimeUnit.SECONDS.sleep(2);
v=arr.get(17)[1];
xp=arr.get(17)[2];
hook1=arr.get(17)[3];
driver.findElement(Strategy(hook1,xp)).sendKeys(v);
//driver.findElement(By.xpath(xp)).sendKeys(v);
TimeUnit.SECONDS.sleep(1);

xp=arr.get(18)[2];
hook1=arr.get(18)[3];
driver.findElement(Strategy(hook1,xp)).click();
//driver.findElement(By.xpath(xp)).click();
TimeUnit.SECONDS.sleep(1);
driver.findElement(By.xpath("//button[@class='btn btn-link btn-invisible more']")).click();
v=arr.get(7)[1];
xp=arr.get(7)[2];
hook1=arr.get(7)[3];
driver.findElement(Strategy(hook1,xp)).sendKeys(v);
//driver.findElement(By.xpath(xp)).sendKeys(v);
v=arr.get(8)[1];
xp=arr.get(8)[2];
hook1=arr.get(8)[3];
driver.findElement(Strategy(hook1,xp)).sendKeys(v);
//driver.findElement(By.xpath(xp)).sendKeys(v);
v=arr.get(9)[1];
xp=arr.get(9)[2];
hook1=arr.get(9)[3];
driver.findElement(Strategy(hook1,xp)).sendKeys(v);
//driver.findElement(By.xpath(xp)).sendKeys(v);
v=arr.get(10)[1];
xp=arr.get(10)[2];
hook1=arr.get(10)[3];
driver.findElement(Strategy(hook1,xp)).sendKeys(v);
//driver.findElement(By.xpath(xp)).sendKeys(v);		
v=arr.get(12)[1];
xp=arr.get(12)[2];
hook1=arr.get(12)[3];
driver.findElement(Strategy(hook1,xp)).sendKeys(v);
//		driver.findElement(By.xpath(xp)).sendKeys(v);
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
	   







	TimeUnit.SECONDS.sleep(3);	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
	driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	TimeUnit.SECONDS.sleep(2);
	
	
	driver.findElement(By.xpath("//li[@data-module='Accounts']/span[contains(@class,'btn-group')]/a")).click();
	TimeUnit.SECONDS.sleep(2);
	driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	SetField("//input[@class='search-name']", "Andy Flower");
	
	TimeUnit.SECONDS.sleep(1);
	SetDropdown("account_type","Analyst");
	TimeUnit.SECONDS.sleep(1);
	SetField("//input[@name='name']","Khurram Ijaz");
	
	//Update 
	
	driver.findElement(By.xpath("//input[@class='search-name']")).sendKeys("Andy Flower");
	TimeUnit.SECONDS.sleep(2);
	driver.findElement(By.xpath("//a[@class='btn dropdown-toggle']//i")).click();
	TimeUnit.SECONDS.sleep(2);
	driver.findElement(By.xpath("//ul//a[@name='edit_button']")).click();
	driver.findElement(By.xpath("//input[@name='name']")).clear();
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Grant Flower");
	driver.findElement(By.xpath("//a[@name='inline-save']")).click();
	TimeUnit.SECONDS.sleep(50);
	
	
	//Delete 
	driver.findElement(By.xpath("//input[@class='search-name']")).sendKeys("Ashar");
	TimeUnit.SECONDS.sleep(2);
	driver.findElement(By.xpath("//a[@class='btn dropdown-toggle']//i")).click();
	TimeUnit.SECONDS.sleep(1);
	driver.findElement(By.xpath("//ul//a[@name='delete_button']")).click();
	TimeUnit.SECONDS.sleep(1);
	driver.findElement(By.xpath("//a[@data-action='confirm']")).click();
	TimeUnit.SECONDS.sleep(60);
	
	
	
	driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	TimeUnit.SECONDS.sleep(2);
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Chandimal");
	driver.findElement(By.xpath("//input[@name='website']")).sendKeys("Website");
driver.findElement(By.xpath("//span[@data-fieldname='industry']//a[@class='select2-choice select2-default']")).click();
driver.findElement(By.xpath("//div[@id='select2-drop']//*[text()='Banking']")).click();

SetDropdown("account_type","Analyst");

driver.findElement(By.xpath("//span[@data-fieldname='account_type']//a[@class='select2-choice select2-default']")).click();
TimeUnit.SECONDS.sleep(1);
driver.findElement(By.xpath("//div[@id='select2-drop']//*[text()='Analyst']")).click();
TimeUnit.SECONDS.sleep(2);
driver.findElement(By.xpath("//span[@data-fieldname='assigned_user_name']//a[@class='select2-choice']")).click();
TimeUnit.SECONDS.sleep(1);
driver.findElement(By.xpath("//li[@class='select2-result']")).click();
TimeUnit.SECONDS.sleep(2);
driver.findElement(By.xpath("//input[@id='Users_select_1']")).click();
TimeUnit.SECONDS.sleep(2);
driver.findElement(By.xpath("//span[@data-fieldname='parent_name']//a[@class='select2-choice select2-default']")).click();
TimeUnit.SECONDS.sleep(2);
driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Ashar");
TimeUnit.SECONDS.sleep(1);
driver.findElement(By.xpath("//div[@id='select2-drop']//ul[@class='select2-results']//li[1]")).click();
TimeUnit.SECONDS.sleep(1);
driver.findElement(By.xpath("//input[@name='phone_office']")).sendKeys("03214505508");
driver.findElement(By.xpath("//button[@class='btn btn-link btn-invisible more']")).click();
driver.findElement(By.xpath("//textarea[@name='billing_address_street']")).sendKeys("Street 2 ");
driver.findElement(By.xpath("//input[@name='billing_address_city']")).sendKeys("Lahore");
driver.findElement(By.xpath("//input[@name='billing_address_state']")).sendKeys("Punjab");
driver.findElement(By.xpath("//input[@name='billing_address_postalcode']")).sendKeys("54000");
driver.findElement(By.xpath("//input[@name='billing_address_country']")).sendKeys("Pakistan");
driver.findElement(By.xpath("//div[@class='btn-toolbar pull-right']//a[@class='btn btn-primary']")).click();
TimeUnit.SECONDS.sleep(10);

//boolean x = false;
//try{
	//x=driver.findElement(By.xpath("//a[@name='duplicate_button']")).isDisplayed();
//System.out.println("temp"+x);
//}
//catch(Exception e){}

//TimeUnit.SECONDS.sleep(1);

//if(x==true)	
//{
//driver.findElement(By.xpath("//a[@name='duplicate_button']")).click();
//}
	   


	
	}

	private static By Strategy(String hook, String xp) {
		hook=hook.toUpperCase();
		if (hook.equals("XPATH")){
			return(By.xpath(xp));
			
		}		
		else if (hook.equals("css"))
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

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void SetField(String path, String value) {
		driver.findElement(By.xpath(""+path+"")).sendKeys(""+value+"");
		
	}

	private static void SetDropdown(String data_fieldname, String value) throws InterruptedException {
	
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//span[@data-fieldname='"+data_fieldname+"']//a[@class='select2-choice select2-default']")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//div[@id='select2-drop']//*[text()='"+value+"']")).click();
		
	}


	


}

