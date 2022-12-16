package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
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
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("input#name")).sendKeys("mike 24833284334343843");
		driver.findElement(By.cssSelector("input#org_id")).sendKeys("usere4754545945");
		driver.findElement(By.cssSelector("div.iti__selected-flag")).click();

		List<WebElement> countrys = driver.findElements(By.cssSelector("span.iti__country-name"));
		for (WebElement country : countrys) {

			if (country.getText().equalsIgnoreCase("Bolivia")) {
				country.click();
			}

		}

		driver.findElement(By.cssSelector("input[name='email_from']")).sendKeys("Usere45459457454745@gc.coms");
		WebElement sel=driver.findElement(By.cssSelector("select[name='demo_for']"));
		Select select =new Select(sel);
		select.selectByValue("university");
		System.out.println(driver.findElement(By.cssSelector("span#demo_instance_submit")).getText());
	}

}
