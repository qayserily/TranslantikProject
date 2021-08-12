package com.translantik.pages;

import com.translantik.utilities.Driver;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class GeneralInformationPage extends BasePage{

    public String getProperty(String info){

        return Driver.get().findElement(By.xpath("//label[contains(text(),'"+info+"')]")).getText();

    }

    public List<String> getALlInfo(){
        List<String> AllInfo = new ArrayList<>();

        AllInfo.add(getProperty("Model"));
        AllInfo.add(getProperty("Make"));
        AllInfo.add(getProperty("Can"));
        AllInfo.add(getProperty("Catalog"));
        AllInfo.add(getProperty("CO2 Fee"));
        AllInfo.add(getProperty("Cost"));
        AllInfo.add(getProperty("Total Cost"));
        AllInfo.add(getProperty("CO2 Emissions"));
        AllInfo.add(getProperty("Fuel Type"));
        AllInfo.add(getProperty("Vendors"));

        return AllInfo;
    }
}
