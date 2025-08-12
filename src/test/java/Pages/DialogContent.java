package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@id='52383'])[1]")
    public WebElement clickStartTrandingNow;

    @FindBy(css = "input[placeholder='Email Address']")
    public WebElement sendEmail;

    @FindBy(css = "input[placeholder='Country code']")
    public WebElement countrCode;

    @FindBy(xpath = "//a[@id='52382'][1]")
    public WebElement LoginButton;

    @FindBy(linkText = "INGOT Brokers")
    public WebElement txtINGOTBrokers;

    @FindBy(id = "password")
    public WebElement sendPassword;

    @FindBy(css = "")
    public WebElement phoneNumber3;




}
