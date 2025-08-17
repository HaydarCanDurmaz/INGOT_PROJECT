package StepDefinions;

import Pages.DialogContent;
import io.cucumber.java.en.When;

public class _04_ResourceHubSteps {
    DialogContent dc = new DialogContent();


    @When("Enter the Resource Hub Click")
    public void enterTheResourceHubClick() {
        dc.myClick(dc.ResourceHub);
    }
}
