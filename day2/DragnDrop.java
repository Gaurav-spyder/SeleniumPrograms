package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://jqueryui.com/droppable/");
		WebElement iframe=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a = new Actions(driver);
		String colorBefore= source.getCssValue("color");
		System.out.println("color Before: "+colorBefore);
		a.dragAndDrop(source, target).build().perform();
		String colorAfter= target.getCssValue("color");
		System.out.println("color After: "+colorAfter);
		String txt=driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
		System.out.println(txt);
	}

}
