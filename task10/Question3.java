package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.get("https://www.guvi.in/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	
	driver.findElement(By.id("name")).sendKeys("Neeraj Guvi");
	
	driver.findElement(By.id("email")).sendKeys("Neeraj4@Guvi.com");
	
	driver.findElement(By.id("password")).sendKeys("Neeraj1@Guvi");
	
	driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
	
	driver.findElement(By.id("signup-btn")).click();
	
		
	driver.get("https://www.guvi.in/");
	driver.findElement(By.id("login-btn")).click();
	
	driver.findElement(By.id("email")).sendKeys("neerajkumar2297@gmail.com");
	
	driver.findElement(By.id("password")).sendKeys("Neeraj2297@");
	
	driver.findElement(By.id("login-btn")).click();
	
	Thread.sleep(1000);
	
	WebElement ele =driver.findElement(By.xpath("//iframe[@xpath='1']"));
	
	driver.switchTo().frame(ele);
	
	try {
	driver.findElement(By.id("details-btn")).click();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	String actualmsg =driver.findElement(By.xpath("//h1[@class='mainHeading']")).getText();
	
	System.out.println(actualmsg);
	
	String expectedmsg = "Welcome to GUVI!";
	
	if(actualmsg.equalsIgnoreCase(expectedmsg)) {
		System.out.println("Logged IN Successfully");
	}else
		System.out.println("Logged IN Unuccessful");
	
	
	
	
	}}
