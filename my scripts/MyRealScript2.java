import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyRealScript2 {
	public static void main(String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver","G:\\testing\\chromedriver.exe");
		ChromeDriver chromeDriver=new ChromeDriver();
		chromeDriver.get("https://www.flipkart.com");
		WebElement search=chromeDriver.findElement(By.xpath("//input [@placeholder='Search for Products, Brands and More']"));
		search.click();
		search.sendKeys("samsung mobiles");
		
		WebElement click= chromeDriver.findElement(By.xpath("//button[@type='submit']"));
		click.click();
		
		Thread.sleep(2000);
	    WebElement productname= chromeDriver.findElement(By.xpath("//div[@class='_3wU53n']"));
	    productname.click();
	    
	   Thread.sleep(3000);
	    WebElement buyproduct=chromeDriver.findElement(By.xpath("//button[text()='BUY NOW']"));
	    buyproduct.click();
	    
	    WebElement enteremail=chromeDriver.findElement(By.xpath("//input[@class='fk-input ng-invalid ng-invalid-required ng-dirty']"));
	    enteremail.click();
	    enteremail.sendKeys("hardeep802@gmail.com");
	    
	    WebElement continue1= chromeDriver.findElement(By.xpath("//input[@value='Continue']"));
	    continue1.click();
	    
	    Thread.sleep(1000);
	    WebElement entermobnum=chromeDriver.findElement(By.xpath("//input[@placeholder='Enter mobile number']"));
	    entermobnum.click();
	    entermobnum.sendKeys("9995235533");
	    
	    WebElement continueagain= chromeDriver.findElement(By.xpath("//input[@value='Continue']"));
	    continueagain.click();
	     		
	}

}
