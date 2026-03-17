package ex_17032026_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModelWithoutPOF {

//Constructor
    WebDriver driver;
    PageObjectModelWithoutPOF(WebDriver driver){
        this.driver=driver;

    }
    //Loactors


By LoginID=By.xpath("//input[@placeholder='Username']");
 By Password=  By.xpath("(//input[@placeholder='Password'])[1]");;
     By Login=       By.xpath("//button[normalize-space()='Login']");
    //Actions

    public void setusername(String user) {
        driver.findElement(LoginID).sendKeys(user);
    }
    public void setpassword(String pass){
        driver.findElement(Password).sendKeys(pass);
    }
    public void clickonlogin(){
        driver.findElement(Login).click();
    }


    }



