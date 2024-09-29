package guviTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikipedia {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='View history']")).click();
		String titleSection=driver.getTitle();
		System.out.println(titleSection);

	}

}
