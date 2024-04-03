package ScrollDownUpAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScrollAndTakeScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[text()='Allow']")).click();
		Thread.sleep(2000);
		WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions act=new Actions(driver);
		act.moveToElement(coin).perform();
		driver.findElement(By.xpath("(//span[text()='2 gram'])[1]")).click();
		WebElement gold = driver.findElement(By.xpath("//h1[text()=' 2 Gram 24 KT Gold Coins ']"));
		File src=gold.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/gold.png");
		Files.copy(src, dest);
		WebElement newsletter = driver.findElement(By.xpath("[id='newsletter_subscriber']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(true)",newsletter);
	}

}
