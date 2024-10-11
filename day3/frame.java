package day3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		

		WebElement top=driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(top);
		int framecount=driver.findElements(By.xpath("//frame")).size();
		System.out.println(framecount);//total frame count
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
		String leftFrame=driver.findElement(By.xpath("//html/body")).getText();
		System.out.println(leftFrame);//left frame message
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		String middleFrame=driver.findElement(By.xpath("//html/body")).getText();
		System.out.println(middleFrame);//middle frame message
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
		String rightFrame=driver.findElement(By.xpath("//html/body")).getText();
		System.out.println(rightFrame);//right frame message
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));
		String bottomFrame=driver.findElement(By.xpath("//html/body")).getText();
		System.out.println(bottomFrame);//bottom frame message
		driver.switchTo().defaultContent();
		WebElement topagain=driver.findElement(By.xpath("//frame[@name='frame-top']"));//switch back to top frame
		driver.switchTo().frame(topagain);
		int framecount1=driver.findElements(By.xpath("//frame")).size();
		System.out.println(framecount1);//total frame count
		String title=driver.getCurrentUrl();
		System.out.println(title);
	}

}
