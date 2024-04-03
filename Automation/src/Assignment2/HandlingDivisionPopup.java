package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDivisionPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		//driver.findElement(By.className("px-4 m-2 ")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ABCD@gmail.com");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	}

}
