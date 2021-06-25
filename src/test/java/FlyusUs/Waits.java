package FlyusUs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	WebDriverWait w = new WebDriverWait(driver, 5);
	w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("email")));
	
	
	FluentWait <WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(Throwable.class);
	f.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("email" )));
	



}
}
