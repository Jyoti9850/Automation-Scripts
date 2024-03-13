package userInput;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlixAssignment {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://netflix.com");
		WebElement e1=driver.findElement(By.xpath("//a[text()='Sign In']"));
		e1.click();
		WebElement e2=driver.findElement(By.xpath("//input[@autocomplete=\"email\"and @name=\"userLoginId\"]"));
		e2.sendKeys("Abcd@gmail.com");
		WebElement e3=driver.findElement(By.xpath("//input[@data-uia='password-field']"));
		e3.sendKeys("123456");
		WebElement e4=driver.findElement(By.xpath("//button[@data-uia='login-submit-button']"));
		e4.click();

	}

}
