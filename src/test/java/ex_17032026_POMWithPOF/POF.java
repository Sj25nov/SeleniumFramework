package ex_17032026_POMWithPOF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POF {
    WebDriver driver;

    POF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement GiveMeUserID;
    @FindBy(xpath = "(//input[@placeholder='Password'])[1]")
    WebElement GiveMePassword;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement LoginButton;

    public void Setusername(String user) {
        GiveMeUserID.sendKeys(user);
    }

    public void SetPassword(String pass) {
        GiveMePassword.sendKeys(pass);
    }

    public void clickLoginButton() {
        LoginButton.click();

    }
}
