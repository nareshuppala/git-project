package ComprehensiveAssignment.SDETBasic_Naresh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	static WebDriver driver;

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","‪C:\\Selenium\\Drivers\\geckodriver.exe"); // Setting system properties of FirefoxDriver
WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
driver.manage().window().maximize();
driver.get("https://www.google.com/");

	}
}

