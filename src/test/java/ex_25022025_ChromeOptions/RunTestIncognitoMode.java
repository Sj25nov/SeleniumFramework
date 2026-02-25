package ex_25022025_ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class RunTestIncognitoMode {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        System.out.println(driver.getTitle());

        String ActualTittle = driver.getTitle();

        if (ActualTittle.contains("nopCommerce demo store. Home page title")) {
            System.out.println("Testcase Passed...!");
        } else {
            System.out.println("Testcase Failed...!");
        }
        driver.quit();
    }
}

