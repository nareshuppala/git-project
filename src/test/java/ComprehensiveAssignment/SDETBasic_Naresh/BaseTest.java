package ComprehensiveAssignment.SDETBasic_Naresh;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class BaseTest {
	    protected WebDriver driver;
	    protected String browser = "chrome"; // Change to "firefox" for Firefox tests

	    @BeforeMethod
	    public void setUp() {
	        if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();
	        }
	        driver.manage().window().maximize();
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}



