package Assignment2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStonAssignment {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.bluestone.com/");
		 driver.findElement(By.xpath("//span[text()='Allow']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Gold coins",Keys.ENTER);
		 driver.findElement(By.cssSelector("[alt='1 gram 24 KT Gold Coin']")).click();
		 String parentWindow=driver.getWindowHandle();
		 System.out.println(parentWindow);
		  Set<String> allwindowId = driver.getWindowHandles();
		 System.out.println(allwindowId);
		  for(String id:allwindowId)
		  {
			  driver.switchTo().window(id);
			  if(driver.getTitle().equals("1 gram 24 KT Gold Coin | BlueStone.com"))
			  {
				  System.out.println("title is correct");
				  driver.findElement(By.id("buy-now")).click();
			  }
		
		  }
	}
}
		  
	   


