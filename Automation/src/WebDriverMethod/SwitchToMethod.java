package WebDriverMethod;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

//import java.security.Key;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		driver.findElement(By.xpath("//canvas[@jsname=\"h797r\"]")).click();	
		
		//Thread.sleep(2000);
		/*driver.navigate().to("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();*/
		
	}

}
