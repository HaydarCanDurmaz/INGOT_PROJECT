package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AltBarNav extends ParentPage{

    public AltBarNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//li[a='Currencies']/a)[1]")
    public WebElement Currencies;

    @FindBy(xpath = "(//li[a='Stocks']/a)[1]")
    public WebElement Stocks;

    @FindBy(xpath = "(//li[a='ETFs']/a)[1]")
    public WebElement ETFs;

    @FindBy(xpath = "(//li[a='Cryptocurrencies']/a)[1]")
    public WebElement Cryptocurrencies;

    @FindBy(xpath = "(//li[a='Agricultural Commodities']/a)[1]")
    public WebElement AgriculturalCommodities;

    @FindBy(xpath = "(//li[a='Indices']/a)[1]")
    public WebElement Indices;

    @FindBy(xpath = "(//li[a='Metals']/a)[1]")
    public WebElement Metals;

    @FindBy(xpath = "(//li[a='Energies']/a)[1]")
    public WebElement Energies;

    @FindBy(xpath = "(//li[a='MetaTrader 4']/a)[1]")
    public WebElement MetaTrader4;

    @FindBy(xpath = "(//li[a='MetaTrader 5']/a)[1]")
    public WebElement MetaTrader5;

    @FindBy(xpath = "(//li[a='INGOT Copy Trader']/a)[1]")
    public WebElement INGOTCopyTrader;

    @FindBy(css = "")
    public WebElement getStr;

    @FindBy(css = "")
    public WebElement str13;

    @FindBy(css = "")
    public WebElement str221;

    @FindBy(css = "")
    public WebElement str121;

    @FindBy(css = "")
    public WebElement str12;
}
