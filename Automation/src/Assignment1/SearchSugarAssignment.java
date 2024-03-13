package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSugarAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zomato.com");
		driver.findElement(By.xpath("//p[text()='Blinkit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS")).click();
		driver.findElement(By.xpath("(//div[@class='tw-flex-0 tw-flex tw-w-full tw-flex-row'])[1]")).click();
		}

}
