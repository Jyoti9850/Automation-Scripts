package Assignment2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeAssignment {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoblaze.com");
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("Jyoti Patil");
		driver.findElement(By.id("loginpassword")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
		driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(3000);
		alt.accept();
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("//h3[text()='1180']"));
		String Ac_value1=price.getText();
		System.out.println(Ac_value1);
		String Ex_value2="1180";
		if(Ac_value1.equals(Ex_value2))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		driver.findElement(By.cssSelector("[id='name']")).sendKeys("Jyoti Patil");
		driver.findElement(By.cssSelector("[id='country']")).sendKeys("India");
		driver.findElement(By.cssSelector("[id='city']")).sendKeys("Pune");
		driver.findElement(By.cssSelector("[id='card']")).sendKeys("123454");
		driver.findElement(By.cssSelector("[id='month']")).sendKeys("april");
		driver.findElement(By.cssSelector("[id='year']")).sendKeys("2024");
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
	}

}
