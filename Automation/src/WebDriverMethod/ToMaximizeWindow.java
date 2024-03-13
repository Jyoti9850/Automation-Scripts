package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeWindow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//String source = driver.getPageSource();
		//System.out.println(source);
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.amazon.com/";
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Url is correct");
		}
		else
		{
			System.out.println("Url is not correct");
		}
		driver.close();
	}

}
