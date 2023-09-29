package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
    @Test
    void startCar(){
        System.out.println("Car started");
        //used to fail the case
        Assert.fail();

    }
//If first test fail then all the test cases fail because all are depend on each other
    @Test(dependsOnMethods = {"startCar"})
    void drive(){
        System.out.println("car driving");
    }

    @Test(dependsOnMethods = {"drive"})
    void stopCar(){
        System.out.println("Car stop");
    }
//If we use alwaysRun() then this method will run always even if the dependent method fail .
    @Test(dependsOnMethods = {"stopCar","drive"},alwaysRun = true)
    void ParkedCar(){
        System.out.println("car parked");
    }
}
