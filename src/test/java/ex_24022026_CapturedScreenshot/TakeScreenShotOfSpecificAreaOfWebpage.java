package ex_24022026_CapturedScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class TakeScreenShotOfSpecificAreaOfWebpage {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        WebElement featuredproducts=driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));

        File sourcefile=featuredproducts.getScreenshotAs(OutputType.FILE);

        File targetfile=new File(System.getProperty("user.dir")+"\\NewAssignmetss.png");
        sourcefile.renameTo(targetfile);
    }
}
