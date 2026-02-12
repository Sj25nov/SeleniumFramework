package ex_12022026_BrowserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigateCommands {
    public static void main(String[] args) throws InterruptedException {

         WebDriver driver=new ChromeDriver();

         driver.manage().window().maximize();
        // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(10000);
         driver.navigate().to("https://demo.nopcommerce.com/register");
         driver.navigate().back();
         Thread.sleep(10000);
         System.out.println("URL BEFORE BACK---->"+driver.getCurrentUrl());
         driver.navigate().forward();
         System.out.println("URL AFTER FORWRD"+driver.getCurrentUrl());
         Thread.sleep(10000);

         driver.navigate().refresh();

        System.out.println("The Final URL is"+driver.getCurrentUrl());


        driver.quit();




    }
}
