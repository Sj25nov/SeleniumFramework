package ex_17032026_PageObjectModelWithOutPOF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestMethodWithoutPOF {
    WebDriver driver;
    @BeforeClass
   void Setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
        @Test
                void LoginTest() {
        PageObjectModelWithoutPOF PL=new  PageObjectModelWithoutPOF(driver);

        PL.setpassword("Admin");
        PL.setusername("admin");
        PL.clickonlogin();
        }

        @AfterClass
    void tearDown() {
        driver.quit();
    }


}
