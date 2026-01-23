package ex_2212026Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.orangehrm.com/");

        driver.manage().window().maximize();

        WebElement searchbox1=driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']"));
        searchbox1.sendKeys("saurabhj1414@gmail.com");
        WebElement searchbox=driver.findElement(By.name("EmailHomePage"));






    }
}
