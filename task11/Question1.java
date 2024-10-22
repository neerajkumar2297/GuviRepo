package task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {
       
        // Initialize WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Open a new browser instance and navigate to the URL
            driver.get("https://the-internet.herokuapp.com/windows");

            // 2. Click the "Click Here" button to open a new window
            WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
            clickHereButton.click();

            // 3. Store the handle of the original window
            String originalWindow = driver.getWindowHandle();

            // 4. Switch to the newly opened window
            Set<String> allWindows = driver.getWindowHandles();
            for (String windowHandle : allWindows) {
                if (!windowHandle.equals(originalWindow)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            // 5. Verify that the text "New Window" is present on the page
            WebElement newWindowText = driver.findElement(By.tagName("h3"));
            if (newWindowText.getText().equals("New Window")) {
                System.out.println("Text 'New Window' is present.");
            } else {
                System.out.println("Text 'New Window' is not present.");
            }

            // 6. Close the new window
            driver.close();

            // 7. Switch back to the original window
            driver.switchTo().window(originalWindow);

            // Verify that we are back to the original window
            if (driver.getWindowHandle().equals(originalWindow)) {
                System.out.println("Successfully switched back to the original window.");
            } else {
                System.out.println("Failed to switch back to the original window.");
            }

        } finally {
            // 8. Close the browser instance
            driver.quit();
        }
    }
}
