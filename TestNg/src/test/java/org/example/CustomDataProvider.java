package org.example;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    //DataProvider():return two-dimensional array
    //provide data to another method
    //repeat multiple times depends on data that are present in data provider method

    @DataProvider(name="LoginDataProvider")
    public Object[][] getData(){
        Object[][] data={{"abc@gmail.com" ,"abc"},{"rutu@gmail.com","rutu"},{"xyz@gmail.com","xyz"}};
        return data;
    }
}
