package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    //repeat multiple times depends on data that are present in data provider method,no of parameter
    //no looping are required
    //If the data provider are in different class then @test(dataprovider="dataprovider name",dataproviderclass=classname.class)
    @Test(dataProvider = "LoginDataProvider",dataProviderClass=CustomDataProvider.class)
    public void LoginTest(String email,String pass){
        System.out.println(email+" "+pass);
    }
}
