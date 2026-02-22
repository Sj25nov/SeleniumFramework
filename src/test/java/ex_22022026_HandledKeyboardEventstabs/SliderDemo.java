package ex_22022026_HandledKeyboardEventstabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderDemo {
    public static void main(String[] args) {
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
driver.manage().window().maximize();
Actions actions=new Actions(driver);

WebElement MinSlider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
System.out.println("Location of Webelement Before minslider is"+MinSlider.getLocation()); //(59, 250)--->(x,y)
actions.dragAndDropBy(MinSlider,100,250).build().perform();

System.out.println("The Location Of WebELementAfter MinSlider is"+MinSlider.getLocation()); //(158, 250)
 WebElement MaxSlider=driver.findElement(By.xpath("//span[2]"));
 System.out.println("The Position of WebElemnet Before maxSlider is"+MaxSlider.getLocation()); //(613, 250)
        actions.dragAndDropBy(MaxSlider,-100,250).build().perform();
        System.out.println("The Position Of WebELement After MaxSlider is"+MaxSlider.getLocation());//(513, 250)

        WebElement MsgOnUI= driver.findElement(By.xpath("(//div[@id='searchResults'])[1]"));
        System.out.println(MsgOnUI.getText());
        String MSG="Here List of products will be shown which are cost between 2400 and 6900";
        if(MsgOnUI.getText().contains(MSG)){
            System.out.println("TestCAses PAssed");
        }else {
            System.out.println("TestCAses Not Passed");
        }




    }
}
