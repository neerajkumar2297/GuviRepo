package task9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='History']")).click();
		
		String sectiontitle = driver.findElement(By.id("History")).getText();
		
		System.out.println("The title of the sections is : " +sectiontitle);
		
	
	
	}
	
	

}
