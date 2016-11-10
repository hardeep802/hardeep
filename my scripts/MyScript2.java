import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyScript2 {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","G:\\testing\\chromedriver.exe");
		ChromeDriver chromeDriver2= new ChromeDriver();
		chromeDriver2.get("http://www.makemytrip.com");
		
		Thread.sleep(2000);
		
		WebElement flights=chromeDriver2.findElement(By.xpath("//span [@class='flgh_pic tab_icn']"));
		flights.click();
		
		WebElement Domestic=chromeDriver2.findElement(By.xpath("//a [@class='row segmented_btn first  active  ']"));
		Domestic.click();
		
		WebElement oneway=chromeDriver2.findElement(By.xpath("//span[@class='radio_state']"));
		oneway.click();
		
		Thread.sleep(2000);
		
		WebElement departure=chromeDriver2.findElement(By.xpath("//input[@id='from_typeahead1']"));
		departure.click();
		departure.sendKeys("DEL");
		
		WebElement destination=chromeDriver2.findElement(By.xpath("//input[@id='to_typeahead1']"));
		destination.click();
		destination.sendKeys("TRV");
		
		WebElement selectdate=chromeDriver2.findElement(By.xpath("//span [@class='selctdate']"));
		selectdate.click();
		
		WebElement setdate=chromeDriver2.findElement(By.xpath("//a [@class='ui-state-default']"));
		setdate.click();
		
		/*WebElement numOfAdults=chromeDriver2.findElement(By.xpath("//a[@onclick=('incrementer('29')]"));
		numOfAdults.click();*/
		
		WebElement selectclass=chromeDriver2.findElement(By.xpath("//select [@name='select_class']"));
		selectclass.sendKeys("e");
		
		WebElement selectairlines=chromeDriver2.findElement(By.xpath("//select [@id='prefferedAirline']"));
		selectairlines.sendKeys("i");
		
		WebElement submit=chromeDriver2.findElement(By.xpath("//a [@id='flights_submit']"));
		submit.click();
		
		Thread.sleep(2000);
		WebElement book=chromeDriver2.findElement(By.xpath("//a [@class='btn btn-md select_button pull-right hidden-xs btn-primary-red']"));
		book.click();
		
		Thread.sleep(1000);
		WebElement email=chromeDriver2.findElement(By.xpath("//input [@type='email']"));
		email.sendKeys("hardeep802@gmail.com");
		
		WebElement continueguest=chromeDriver2.findElement(By.xpath("//a [@class='btn btn-lg btn-block btn-primary-red ng-binding']"));
		continueguest.click();
		
		WebElement iagree=chromeDriver2.findElement(By.xpath("//a [@class='btn btn-block btn-primary-red btn-md btn-insur']"));
		iagree.click();
		
		WebElement firstname=chromeDriver2.findElement(By.xpath("//input [@placeholder='First Name']"));
		firstname.sendKeys("Hardeep");
		
		WebElement lastname=chromeDriver2.findElement(By.xpath("//input [@placeholder='Last Name']"));
		lastname.sendKeys("Kaur");
		
		Thread.sleep(1000);
		WebElement gender=chromeDriver2.findElement(By.xpath("//a [@class='segmented_btn map_view_btn last pull-left col-lg-6 col-md-6 col-sm-6 col-xs-6']"));
		gender.click();
		
		WebElement age=chromeDriver2.findElement(By.xpath("//input [@placeholder='Age']"));
		age.sendKeys("35");
		
		WebElement mobNum=chromeDriver2.findElement(By.xpath("//input [@placeholder='Mobile Number']"));
		mobNum.sendKeys("9995235533");
		
		WebElement continueTopay=chromeDriver2.findElement(By.xpath("//a [@class='btn btn-lg btn-primary-red col-lg-5 col-md-5 col-sm-5 col-xs-12 ng-binding']"));
		continueTopay.click();
		
		Thread.sleep(5000);
		WebElement selectcard=chromeDriver2.findElement(By.xpath("//li[@id='DC_tab']/a"));
		selectcard.click();
		
		WebElement selectbank=chromeDriver2.findElement(By.xpath("//select [@id='PAYMENT_DC_otherBank']"));
		selectbank.sendKeys("ICICI");
		
		WebElement cardholder=chromeDriver2.findElement(By.xpath("//input [@id='PAYMENT_nameOnCard']"));
		cardholder.sendKeys("Hardeep Kaur");
		
		WebElement cardnum=chromeDriver2.findElement(By.xpath("//input [@id='PAYMENT_cardNumber']"));
		cardnum.sendKeys("1234567890123456");
		
		WebElement expmonth=chromeDriver2.findElement(By.xpath("//select [@id='PAYMENT_expiryMonth']"));
		expmonth.sendKeys("08");
		
		WebElement expyear=chromeDriver2.findElement(By.xpath("//select [@id='PAYMENT_expiryYear']"));
		expyear.sendKeys("2020");
		
		WebElement cvv=chromeDriver2.findElement(By.xpath("//input[@id='PAYMENT_cvv']"));
		cvv.sendKeys("345");
		
		Thread.sleep(1000);
		WebElement address=chromeDriver2.findElement(By.xpath("//textarea[@name='PAYMENT_billingAddress']"));
		address.sendKeys("29,new prem nagar");
		
		WebElement pincode=chromeDriver2.findElement(By.xpath("//input[@id='PAYMENT_billingPin']"));
		pincode.sendKeys("147001");
		
		WebElement entercity=chromeDriver2.findElement(By.xpath("//input[@id='PAYMENT_billingCity']"));
		entercity.sendKeys("Patiala");
		
		WebElement enterstate=chromeDriver2.findElement(By.xpath("//input[@id='PAYMENT_billingState']"));
		enterstate.sendKeys("Punjab");
		
		WebElement entercountry=chromeDriver2.findElement(By.xpath("//select[@id='PAYMENT_billingCountry']"));
		entercountry.sendKeys("India");
		
		
	}
}
