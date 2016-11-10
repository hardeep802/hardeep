import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MyActionsScript {
	public static void main(String[]args){
		
		System.setProperty("webdriver.chrome.driver", "G:\\testing\\chromedriver.exe");
		ChromeDriver chromeDriver=new ChromeDriver();
		
		chromeDriver.get("http://newtours.demoaut.com/");
		
		Actions actions = new Actions(chromeDriver);
		actions.moveToElement(chromeDriver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"))).moveToElement(chromeDriver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"))).click().perform();
		
		
		
		
	}
	
	
	

}
