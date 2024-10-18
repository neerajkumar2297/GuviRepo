package task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
				
		//Fetching Title of the page
		String Actualtitlefetched =driver.getTitle();
		
		String Expectedtitle = "STORE";
		
		if(Actualtitlefetched.equals(Expectedtitle)) {
			
			System.out.println("Page landed on correct website");
			
		}else {
			System.out.println("Page not landed on correct website");
		}
		
		
	}

}
