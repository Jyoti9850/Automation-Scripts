package WindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBlankTab {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
	    driver.switchTo().newWindow(WindowType.TAB);
	    String parentId = driver.getWindowHandle();
	    System.out.println(parentId);
	    Set<String> parentChild = driver.getWindowHandles();
	    System.out.println(parentChild);
	}

}
