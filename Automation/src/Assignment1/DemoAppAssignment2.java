package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppAssignment2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.linkText("Quick Start")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		WebElement nameTextField = driver.findElement(By.cssSelector("[id='name']"));
		System.out.println(nameTextField.isEnabled());
		driver.findElement(By.cssSelector("[id='email']"));
		System.out.println(nameTextField.isEnabled());
		WebElement pswTextField = driver.findElement(By.cssSelector("[id='password']"));
		System.out.println(nameTextField.isEnabled());
		


	}

}
