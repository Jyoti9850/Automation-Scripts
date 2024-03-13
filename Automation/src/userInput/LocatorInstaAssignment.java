package userInput;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInstaAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element1=driver.findElement(By.tagName("input"));
		element1.sendKeys("9850750321");
		//Thread.sleep(3000);
		WebElement element2=driver.findElement(By.cssSelector("[type='password']"));
		element2.sendKeys("passsword");
		//Thread.sleep(3000);
		WebElement element3=driver.findElement(By.cssSelector("[type='submit']"));
	    element3.click();
	}

}


