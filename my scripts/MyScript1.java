import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyScript1{
	
	public static void main(String[]args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","G:\\testing\\chromedriver.exe");
		ChromeDriver chromeDriver1= new ChromeDriver();
		chromeDriver1.get("http://www.facebook.com");
		WebElement emailTextField1=chromeDriver1.findElement(By.id("email"));
		emailTextField1.sendKeys("hardy_802@yahoo.co.in");
		WebElement passwordField = chromeDriver1.findElement(By.xpath("//input[@id='pass']"));
		passwordField.sendKeys("neenu@123");

		chromeDriver1.findElement(By.xpath("//input[@value='Log In']")).click();


		/*WebElement statusfield = chromeDriver1.findElement(By.xpath("//textarea[@name='xhpc_message']"));
		statusfield.sendKeys("# this msg is auto generated");

		chromeDriver1.findElement(By.xpath("//button [@class='_42ft _4jy0 _ej1 _4jy3 _4jy1 selected _51sy']")).click();*/
		
		Thread.sleep(1000);
 
		/*WebElement message= chromeDriver1.findElement(By.xpath("//div[@class='uiToggle _4962 _1z4y']"));
		message.click();
		Thread.sleep(2000);
		
		WebElement newmessage= chromeDriver1.findElement(By.xpath("//a [@ajaxify='/ajax/messaging/composer.php']"));
		newmessage.click();*/
		
       
       WebElement search= chromeDriver1.findElement(By.xpath("//input[@placeholder='Search Facebook']")); 
       search.click();
       search.sendKeys("Preet kaur k,multani mal college");
       
       WebElement searchbutton= chromeDriver1.findElement(By.xpath("//button[@type='submit']")); 
       searchbutton.click();
       
       Thread.sleep(5000);
       WebElement message= chromeDriver1.findElement(By.xpath("//div[@class='_6a uiPopover _5tfz']")); 
       message.click();
       
       WebElement sendmessage= chromeDriver1.findElement(By.xpath("//a[@ajaxify='/ajax/messaging/composer.php?ids%5B0%5D=100001733938883&ref=search']")); 
       sendmessage.click();
       
       Thread.sleep(4000);
       
       WebElement messageField= chromeDriver1.findElement(By.xpath("//textarea[@placeholder='Write a message...']")); 
       messageField.sendKeys("your account is hacked");
       
       Thread.sleep(2000);
       WebElement submitmsg= chromeDriver1.findElement(By.xpath("//button[@class='_42ft _4jy0 layerConfirm _2ok uiOverlayButton _4jy4 _4jy1 selected _51sy']")); 
       submitmsg.click();
	}
}
       

	
