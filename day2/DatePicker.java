package day2;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://jqueryui.com/datepicker/");
		WebElement iframe=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
		WebElement calenderbox=driver.findElement(By.xpath("//input[@id='datepicker']"));
		calenderbox.click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//a[text()='22']")).click();
		Assert.assertEquals("11/22/2024",calenderbox.getDomProperty("value"));
		System.out.println("Assertion passed");
		driver.close();
		driver.quit();
	}

}
