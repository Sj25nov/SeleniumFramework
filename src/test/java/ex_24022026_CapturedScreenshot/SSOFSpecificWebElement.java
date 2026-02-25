package ex_24022026_CapturedScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class SSOFSpecificWebElement {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        WebElement Header=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

        File Inputfile=Header.getScreenshotAs(OutputType.FILE);

        File Outputfile=new File(System.getProperty("user.dir")+"\\Newcaptured.png");

        Inputfile.renameTo(Outputfile);



    }
}
