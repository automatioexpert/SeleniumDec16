package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://openeducat.org/feature-omr");
		driver.findElement(By.xpath("//span[contains(text(),'Demo')]")).click();
		System.out.println(driver.findElement(By.cssSelector("div.text-center>h2")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.text-center>h2+p")).getText());
		System.out.println(driver.findElement(By.cssSelector("img[alt='OpenEduCat Inc']")).isDisplayed());
		driver.switchTo().frame("kiwi-big-iframe-wrapper");
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Chat with')]")).getText());
		driver.quit();
	}

}
