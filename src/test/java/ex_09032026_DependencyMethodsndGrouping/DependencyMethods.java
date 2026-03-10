package ex_09032026_DependencyMethodsndGrouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {

    @Test (priority=1)
    void open_app()
    {
        Assert.assertTrue(true);
    }
    @Test (priority=2,dependsOnMethods={"open_app"})
    void Login(){
        Assert.assertTrue(false);
    }
    @Test (priority=3,dependsOnMethods={"Login"})
    void search(){
        Assert.assertTrue(true);
    }
    @Test (priority=4,dependsOnMethods={"Login"})
    void AdvSearch(){
        Assert.assertTrue(true);
    }
    @Test (priority=5,dependsOnMethods={"Login"})
    void Logout()
    {
        Assert.assertTrue(true);
    }
}
