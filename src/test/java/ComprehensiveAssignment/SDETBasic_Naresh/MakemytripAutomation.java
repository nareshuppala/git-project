package ComprehensiveAssignment.SDETBasic_Naresh;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class MakemytripAutomation {

	    public static void main(String[] args) {
	        // Set up ChromeDriver path
	    	System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver-v0.36.0-win32\\geckodriver.exe"); // Setting system properties of FirefoxDriver
	    	WebDriver driver = new FirefoxDriver(); 

	        // Navigate to MakeMyTrip website
	        driver.get("https://www.makemytrip.com/");

	        // Click on Flights
	        clickElement(driver, By.xpath("//li[@data-cy='menu_Flights']"));
	        

	        // Select OneWay
	        clickElement(driver, By.xpath("//li[@data-cy='oneWayTrip']"));

	        // Enter FROM location
	        enterText(driver, By.xpath("//input[@id='fromCity']"), "New Delhi");
	        clickElement(driver, By.xpath("//p[contains(text(),'New Delhi, India')]"));

	        // Enter TO location
	        enterText(driver, By.xpath("//input[@id='toCity']"), "Mumbai");
	        clickElement(driver, By.xpath("//p[contains(text(),'Mumbai, India')]"));

	       //Click on search
	        clickElement(driver,By.xpath("//a[@data-cy='searchFlights']"));
	        
	        // Close the browser
	        //driver.quit();
	    }

	    // Generic function to click an element
	    public static void clickElement(WebDriver driver, By by) {
	        WebElement element = driver.findElement(by);
	        element.click();
	    }

	    // Generic function to enter text
	    public static void enterText(WebDriver driver, By by, String text) {
	        WebElement element = driver.findElement(by);
	        element.sendKeys(text);
	    }
	}