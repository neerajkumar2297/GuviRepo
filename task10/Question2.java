package task10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
						
		WebElement iframeEle=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				
		driver.switchTo().frame(iframeEle);
		
		WebElement element1 = driver.findElement(By.id("draggable"));
		WebElement element2 = driver.findElement(By.id("droppable"));
		
		String colorBeforedrop = element2.getCssValue("background-color");
		
		Thread.sleep(3000);
		
		Actions objact = new Actions(driver);
		objact.dragAndDrop(element1, element2).build().perform();
		
		String x = element2.getText();
		
		if(x.equalsIgnoreCase("Dropped!")) {
			System.out.println("DragAndDrop Successful");
		}else
			System.out.println("DragAndDrop Not Successful");
		
		String colorAfterdrop = element2.getCssValue("background-color");
			
		if(colorBeforedrop.equalsIgnoreCase(colorAfterdrop)) {
			System.out.println("color not changed");
		}else
			System.out.println("color changed");
			
       }

}
