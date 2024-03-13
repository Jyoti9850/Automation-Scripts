package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		Thread.sleep(5000);
		//WebElement element=driver.findElement(By.tagName("input"));
		//element.sendKeys("books");
		WebElement searchtextfield=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Thread.sleep(5000);
		searchtextfield.sendKeys("books");
		//WebElement searchtextfield=driver.findElement(By.name("q"));
		//searchtextfield.sendKeys("Laptops");
		//WebElement searchbutton=driver.findElement(By.className("_2iLD__"));
		//searchbutton.click();
		
	}

}
