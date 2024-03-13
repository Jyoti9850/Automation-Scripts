package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchBrowser {
	public static void main(String[] args) {
		
		WebDriver  driver=new ChromeDriver();
		driver.get("https://WWW.flipkart.com/");
	    String actual_Title=driver.getTitle();
//	    String expected_Title="Online Shopping,Flipkart";
//	    if(actual_Title.equals(expected_Title))
//	    {
//	    	System.out.println("Test case is pass");
//	    }
//	    else
//	    {
//	    	System.out.println("test case is Fail");
//	    }
	    System.out.println(actual_Title);
		
	}
	
}


