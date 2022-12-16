package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://openeducat.org/feature-omr");
		driver.findElement(By.xpath("//span[contains(text(),'Pricing')]")).click();
		List<WebElement> enters = driver.findElements(By.cssSelector("div.enterprise_name"));

		for (WebElement enter : enters) {
			System.out.println(enter.getText());
		}
		System.out.println("===================================");
		WebElement ele = driver.findElement(By.xpath("//div[@class='pb48 pt64 row quick-link']"));

		List<WebElement> links = ele.findElements(By.tagName("a"));
		
		System.out.println("footer links: " + links.size());
		for (WebElement link : links) {
			System.out.println(link.getText());
		}

		driver.quit();
	}

}
