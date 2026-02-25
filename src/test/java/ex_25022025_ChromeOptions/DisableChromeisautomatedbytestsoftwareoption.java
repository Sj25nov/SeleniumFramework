package ex_25022025_ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DisableChromeisautomatedbytestsoftwareoption {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");

        //  driver.manage().window().maximize();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());

        String ActualTittle = driver.getTitle();

        if (ActualTittle.contains("Just a moment")) {
            System.out.println("Testcase Passed...!");
        } else {
            System.out.println("Testcase Failed...!");
        }
    }

    }
