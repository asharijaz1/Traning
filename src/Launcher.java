import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launcher {
	public static List findLinks(WebDriver webdriver )
	{
		ArrayList allelements = new ArrayList();
		allelements = driver.findElement(By.tagName("a"));
		
		
		
		return null;
		
		
		
	}	
	
	
	
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","lib/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/");

}
}

