	package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://openeducat.org/");
		System.out.println(driver.findElement(By.cssSelector("h1.logo")).isDisplayed());
		driver.findElement(By.cssSelector("a[href*='event']")).click();
		driver.findElement(By.cssSelector("a[href*='Workshop']")).click();
		
		Select select =new Select(driver.findElement(By.id("sn")));
		select.selectByValue("s2");
		System.out.println("Dropdown value is selected");
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
