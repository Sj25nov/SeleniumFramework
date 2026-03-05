package ex_04032026_TestNGAnnotationsAssertions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
Login
Search
Logout
Login
Adv search
Logout
 */
public class AnnotaionsBeforeMTHD {
@BeforeMethod
    void Login(){
        System.out.println("Login");
    }
    @Test(priority=1)
    void Search(){
        System.out.println("Search");
    }
   @AfterMethod()
    void Logout(){
        System.out.println("Logout");
    }
    @Test(priority=2)
    void AdvSearch(){
        System.out.println("AdvSearch");
    }

}
