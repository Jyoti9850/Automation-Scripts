package userInput;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketBookAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tickets.paytm.com/");
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("PNQ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("del");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
		driver.findElement(By.id("departureDate")).click();
		driver.findElement(By.xpath("(//div[text()='3'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addReturn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='6'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
	}

}
