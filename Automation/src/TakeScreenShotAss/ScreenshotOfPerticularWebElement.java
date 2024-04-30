package TakeScreenShotAss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfPerticularWebElement {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com");
		WebElement insta = driver.findElement(By.cssSelector("[aria-label='Instagram']"));
		File src=insta.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/photo1.png");
		Files.copy(src, dest);
	}

}
