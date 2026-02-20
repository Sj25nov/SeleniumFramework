package ex_20022026_PageObjectModulePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;

    void setup() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        void testlogin ()
        {
            LoginPage loginpagee = new LoginPage(driver);
            loginpagee.setusername("Admin");
            loginpagee.setPassword("admin123");
            loginpagee.setclicklogin();
            Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        }
        void teardown () {
            driver.quit();
        }

    }
}
