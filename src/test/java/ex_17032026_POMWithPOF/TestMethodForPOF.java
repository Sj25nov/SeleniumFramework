package ex_17032026_POMWithPOF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestMethodForPOF {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @Test
    void testLogin(){
        POF PF=new POF(driver);
        PF.Setusername("Admin");
        PF.SetPassword("admin");
        PF.clickLoginButton();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");


    }
    @AfterClass
    void teardown(){
        driver.quit();
    }
}
