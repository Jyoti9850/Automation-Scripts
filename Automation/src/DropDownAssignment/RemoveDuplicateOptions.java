package DropDownAssignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateOptions {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/hp/Documents/DropDrown.html");
		WebElement multiDropDown = driver.findElement(By.cssSelector("[id='DropDown']"));
		Select s=new Select(multiDropDown);
		List<WebElement> duplicateOps = s.getOptions();
		TreeSet<String> set=new TreeSet<String>();
		for(int i=0;i<duplicateOps.size();i++)
		{
			String duplicate=duplicateOps.get(i).getText();
			set.add(duplicate);
		}
		for(String options:set)
		{
			System.out.println(options);
		}
	}

}
