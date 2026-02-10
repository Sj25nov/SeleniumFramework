package ex_09022026_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitwait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        username.sendKeys("Admin");
        WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        password.sendKeys("admin123");
        WebElement LoginBTN=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        LoginBTN.click();

        String ExpectedUrl=driver.getCurrentUrl();
        String ActualUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        if(ExpectedUrl.equals(ActualUrl)){
            System.out.println("Happy HAppy.....!!!");
        }else
        System.out.println("Bad");

    }
}
