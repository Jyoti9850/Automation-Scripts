package WebDriverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPostionMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Point point=new Point(250,200);//x & y axis
		driver.manage().window().setPosition(point);
		driver.get("https://google.com");
	}

}
