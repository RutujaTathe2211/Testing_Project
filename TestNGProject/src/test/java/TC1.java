import org.testng.annotations.*;

public class TC1 {
    @BeforeClass //execute only one time before starting class
    void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeMethod //execute multiple times before every test method
    void First(){
        System.out.println("Before Test .");
    }
    @Test //used to specify testcases
    void test1(){
        System.out.println("This is first test method............");
    }
    @Test
    void test2(){
        System.out.println("This is second test method..............");
    }
    @AfterMethod //execute multiple times after every test method
    void after(){
        System.out.println("This is after method");
    }
    @AfterClass //execute only one time after starting class
    void AfterClass(){
        System.out.println("After Class");
    }
}
