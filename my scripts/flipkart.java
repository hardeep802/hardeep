import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart{
	
	public static void main(String[]args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","G:\\testing\\chromedriver.exe");
		
		ChromeDriver chromeDriver2= new ChromeDriver();
		
		chromeDriver2.get("http://www.flipkart.com");
		
		Thread.sleep(3000);
		WebElement search=chromeDriver2.findElement(By.xpath("//input [@placeholder='Search for Products, Brands and More']"));
		search.click();
		search.sendKeys("samsung mobiles");
		
		WebElement clicktosearch=chromeDriver2.findElement(By.xpath("//button[@type='submit']"));
		clicktosearch.click();
		
		Thread.sleep(2000);
		WebElement productname=chromeDriver2.findElement(By.xpath("//div[@class='_3wU53n']"));
		productname.click();
		
		Thread.sleep(2000);
		WebElement buyproduct=chromeDriver2.findElement(By.xpath("//button[text()='BUY NOW']"));
		buyproduct.click();
		
		Thread.sleep(3000);
		WebElement enteremail=chromeDriver2.findElement(By.xpath("//input[@class='fk-input ng-invalid ng-invalid-required ng-dirty']"));
		enteremail.click();
		enteremail.sendKeys("hardeep802@gmail.com");
		
		WebElement continue1=chromeDriver2.findElement(By.xpath("//input[@value='Continue']"));
		continue1.click();
		Thread.sleep(1000);
		WebElement entermob=chromeDriver2.findElement(By.xpath("//input[@id='mobile']"));
		entermob.click();
		entermob.sendKeys("7907274501");
		
		WebElement continueagain=chromeDriver2.findElement(By.xpath("//input[@value='Continue']"));
		continueagain.click();
}
}



