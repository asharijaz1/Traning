import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
		
	 
	
	 
		public static void main(String []args) {
			System.setProperty("webdriver.chrome.driver","lib/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.gmail.com");
		}
	}
