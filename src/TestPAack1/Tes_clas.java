package TestPAack1;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tes_clas {

	public static void main(String[] args) 
	{
		
System.setProperty("webdriver.chrome.driver", "D:\\Testing Folder\\Selenium WebDriver\\Chrome Driver//chromedriver.exe");

WebDriver driver= new ChromeDriver();
driver.get("https://www.linkedin.com/notifications/?filter=all");

	}

}
