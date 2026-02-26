package ex_25022025_ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class EnabledChromeExtensions {
    public static void main(String[] args) throws InterruptedException {
       // ChromeOptions options = new ChromeOptions();
        ChromeOptions options=  new ChromeOptions();

     File file=new File("G:\\AutomationCourseUdemyNotes\\AdBlock.crx");
        options.addExtensions(file);
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://text-compare.com/");

    }
}
