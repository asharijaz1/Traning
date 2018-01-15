import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main (String []args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","lib/chromedriver");
		WebDriver driver = new ChromeDriver();
     driver.get("https://twitter.com");
     int respCode=200;
     String url ="";
     HttpURLConnection huc =null;
     List<WebElement> links =driver.findElements(By.tagName("a"));
     Iterator<WebElement> it = links.iterator();
     while(it.hasNext())
     {
    	 
    	url = it.next().getAttribute("href");
    	System.out.println(url);
    	if (url==null||url.isEmpty())
    	{
    	System.out.println("Url is empty or it is not configured");	
    	}
    	try {
    huc =(HttpURLConnection)(new URL(url).openConnection());
    huc.setRequestMethod("HEAD");
    huc.connect();
    respCode=huc.getResponseCode();
    if(respCode>=400)
    {
    	System.out.println(url + "Is a broken Link");
    	
    	
    }
    else {
    	System.out.println(url + "Is a valid link");
    }
    		
    		
    		
    	} catch (MalformedURLException e)
    	{
    		e.printStackTrace();
    		
    	} catch (IOException e)
    	{
    		
    		e.printStackTrace();
    	}
     }     
     
	driver.quit();
	}
	
	
}
