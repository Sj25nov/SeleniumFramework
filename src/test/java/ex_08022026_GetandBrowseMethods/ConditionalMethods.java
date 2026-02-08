package ex_08022026_GetandBrowseMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        Thread.sleep(5000);

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/register");

//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("Display Status Of Logo--->"+status);

//isEnabled()

     boolean status1=driver.findElement(By.xpath(" //input[@id='FirstName']")).isEnabled();
        System.out.println("The Element is enabled or not-->"+status1);


        WebElement malestatus=driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement femalestatus=driver.findElement(By.xpath(" //input[@id='gender-female']"));
        System.out.println("Before Selection--->"+malestatus.isSelected());
        System.out.println("Beforre Selection--->"+femalestatus.isSelected());


        System.out.println("After Selection the male");
        malestatus.click();

        System.out.println("After Selection"+malestatus.isSelected());
        System.out.println("After Selection"+femalestatus.isSelected());

        WebElement NewLetterStatus=driver.findElement(By.xpath("//input[@id='NewsLetterSubscriptions_0__IsActive']"));

        System.out.println("The Button is selected"+NewLetterStatus.isSelected());
    }
}
