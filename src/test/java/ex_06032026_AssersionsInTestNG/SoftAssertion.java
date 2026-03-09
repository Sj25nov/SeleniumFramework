package ex_06032026_AssersionsInTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    @Test
    void softasertion(){
        System.out.println("softasertion");
        System.out.println("softasertion");

        SoftAssert AS=new SoftAssert();
        AS.assertEquals(1,3);
        System.out.println("softasertion");
        System.out.println("softasertion");
        AS.assertAll();
    }
}
