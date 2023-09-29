package org.example;

import org.testng.annotations.Test;

import javax.swing.*;

public class GroupingTest {
    //make groups...for that we need to create xml file and content on that file
    @Test(groups = {"sanity"})
    void test1(){
        System.out.println("This is test1.");
    }
    @Test(groups = {"Regression"})
    void test2(){
        System.out.println("This is test2");
    }
    @Test(groups = {"Regression"})
    void test3(){
        System.out.println("this is test3");
    }
    @Test(groups={"sanity"})
    void test4(){
        System.out.println("this is test4");
    }@Test(groups={"Regression","sanity"})
    void test5(){
        System.out.println("this is test5");
    }
}
