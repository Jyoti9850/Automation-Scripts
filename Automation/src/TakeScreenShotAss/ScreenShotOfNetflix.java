package TakeScreenShotAss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShotOfNetflix {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://netflix.com");
		WebElement netflix = driver.findElement(By.className("ev1dnif2"));
		Actions act=new Actions(driver);
		File src=netflix.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/netflix.png");
		Files.copy(src, dest);
	}

}
