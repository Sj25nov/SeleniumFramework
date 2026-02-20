package ex_20022026_PageObjectModulePageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    //Constructor

    WebDriver driver;

    LoginPage(WebDriver driver){
        this.driver=driver;

    }
    //Locators


By Username=(By.xpath("//input[@placeholder='Username']"));
  By Passwordna=(By.xpath("//input[@placeholder='Password']"));
   By click=(By.xpath("//input[@placeholder='Password']"));

   //Actions Methods
 public void setusername(String username){
     driver.findElement(Username).sendKeys(username);
 }
    public void setPassword(String Password){
        driver.findElement(Passwordna).sendKeys(Password);
    }
    public void setclicklogin(String Click){driver.findElement(click).click();}


}
