package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Booking {
		
	@Test
    public static void bookingTest() {
    	WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.booking.com");
        WebElement country = driver.findElement(By.cssSelector("[name=\"ss\"]"));
        country.clear();
        country.sendKeys("Hanoi?");
//        WebElement countrySelect = driver.findElement(By
//        		.cssSelector("[data-testid=\"destination-container\"] li:nth-of-type(1)"));
//        countrySelect.click();
        driver.quit();
    }
}
