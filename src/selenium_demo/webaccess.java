package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webaccess {
   public static void main(String[] args) {
	
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\rekha\\OneDrive\\Desktop\\Phase 5\\selenium\\95\\chromedriver.exe");
	   WebDriver wb = new ChromeDriver();
	   wb.manage().window().maximize();
	   //System.out.println(wb.getTitle());
		//System.out.println(wb.getCurrentUrl());
		//System.out.println(wb);
	  //web in internet
	   wb.get("file:///C:/Users/rekha/OneDrive/Desktop/phase_4/programming%20code/phase5/phase.html");
	   wb.findElement(By.tagName("Enter username")).sendKeys("rekha");
	   wb.findElement(By.tagName("password")).sendKeys("rekha123");
	   wb.findElement(By.tagName("Enter username")).sendKeys("rekha");
	   wb.findElement(By.tagName("button")).submit();	   
	   System.out.println(wb.getTitle());
	   System.out.println(wb.getCurrentUrl());
	   System.out.println(wb);
	  
	  
}
}
