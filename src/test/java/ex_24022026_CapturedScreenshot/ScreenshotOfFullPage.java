package ex_24022026_CapturedScreenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class ScreenshotOfFullPage {
    public static void main(String[] args) {

WebDriver driver=new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demo.nopcommerce.com/");

driver.manage().window().maximize();

TakesScreenshot TS=(TakesScreenshot)driver;

File sourceFile=TS.getScreenshotAs(OutputType.FILE);

File TargetFile=new File(System.getProperty("user.dir")+"\\Screenshot.png");
//File TargetFile=new File("G:\\AutomationCourseUdemyNotes\\ScreenshotsAutomation.png");
sourceFile.renameTo(TargetFile);



    }
}
