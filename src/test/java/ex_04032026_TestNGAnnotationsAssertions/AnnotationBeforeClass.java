package ex_04032026_TestNGAnnotationsAssertions;

import org.testng.annotations.*;

/*
1)-Login
2)-Search
3)-Advance Search
4)-Logout

 */
public class AnnotationBeforeClass {
@BeforeClass
    void Login(){
        System.out.println("Login");
    }
@Test(priority = 0)
    void Search(){
        System.out.println("Search");
    }
@AfterClass
    void Logout(){
        System.out.println("Logout");
    }
@Test(priority = 1)
    void AdvSearch(){
        System.out.println("AdvSearch");
    }
}
