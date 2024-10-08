package guviTask.Selenium_Day1Task;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demoblaze {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		String expectedTitle="STORE";
		String actualTitle=driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Page landed on correct website");
		        } 
		else
		    System.out.println("Page not landed on correct website");
		       
	}

}
