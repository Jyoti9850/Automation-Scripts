package ActitimeAssignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiAssignmentPopup {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://127.0.0.1/login.do;jsessionid=11bxrsz3yd7yr");
	driver.findElement(By.cssSelector("[name='username']")).sendKeys("admin",Keys.TAB);
	driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
	driver.findElement(By.cssSelector("[value='Create New Customer']")).click();
	driver.findElement(By.cssSelector("[name='name']")).sendKeys("ICIC");
	driver.findElement(By.cssSelector("[name='createCustomerSubmit']")).submit();
	driver.findElement(By.cssSelector("[value='Create New Project']")).click();
	Thread.sleep(3000);
    WebElement dropdown = driver.findElement(By.xpath("//select[@name='customerId']"));
    Select s=new Select(dropdown);
    Thread.sleep(2000);
    s.selectByIndex(1);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Web Application");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("[name='createProjectSubmit']")).submit();
    driver.findElement(By.xpath("(//input[contains(@name,'customers')])[1]")).click();
   // driver.findElement(By.cssSelector("[name='projects[13]']")).click();
    driver.findElement(By.cssSelector("[value='Delete Selected']")).click();
    Thread.sleep(3000);
    Alert alt = driver.switchTo().alert();
    alt.accept();
	
	}
	

}
