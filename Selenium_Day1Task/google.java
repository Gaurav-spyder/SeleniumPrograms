package guviTask.Selenium_Day1Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().refresh();
		driver.close();
	}

}
