package WebDriverMethod;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithGetMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String s=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://airvistara.com/");
		String actual_Title=driver.getTitle();
		String expected_Title="Book Flights & Check In Online | Vistara";
		if(actual_Title.equals(expected_Title))
		{
			System.out.println("Test case is Pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
	}

}
