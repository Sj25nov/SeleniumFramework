package ex_09032026_DependencyMethodsndGrouping;

import org.testng.annotations.Test;

public class GroupingLoginC1 {
    @Test(priority=1,groups = {"sanity"})
    void LoginByEmail()
    {
        System.out.println("LoginByEmail");
    }

    @Test(priority=2,groups = {"sanity"})
    void LoginByFaceBook(){
        System.out.println("LoginByFaceBook");
    }
    @Test(priority=3,groups = {"sanity"})
    void LoginByTwitter(){
        System.out.println("LoginByTwitter");
    }
}
