package TakeScreenShotAss;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeScreenShotAssignment5 {
	public static void main(String[] args) {
		RemoteWebDriver driver=new RemoteWebDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com");
		driver.getScreenshotAs(OutputType.FILE);
		File scr=new File("./screenshot/image5.png");
		Files.copy(scr, scr);
		
		
		
	}

}
