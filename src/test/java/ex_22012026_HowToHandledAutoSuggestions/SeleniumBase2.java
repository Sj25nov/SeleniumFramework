package ex_22012026_HowToHandledAutoSuggestions;

/*
 Test case
-------
1) Launch browser (chrome)
2) Open URL  https://demo.opencart.com/
3) Validate title should be   "Your Store"
4) close browser

 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBase2 {
    public static void main(String[] args) {
        //1) Launch browser (chrome)
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
//2) Open URL  https://demo.opencart.com/

        driver.get("https://www.opencart.com/index.php?route=cms/demo");

        //3) Validate title should be   "Your Store"
        String ActualTitle = driver.getTitle();

        if (ActualTitle.equals("OpenCart - Demo")) {
            System.out.println("Test PAsses");
        } else {
            System.out.println("Test Failed");

        }

        driver.quit();
    }
}