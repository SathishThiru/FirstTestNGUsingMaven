package FlyusUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html#");
		driver.findElement(By.id("sdafg")).sendKeys("s");
		
	}

}
