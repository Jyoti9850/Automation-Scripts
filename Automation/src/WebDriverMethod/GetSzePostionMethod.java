package WebDriverMethod;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSzePostionMethod {
       public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Dimension size=driver.manage().window().getSize();
		System.out.println("size :"+size);
		 org.openqa.selenium.Point position=driver.manage().window().getPosition();
		System.out.println("position :"+position);
		//driver.close();
		 
	}

}
