package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	
	WebElement frameele = driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frameele);
	
	
	WebElement dateinput =driver.findElement(By.id("datepicker"));
	dateinput.click();
	
	WebElement SelectedDate =driver.findElement(By.xpath("//a[text()='22']"));
	
	SelectedDate.click();
	
	 String selectedDate = dateinput.getAttribute("value");
     System.out.println("Selected Date: " + selectedDate);
     
     
     driver.quit();


}}

