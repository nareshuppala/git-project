package ComprehensiveAssignment.SDETBasic_Naresh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyLogoFirefoxTest extends BaseTest {	
	
	  @BeforeMethod
	    public void setUpFirefox() {
	        browser = "firefox"; // set browser BEFORE initializing driver
	        super.setUp();       // call parent setup
	    }

	    @Test
	    public void testLogoPresenceOnFirefox() {
	        driver.get("https://www.makemytrip.com/");
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement logo = wait.until(
	            ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[alt='Make My Trip']"))
	        );
	        Assert.assertTrue(logo.isDisplayed(), "Logo should be visible.");
	    }
	}


