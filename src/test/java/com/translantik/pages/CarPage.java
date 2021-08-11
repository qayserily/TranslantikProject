package com.translantik.pages;

import com.translantik.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarPage {
    public CarPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".back")
    public WebElement editButton;

    @FindBy(css = ".remove-button")
    public WebElement deleteButton;

    @FindBy(css = "[title='Add attachment']")
    public WebElement attachmentButton;

    @FindBy(css = "[title='Add note']")
    public WebElement addNoteButton;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[2]/div/div/div[1]")
    public WebElement buttons;

    @FindBy(css = "[href='#scroll-2-4293']")
    public WebElement activity;

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-1599136380\"]/div[2]")
    public WebElement modelActivitiy;


}
