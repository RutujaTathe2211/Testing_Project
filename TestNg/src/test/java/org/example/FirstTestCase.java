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
   @Test
    void setup(){
       System.out.println("Opening Test");
   }
   @Test
    void login(){
       System.out.println("This is login test.");
   }
   @Test
    void tearDown(){
       System.out.println("Closing Browser.");
   }

}
