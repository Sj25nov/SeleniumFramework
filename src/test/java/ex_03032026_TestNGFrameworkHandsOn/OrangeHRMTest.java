package ex_03032026_TestNGFrameworkHandsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

/*
1)-->Open HRM Application
2)-->Test Logo presence
3)-->Login Page
4)-->Close
 */
public class OrangeHRMTest {
WebDriver driver;

    @Test(priority=1)

    void Openapplication()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority=2)

void LogoPresence() throws InterruptedException {
    Thread.sleep(2000);
boolean Status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
    System.out.println("The Logo is presented by the following text: "+Status);
}
    @Test(priority=3)

void LoginTest()
{
driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
}
    @Test(priority=4)

void closebrowser()
{
driver.quit();
}

}

