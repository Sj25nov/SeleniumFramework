package ex_09032026_DependencyMethodsndGrouping;

import org.testng.annotations.Test;

public class GroupingPaymentTestC3 {

    @Test (priority=1,groups={"sanity","regression"})
    void PaymentinRupees(){
        System.out.println("PaymentinRupees");
    }
    @Test (priority=2,groups={"sanity","regression"})
    void PaymentinDollars()
    {
        System.out.println("PaymentinDollars");
    }
    @Test (priority=3,groups={"sanity","regression"})
    void PaymentinCoins()
    {
        System.out.println("PaymentinCoins");
    }
}
