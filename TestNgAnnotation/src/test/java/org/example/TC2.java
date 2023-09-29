package org.example;

import org.testng.annotations.*;
//suite->test->classes->class->method-->include
public class TC2 {
    @BeforeSuite //before actual test started//very high level
    void beforeSuit(){
        System.out.println("Before suite");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("After suite.");
    }
    @BeforeClass
        //execute only one times before class
    void BeforClass(){
        System.out.println("Before class");
    }
    @BeforeMethod
        //execute multiple times before every test case
    void beforeMethod(){
        System.out.println("Before method.");
    }
    @Test
        //declare as it is test case type method
    void testcase3(){
        System.out.println("Test3........");
    }
    @Test
    void testcase4(){
        System.out.println("Test4........");
    }
    @AfterMethod
        //executed multiple times after every test case
    void afterMethod(){
        System.out.println("After Method");
    }
    @AfterClass
        //executed only one time after class
    void afterClass(){
        System.out.println("After Class");
    }
}
