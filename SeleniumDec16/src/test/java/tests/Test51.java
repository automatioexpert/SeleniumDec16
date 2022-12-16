package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test51 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://openeducat.org/");
		driver.findElement(By.xpath("//i[@class=\"fa pe-7s-user fa-2x\"]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		driver.findElement(By.cssSelector("input#login")).sendKeys("useer454545745454597@gc.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("dkhfh57977777777777777777777");
		String txt = driver.findElement(By.cssSelector("button[type='submit']")).getText();
		System.out.println(txt);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
