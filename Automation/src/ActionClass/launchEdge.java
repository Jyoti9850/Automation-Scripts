package ActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchEdge {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://instagram.com");
	}

}
