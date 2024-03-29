package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlAss {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		//print url of flipkart
		System.out.println(driver.getCurrentUrl());
		//print title of flipkart on console
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
