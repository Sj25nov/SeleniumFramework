package ex_21022026HandledMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropAction {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);

        WebElement Source= driver.findElement(By.xpath("//img[@id='img1']"));
        WebElement Target= driver.findElement(By.xpath("//div[@ondrop='dropHandler(event)']"));

        Actions action=new Actions(driver);

        action.dragAndDrop(Source,Target).perform();

        if(Source.getText().equals(Target.getText())){
            System.out.println("The Text Is DragAndDrop Successfully");
        }else {
            System.out.println("The Text Is Not DragAndDrop Successfully");
        }


    }
}
