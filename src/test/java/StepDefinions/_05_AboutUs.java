package StepDefinions;

import Pages.AltBarNav;
import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class _05_AboutUs {
    AltBarNav an = new AltBarNav();
    DialogContent dc = new DialogContent();


    @When("Click to INGOT Functionality")
    public void clickToINGOTFunctionality() {
        dc.myClick(dc.ingotLeft);

    }

    @Then("Click to About Us Functionality")
    public void clickToAboutUsFunctionality() {
        an.myClick(an.AboutUs);
    }

    @When("User should be true page successfully")
    public void userShouldBeTruePageSuccessfully() {
    }
}
