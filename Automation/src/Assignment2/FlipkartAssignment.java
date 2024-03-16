package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAssignment {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://Flipkart.com");
		WebElement fashionLink = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act=new Actions(driver);
		act.moveToElement(fashionLink).perform();
		WebElement wf = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		act.contextClick(wf).perform();
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		driver.findElement(By.xpath("(//a[text()='Candidate Login'])[1]")).click();
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("989765458");
		driver.findElement(By.cssSelector("[class='recaptcha-checkbox-border']")).click();
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	}

}
