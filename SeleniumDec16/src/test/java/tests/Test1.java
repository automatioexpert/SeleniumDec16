package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://openeducat.org/feature-omr");
		driver.findElement(By.xpath("//span[contains(text(),'Features')]")).click();
		List<WebElement> items = driver.findElements(By.cssSelector("ul>li>a"));
		System.out.println("Total elements: "+items.size());
		for (WebElement item : items) {
			System.out.println(item.getText());
		}

		driver.quit();
	}

}
