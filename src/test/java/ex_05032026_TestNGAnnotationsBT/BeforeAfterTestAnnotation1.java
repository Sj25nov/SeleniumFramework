package ex_05032026_TestNGAnnotationsBT;

import org.testng.annotations.*;

public class BeforeAfterTestAnnotation1 {
 /*   1)-Login
2)-Search
3)-Advance Search
4)-Logout

 */
    public class AnnotationBeforeClass {

     @Test
     void abc()
     {
         System.out.println(" this is abc from C1..");
     }

     @BeforeTest
     void bt()
     {
         System.out.println("this is BeforeTest method....");
     }

 }
}
