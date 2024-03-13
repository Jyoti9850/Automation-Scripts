package userInput;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Shoes",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Red Tape Men Perforated Slip Resistant Lace-Up Sneakers']")).click();
//		List<WebElement>shoesName=driver.findElements(By.xpath("//img[@class='img-responsive']"));
//		for(WebElement n:shoesName)
//		{
//			System.out.println(n.getText());
//		}
		driver.findElement(By.xpath(""))
	}

}
