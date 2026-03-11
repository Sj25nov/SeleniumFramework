package ex_10032026_DataProvidersAndParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParamTests
{
    WebDriver driver;
    @BeforeClass
    void setup(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://support.orangehrm.com/portal/en/signin");
        driver.manage().window().maximize();
    }

    @Test
    void validateLogo(){
        boolean Status=driver.findElement(By.xpath("//div[@title='OrangeHRM']")).isDisplayed();
        Assert.assertEquals(Status,true);

    }
    @Test
    void validateCurrentTitle(){
        Assert.assertEquals(driver.getTitle(),"OrangeHRM | Sign In");
        System.out.println(driver.getTitle());

    }
    @Test
    void validatecurrentUrl(){
Assert.assertEquals(driver.getCurrentUrl(),"https://support.orangehrm.com/portal/en/signin");
    }
    @AfterClass
    void tearDown(){
        driver.quit();

    }
}
