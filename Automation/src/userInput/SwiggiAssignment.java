package userInput;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggiAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://swiggy.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[alt='restaurants curated for idly']")).click();
		
	}

}
