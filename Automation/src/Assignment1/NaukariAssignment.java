package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("QWERTYUO");
		driver.findElement(By.cssSelector("[id='email']")).sendKeys("XYZ@123gmail.com");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("[id='mobile']")).sendKeys("9876543210");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='textWrap'])[2]")).click();
		driver.findElement(By.cssSelector("[name='currentCity']")).sendKeys("p");
		driver.findElement(By.xpath("//span[text()='une, Maharashtra']")).click();
		driver.findElement(By.className("resman-icon-check-box")).click();
		driver.findElement(By.xpath("//button[text()='Register now']")).click();
		
	}

}
