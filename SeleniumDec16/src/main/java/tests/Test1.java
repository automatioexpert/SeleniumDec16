package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.adrnresearch.org/main/");
		System.out.println(driver.findElement(By.cssSelector("h1.logo")).isDisplayed());
		driver.findElement(By.cssSelector("a[href*='publications']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.navi")).getText());
		List<WebElement> elements = driver.findElements(By.cssSelector("p.subject"));
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}

		driver.quit();
	}
}
