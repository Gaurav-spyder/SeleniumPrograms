package day3;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		 Set<String> allWindowHandles= driver.getWindowHandles();
		 int Numwin=allWindowHandles.size();
	     System.out.println("Total Windows are : " +Numwin);
	     Iterator<String> it = allWindowHandles.iterator();
	     String parentWindow=it.next();
	     String childWindow=it.next();
	     driver.switchTo().window(childWindow);
	     String messsage=driver.findElement(By.tagName("h3")).getText();
	     System.out.println(messsage);
	     driver.close();
	     Set<String> allWindowHandles1= driver.getWindowHandles();
		 int Numwin1=allWindowHandles1.size();
	     System.out.println("Total Windows are : " +Numwin1);
	}

}
