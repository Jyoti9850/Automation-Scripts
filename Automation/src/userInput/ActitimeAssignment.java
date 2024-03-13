package userInput;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ActitimeAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=11bxrsz3yd7yr");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("manager3");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("13101999");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("13101999");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("satej");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("patil");
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		
	}

}
