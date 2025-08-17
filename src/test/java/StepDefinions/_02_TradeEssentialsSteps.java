package StepDefinions;

import Pages.DialogContent;
import io.cucumber.java.en.When;

public class _02_TradeEssentialsSteps {
    DialogContent dc = new DialogContent();


    @When("Enter the Trade Essentials Click")
    public void enterTheTradeEssentialsClick() {
        dc.myClick(dc.TradeEssentialsClick);
    }
}
