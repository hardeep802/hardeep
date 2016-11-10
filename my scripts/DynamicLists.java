import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLists {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\testing\\chromeDriver.exe");
		
		ChromeDriver chromeDriver=new ChromeDriver();
		chromeDriver.get("file:///C:/Users/AC-101/Desktop/index.html");
		
		List<WebElement> rows = chromeDriver.findElements(By.xpath("//div[@class='summary']/div"));
		List<WebElement> columnHeadings = chromeDriver.findElements(By.xpath("//div[@class='summary']/div[1]/div"));
		
		int nameColumnIndex = 0;
		
		
		for(int j = 1; j <= columnHeadings.size(); j++) {
			
			if(columnHeadings.get(j -1).getText().equals("Name")) {
				nameColumnIndex = j;
			}
		}
		
		
		for(int i = 2; i <= rows.size(); i++) {
			
			WebElement nameElement = chromeDriver.findElement(By.xpath("//div[@class='summary']/div[" + i + "]/div[" + nameColumnIndex +"]"));
			if(nameElement.getText().equals("Meenakshi")) {
				System.out.println("Meenakshi is at row: " + (i - 1) + " and column: " + nameColumnIndex);
			}
		}
		
	}
}
