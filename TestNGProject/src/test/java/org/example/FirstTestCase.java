package org.example;

import org.testng.annotations.Test;

/*
steps:
1.setup--open browser and application
2.login
3.close
-every test case will start with @Test annotation
-reload project to run all testcases at one time
 */
public class FirstTestCase {
   @Test(priority = 1)
    void setup(){
       System.out.println("Opening Test");
   }
   @Test(priority = 2)
    void login(){
       System.out.println("This is login test.");
   }
   @Test(priority = 3)
    void tearDown(){
       System.out.println("Closing Browser.");
   }

}
