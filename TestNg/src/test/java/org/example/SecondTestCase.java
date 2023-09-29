package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 1)
    void SearchCustomer(){
        System.out.println("This is login test.");
    }
    @Test(priority = 2)
    void SearchCustomerTest(){
        System.out.println("Closing Browser.");
        Assert.assertEquals(1,1);
    }
    @Test(priority = 3)
    void End(){
        System.out.println("end Customer test");
    }

}
