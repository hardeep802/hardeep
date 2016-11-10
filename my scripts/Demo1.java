import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\testing\\chromeDriver.exe");
		ChromeDriver chromeDriver=new ChromeDriver();
		chromeDriver.get("https://www.makemytrip.com");
		String date="1-12-2016 ";
		int i=0;
		
		List<WebElement> element=chromeDriver.findElements(By.xpath("//div[7]/div[2]/table/tr[1]"));
		
		for(i=0; i<element.size();i++){
			Object WebElement;
			String elementvalue = element.get(i).getText();
			if(date.equals(elementvalue))
			element.get(i).click();
			}
			
		
		/*WebElement element= chromeDriver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tr"));
		System.out.println(element.getText());*/
				
			}

	private static RemoteWebDriver List(Object webElement) {
		// TODO Auto-generated method stub
		return null;
	}
			
		}
	

