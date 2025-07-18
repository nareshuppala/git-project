package ComprehensiveAssignment.SDETBasic_Naresh;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookFlightChromeTest extends BaseTest {

    @Test
    public void testFlightSearchChrome() throws InterruptedException {
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(5000); // Wait for modal

        // Click Flights tab
        driver.findElement(By.xpath("//span[text()='Flights']")).click();

        // Click OneWay
        driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).click();

        // Enter FROM
        driver.findElement(By.xpath("//label[@for='fromCity']")).click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");

        // Enter TO
        driver.findElement(By.xpath("//label[@for='toCity']")).click();
        driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Mumbai");
    }
}

