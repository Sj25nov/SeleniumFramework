package ex_22022026_HandledKeyboardEventstabs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.Text;

import java.time.Duration;

public class KeyboardActions {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        WebElement TextOn1= driver.findElement(By.xpath("(//textarea[@id='inputText1'])[1]"));

        TextOn1.sendKeys("Welcome To Java Automation Course");
        //This Four Actions We need To Perform
        Actions action = new Actions(driver);
//Action1----Ctrl+A
        action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //Action2--->Ctrl+C
        action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //Action3--->Tab
        action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        //Action4--->Ctrl+v
action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

//Clicked ON Compared
        WebElement Compare = driver.findElement(By.xpath("//div[@class='compareButtonText']"));
        Compare.click();

// Capture message element
        WebElement MSGONUI = driver.findElement(By.xpath("(//span[@class='messageForUser'])[1]"));

// Expected message
        String Expected_MSG = "The two texts are identical!";

// Get actual text from UI
        String Actual_MSG = MSGONUI.getText();

// Compare actual vs expected
        if (Actual_MSG.trim().equals(Expected_MSG.trim())) {
            System.out.println("The MSG IS COPY AND PASTE CORRECTLY AND VERIFIED....!!");
        } else {
            System.out.println("THE MSG IS NOT COPIED AND PASTE CORRECTLY.....!");
        }
        }
}
