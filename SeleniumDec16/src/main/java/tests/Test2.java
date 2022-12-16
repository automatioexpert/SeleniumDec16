package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.adrnresearch.org/main/");
		System.out.println(driver.findElement(By.cssSelector("h1.logo")).isDisplayed());
		driver.findElement(By.cssSelector("a[href*='publications']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.navi")).getText());
		System.out.println(driver.findElement(By.cssSelector("footer#footer")).getText());
		driver.findElement(By.cssSelector("i.axi.axi-angle-double-right")).click();
		driver.findElement(By.cssSelector("i.axi.axi-angle-double-right")).click();
		driver.quit();
	}
}
