import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstRealScript {

	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\testing\\chromedriver.exe");
		ChromeDriver chromeDriver=new ChromeDriver();
		chromeDriver.get("http://www.facebook.com");
		
		WebElement username= chromeDriver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("hardy_802@yahoo.co.in");
		
		WebElement password=chromeDriver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("neenu@123");
		
		Thread.sleep(2000);
		WebElement login=chromeDriver.findElement(By.xpath("//input[@value='Log In']"));
		login.click();
		
	}
	
}
