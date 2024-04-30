package TakeScreenShotAss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakeScreenShotUsingThirdPartyClass {
	
	private static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		EventFiringWebDriver driver1=new EventFiringWebDriver(driver);
		driver1.get("http://flipkart.com");
		File src=driver1.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/photo.png");
		Files.copy(src, dest);
	}

}
