package ex_05032026_TestNGAnnotationsBT;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterTestAnnotation3 {
    @Test
    void pqr()
    {
        System.out.println("this is pqr from C3..");
    }


    @BeforeSuite
    void bs()
    {
        System.out.println("This is BeforeSuite method..");
    }

    @AfterSuite
    void as()
    {
        System.out.println("This is AfterSuite method..");
    }
}
