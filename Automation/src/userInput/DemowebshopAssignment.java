package userInput;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebshopAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		/*WebElement e1=driver.findElement(By.className("ico-register"));
		e1.click();
		//WebElement e2=driver.findElement(By.className("forcheckbox"));
	//	e2.click();
		Thread.sleep(2000);
		WebElement e4=driver.findElement(By.id("gender-female"));
		e4.click();
		WebElement e3=driver.findElement(By.id("FirstName"));
		e3.sendKeys("Jyoti");
		WebElement e5=driver.findElement(By.id("LastName"));
		e5.sendKeys("Patil");
		WebElement e6=driver.findElement(By.id("Email"));
		e6.sendKeys("jyotipatil131099@gmail.com");
		WebElement e7=driver.findElement(By.id("Password"));
		e7.sendKeys("JyotiPatil@0321");
		WebElement e8=driver.findElement(By.id("ConfirmPassword"));
		e8.sendKeys("JyotiPatil@0321");
		WebElement e9=driver.findElement(By.id("register-button"));
		e9.click();*/
	/*	Thread.sleep(3000);
		WebElement e10=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/ul/li/li/a"));
		e10.click();*/
		/*WebElement e11=driver.findElement(By.className("ico-login"));
		e11.click();
		
		WebElement e12=driver.findElement(By.cssSelector("input[autofocus='autofocus']"));
		e12.sendKeys("jyotipatil131099@gmail.com");
		WebElement e13=driver.findElement(By.cssSelector("input[class='password']"));
		e13.sendKeys("JyotiPatil@0321");
		Thread.sleep(3000);
		WebElement e14=driver.findElement(By.className("login-button"));
		e14.click();*/
		Thread.sleep(3000);
		WebElement e15=driver.findElement(By.xpath("//a[@class='ico-login']"));
		e15.click();
		
		
	
    //	WebElement e3=driver.findElement(By.className("forcheckbox"));
	//	e3.click();
		
	}

}
