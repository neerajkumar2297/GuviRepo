package task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
    public static void main(String[] args) {
        
        // Initialize WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Open the URL
            driver.get("http://the-internet.herokuapp.com/nested_frames");

            // 2. Switch to the top frame (iframe[name='frame-top'])
            driver.switchTo().frame(driver.findElement(By.name("frame-top")));

            // 3. Verify that there are three frames in the top frame
            // Frames: left, middle, right
            WebElement topFrame = driver.findElement(By.tagName("frameset"));
            int numberOfFrames = topFrame.findElements(By.tagName("frame")).size();
            if (numberOfFrames == 3) {
                System.out.println("Verified: There are 3 frames in the top frame.");
            } else {
                System.out.println("Error: Number of frames in the top frame is not 3.");
            }

            // 4. Switch to the left frame (iframe[name='frame-left'])
            driver.switchTo().frame(driver.findElement(By.name("frame-left")));

            // 5. Verify that the left frame has a text "LEFT"
            String leftText = driver.findElement(By.tagName("body")).getText();
            if (leftText.equals("LEFT")) {
                System.out.println("Verified: Left frame contains the text 'LEFT'.");
            } else {
                System.out.println("Error: Left frame text does not match 'LEFT'.");
            }

            // 6. Switch back to the top frame
            driver.switchTo().parentFrame();

            // 7. Switch to the middle frame (iframe[name='frame-middle'])
            driver.switchTo().frame(driver.findElement(By.name("frame-middle")));

            // 8. Verify that the middle frame has a text "MIDDLE"
            String middleText = driver.findElement(By.cssSelector("div")).getText();
            if (middleText.equals("MIDDLE")) {
                System.out.println("Verified: Middle frame contains the text 'MIDDLE'.");
            } else {
                System.out.println("Error: Middle frame text does not match 'MIDDLE'.");
            }

            // 9. Switch back to the top frame
            driver.switchTo().parentFrame();

            // 10. Switch to the right frame (iframe[name='frame-right'])
            driver.switchTo().frame(driver.findElement(By.name("frame-right")));

            // 11. Verify that the right frame has a text "RIGHT"
            String rightText = driver.findElement(By.tagName("body")).getText();
            if (rightText.equals("RIGHT")) {
                System.out.println("Verified: Right frame contains the text 'RIGHT'.");
            } else {
                System.out.println("Error: Right frame text does not match 'RIGHT'.");
            }

            // 12. Switch back to the top frame
            driver.switchTo().parentFrame();

            // 13. Switch to the bottom frame (iframe[name='frame-bottom'])
            driver.switchTo().defaultContent();  // Switch back to main document
            driver.switchTo().frame(driver.findElement(By.name("frame-bottom")));

            // 14. Verify that the bottom frame has a text "BOTTOM"
            String bottomText = driver.findElement(By.tagName("body")).getText();
            if (bottomText.equals("BOTTOM")) {
                System.out.println("Verified: Bottom frame contains the text 'BOTTOM'.");
            } else {
                System.out.println("Error: Bottom frame text does not match 'BOTTOM'.");
            }

        } finally {
            // 15. Close the browser instance
            driver.quit();
        }
    }
}
