package userInput;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorFacebookAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElement element1=driver.findElement(By.name("email"));
		//element1.sendKeys("jyotipatil131099@gmail.com");
		//WebElement element2=driver.findElement(By.id("pass"));
	//	element2.sendKeys("123456");
		//WebElement element3=driver.findElement(By.className("_42ft"));
	   //  element3.click();
	//	Thread.sleep(3000);
		WebElement e3=driver.findElement(By.linkText("Create new account"));
		e3.click();
		//Thread.sleep(3000);
		WebElement e4=driver.findElement(By.xpath("//input[@name='firstname']"));
		e4.sendKeys("abcd");
	//	Thread.sleep(3000);
        WebElement e5=driver.findElement(By.name("lastname"));
		e5.sendKeys("qwers");
		WebElement e6=driver.findElement(By.name("reg_email__"));
		e6.sendKeys("ABCD@gmail.com");
		WebElement e7=driver.findElement(By.name("reg_passwd__"));
		e7.sendKeys("123@0321");
		WebElement e8=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		e8.sendKeys("ABCD@gmail.com");
		WebElement e9=driver.findElement(By.name("birthday_day"));
		e9.sendKeys("10");
		WebElement e10=driver.findElement(By.name("birthday_month"));
		e10.sendKeys("11");
		WebElement e11=driver.findElement(By.name("birthday_year"));
		e11.sendKeys("2000");
		WebElement e12=driver.findElement(By.xpath("//input[@value='1']"));
		e12.click();
		WebElement e13=driver.findElement(By.name("websubmit"));
		e13.click();

	}

}
