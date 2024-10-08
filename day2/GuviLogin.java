package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuviLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guvi.in/");
		WebElement signupbtn=driver.findElement(By.xpath("//a[text()='Sign up']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(signupbtn));
		signupbtn.click();
		driver.findElement(By.id("name")).sendKeys("Gaurav");
		driver.findElement(By.id("email")).sendKeys("Dummy@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Dummy123");
		driver.findElement(By.id("mobileNumber")).sendKeys("0123456789");
		driver.findElement(By.id("signup-btn")).click();
		driver.navigate().to("https://www.guvi.in/");
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.id("email")).sendKeys("Dummy@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Dummy123");
		driver.findElement(By.id("login-btn")).click();
		
	}

}
