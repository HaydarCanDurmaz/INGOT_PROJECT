package StepDefinions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to INGOT BROKERS Pages")
    public void navigateToINGOTBROKERSPages() {
        GWD.getDriver().get("https://www.ingot.io/SC/en-SC");
    }

    @When("Enter the Login Button")
    public void enterTheLoginButton() {
        dc.myClick(dc.LoginButton);


    }

    @Then("Enter the Username and Password")
    public void enterTheUsernameAndPassword() {
        dc.mySendKeys(dc.sendEmail,"ıngotdemo@gmail.com");
        dc.mySendKeys(dc.sendPassword,"Ingot123+");
       // dc.wait.until(ExpectedConditions.textToBePresentInElement(dc.txtINGOTBrokers,"INGOT Brokers"));
        //Assert.assertTrue(dc.txtINGOTBrokers.getText().equals("INGOT Brokers"));
    }
}
