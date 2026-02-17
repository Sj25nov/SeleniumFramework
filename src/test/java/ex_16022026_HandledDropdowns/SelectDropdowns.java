package ex_16022026_HandledDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropdowns {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

      WebElement SelectCoubtryName= driver.findElement(By.xpath("//select[@id='country']"));
        Select dropdown = new Select(SelectCoubtryName);

//dropdown.selectByVisibleText("France");

       // dropdown.selectByValue("japan");

      //  dropdown.selectByIndex(5);

        //Capturee the options from dropdown

        List<WebElement> options=dropdown.getOptions();
//print th options
        for(int i=0;i<options.size();i++){
            System.out.println(options.get(i).getText());
        }

        System.out.println("The Total Numbers of options are--->"+options.size());

        if(options.size()==10){
            System.out.println("Your Testcase Passed");
        }else{
            System.out.println("Your Testcase Failed");
        }



    }
}
