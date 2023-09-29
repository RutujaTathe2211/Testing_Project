package org.example;

import org.testng.annotations.*;

public class TC1 {

    @BeforeTest //executed before all methods/class only one times//either we declare this method in tc1 and tc2
    void BeforeTest(){
        System.out.println("Before test");
    }
    @BeforeClass //execute only one times before class
    void BeforClass(){
        System.out.println("Before class");
    }
    @BeforeMethod //execute multiple times before every test case
    void beforeMethod(){
        System.out.println("Before method.");
    }
    @Test //declare as it is test case type method
    void testcase1(){
        System.out.println("Test1........");
    }
    @Test
    void testcase2(){
        System.out.println("Test2........");
    }
    @AfterMethod //executed multiple times after every test case
    void afterMethod(){
        System.out.println("After Method");
    }
    @AfterClass //executed only one time after class
    void afterClass(){
        System.out.println("After Class");
    }
    @AfterTest //executed after all methods/class only one times
    void AfterTest(){
        System.out.println("After Test.");
    }
}
