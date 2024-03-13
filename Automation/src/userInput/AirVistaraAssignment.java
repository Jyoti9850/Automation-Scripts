package userInput;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistaraAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://airvistara.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//input[@placeholder='Select Departure City'])[1]")).sendKeys("Pune");
		//driver.findElement(By.xpath("//input[@value='Pune (PNQ) ']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search destination']")).sendKeys("delhi");
		driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='6']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='9']")).click();
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
	}

}
