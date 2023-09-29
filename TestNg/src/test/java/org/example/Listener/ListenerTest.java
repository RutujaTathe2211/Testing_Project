package org.example.Listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(CustomListener.class) //to link both classes listener and customlistener together
//whenever a test sucess,fail,skip the method in custom class will trigger automatically
public class ListenerTest {
    @Test
    void test1(){
        System.out.println("Test1 ");
        Assert.assertEquals("A","A");
    }
    @Test
    void test2(){
        System.out.println("Test2 ");
        Assert.assertEquals("A","B");
    }
    @Test
    void test3(){
        System.out.println("Test3 ");
        throw new SkipException("THis is skipped exception.....");

    }

}
