package StepDefinions;

import Pages.AltBarNav;
import Pages.DialogContent;
import io.cucumber.java.en.When;

public class _03_IngotLeftSteps {
    DialogContent dc = new DialogContent();


    @When("Enter the  INGOT LEFT Click")
    public void enterTheINGOTLEFTClick() {
        dc.myClick(dc.ingotLeft);
    }
}
