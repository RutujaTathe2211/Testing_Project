package org.example;

import org.testng.annotations.*;

public class TC2 {
    @BeforeClass
        //execute only one time before starting class
    void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeMethod
        //execute multiple times before every test method
    void First(){
        System.out.println("Before Test .");
    }
    @Test
    void test3(){
        System.out.println("this is test3.............");
    }
    @Test
    void test4(){
        System.out.println("this is test4.............");
    }
    @AfterMethod
        //execute multiple times after every test method
    void after(){
        System.out.println("This is after method");
    }
    @AfterClass
        //execute only one time after starting class
    void AfterClass(){
        System.out.println("After Class");
    }
}
