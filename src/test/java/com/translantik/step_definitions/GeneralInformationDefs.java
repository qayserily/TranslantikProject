package com.translantik.step_definitions;

import com.translantik.pages.CarPage;
import com.translantik.pages.GeneralInformationPage;
import com.translantik.pages.LoginPage;
import com.translantik.pages.VehicleModelPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.ConfigurationReader;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;


public class GeneralInformationDefs {
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        String loginUrl = ConfigurationReader.get("url") ;
        Driver.get().get(loginUrl);

    }
    @And("{string} should be able to login with its {string}")
    public void shouldBeAbleToLoginWithIts(String username, String password) {
        username = ConfigurationReader.get("driver_username") ;
        password = ConfigurationReader.get("driver_password") ;

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Given("User can navigate to the {string} page by clicking on the {string} sign under {string}...{string}")
    public void user_can_navigate_to_the_page_by_clicking_on_the_sign_under() {

        VehicleModelPage vehicleModelPage = new VehicleModelPage();
        vehicleModelPage.vehicleModels.click();

         }

    @Given("User should see {string}, {string} and {string} buttons on the General Information")
    public void user_should_see_and_buttons_on_the(String edit, String delete, String addAttachment, String modelActivity) {
       VehicleModelPage vehicleModelPage = new VehicleModelPage();
       vehicleModelPage.teslaCar.click();

        // burda kodlar eksik yazılacak
        CarPage carPage = new CarPage();

        BrowserUtils.verifyElementDisplayed(carPage.editButton);
        BrowserUtils.verifyElementDisplayed(carPage.deleteButton);
        BrowserUtils.verifyElementDisplayed(carPage.attachmentButton);
        BrowserUtils.verifyElementDisplayed(carPage.addNoteButton);

        /*    System.out.println("carPage.editButton.isDisplayed() = " + carPage.editButton.isDisplayed());
            System.out.println("carPage.deleteButton.isDisplayed() = " + carPage.deleteButton.isDisplayed());
            System.out.println("carPage.attachmentButton.isDisplayed() = " + carPage.attachmentButton.isDisplayed());
            System.out.println("carPage.addNoteButton.isDisplayed() = " + carPage.addNoteButton.isDisplayed()); */
        }

    @When("User can see created activities by click on the Activity module on the ''General Information'' page")
    public void user_can_see_created_activities_by_click_on_the_Activity_module_on_the_General_Information_page() {
        CarPage carPage = new CarPage();
        carPage.activity.click();

        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Entities / Vehicles Model / Model S Tesla 23",actualTitle);
    }

    @Then("All of the information between the {string} page and table should be matched")
    public void all_of_the_information_between_the_page_and_table_should_be_matched() {
        String actualTitle = Driver.get().getTitle() ;
        Assert.assertEquals("All Vehicles Model",actualTitle);

        BrowserUtils.waitFor(2);

        List<String> actualList = BrowserUtils.getElementsText(new CarPage().teslaCar);
        System.out.println(actualList);
        System.out.println("------------------------------------------------");
        List<String> expectedList = new GeneralInformationPage().getALlInfo();
        System.out.println(expectedList);

        System.out.println("actualTabList = " + actualList);
        Assert.assertEquals(expectedList, actualList);
    }


}
