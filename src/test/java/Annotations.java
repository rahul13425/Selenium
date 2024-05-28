import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("Before site");
    }

    @BeforeClass
    public void Beforeclass(){
        System.out.println("before class");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before test");
    }

    @BeforeMethod
    public void Beforemethod(){
        System.out.println("Before method");
    }

    @Test
    public void test(){
        System.out.println("running test");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("after method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("after class");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("After suite");
    }


}
