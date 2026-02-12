package ex_12022026_BrowserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigateCommands {
    public static void main(String[] args) {

         WebDriver driver=new ChromeDriver();

         driver.manage().window().maximize();
        // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");





    }
}
