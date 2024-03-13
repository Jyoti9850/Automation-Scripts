package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jyoti");
		driver.findElement(By.cssSelector("[id='email']")).sendKeys("jyoti@123gmail.com");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jyoti@123gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}

}
