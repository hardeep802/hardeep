import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyScript {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "G:\\testing\\chromedriver.exe");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("http://www.facebook.com");
		
		WebElement emailTextField = chromeDriver.findElement(By.id("email"));
		emailTextField.sendKeys("abcdef");
		
		WebElement passwordField = chromeDriver.findElement(By.xpath("//input[@id='pass']"));
		passwordField.sendKeys("123345");
		
		chromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		String text = chromeDriver.findElement(By.xpath("//div[@class='_xkv']/a")).getText();
		
		if(text.equals("Sign up for Facebook")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
	}
}
