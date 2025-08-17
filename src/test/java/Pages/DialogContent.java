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
    public WebElement LoginClick;

    @FindBy(linkText = "INGOT Brokers")
    public WebElement txtINGOTBrokers;

    @FindBy(id = "password")
    public WebElement sendPassword;

    @FindBy(css = "button[type='submit']")
    public WebElement LoginButton;


    @FindBy(xpath = "(//a[@id='52383'])[1]")
    public WebElement StartTrandingNowclick;

    @FindBy(xpath = "(//select[@class='form-select'])[2]")
    public WebElement countryOfResidence1;

    @FindBy(css = "input[placeholder='Phone Number']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//a[@id='52215'][1]")
    public WebElement startFreeDemo;

    @FindBy(xpath = "(//li[@class='pointer']/div)[1]")
    public WebElement TradeEssentialsClick;

    @FindBy(xpath = "(//li[@class='pointer']/div)[3]")
    public WebElement ResourceHub;

    @FindBy(css = "(//li[@class='pointer']/div)[5]")
    public WebElement ingotLeft;

    @FindBy(css = "")
    public WebElement w11;

    @FindBy(css = "")
    public WebElement w10;

    @FindBy(css = "")
    public WebElement w9;

    @FindBy(css = "")
    public WebElement w111;

    @FindBy(css = "")
    public WebElement w122;

    @FindBy(css = "")
    public WebElement w1111;

    @FindBy(css = "")
    public WebElement w1222;

    @FindBy(css = "")
    public WebElement w14;

    @FindBy(css = "")
    public WebElement w15;

    @FindBy(css = "")
    public WebElement w16;

    @FindBy(css = "")
    public WebElement w17;

    @FindBy(css = "")
    public WebElement w18;

    @FindBy(css = "")
    public WebElement w19;

    @FindBy(css = "")
    public WebElement w199;




}
