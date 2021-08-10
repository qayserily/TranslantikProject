package com.translantik.pages;

import com.translantik.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleModelPage extends BasePage {

    public VehicleModelPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".nav-multilevel > li:nth-of-type(2) > .unclickable > .title")
    public WebElement vehicles;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[9]/a/span")
    public WebElement vehicleModels;

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-1684668397\"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[3]")
    public WebElement teslaCar;
}


