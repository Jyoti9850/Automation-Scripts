package WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Dimension diamention=new Dimension(200,100);//(height & width of browser)
		driver.manage().window().setSize(diamention);
		driver.get("https://google.com/");
	}


}
