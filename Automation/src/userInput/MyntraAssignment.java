package userInput;

import java.time.Duration;
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Shoes",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Red Tape Men Perforated Slip Resistant Lace-Up Sneakers']")).click();
		Thread.sleep(4000);
		WebElement price = driver.findElement(By.xpath("//h1[text()='Red Tape']/ancestor::div[@class='pdp-price-info']/descendant::span[@class='pdp-price']"));
        String shoesprice=price.getText();
        System.out.println(shoesprice);
	}

}
