package userInput;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphism {
	static WebDriver driver;
	public static void main(String[] args) {
		while(true) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your browser");
	String browser=sc.next();
	if(browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browser.equals("FireFox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browser.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		System.out.println("Enter valid Browser");
	}
  }
}
}
	


