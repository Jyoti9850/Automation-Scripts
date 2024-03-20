package TakeScreenShotAss;

import java.io.File;
import java.io.IOException;
import java.rmi.server.RemoteServer;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeScreenshotAssignment3 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		RemoteWebDriver rd=(RemoteWebDriver)driver;
		File scr = rd.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/image3.png");
		Files.copy(scr, dest);
		
	}

}
