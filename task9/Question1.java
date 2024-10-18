package task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
				
		//Fetching Current Url
		String url =driver.getCurrentUrl();
		
		System.out.println("The Current Url is " + url);
		
		//Reloading the page
		driver.navigate().refresh();
		
		driver.close();
		
		
		
	}

}
