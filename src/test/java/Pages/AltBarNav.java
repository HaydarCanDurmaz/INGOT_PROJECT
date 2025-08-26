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

    @FindBy(xpath = "(//li[a='INGOT Mobile App']/a)[1]")
    public WebElement INGOTMobileApp;

    @FindBy(xpath = "(//li[a='Economic Calendar']/a)[1]")
    public WebElement EconomicCalendar;

    @FindBy(xpath = "(//li[a='Trading Central']/a)[1]")
    public WebElement TradingCentral;

    @FindBy(xpath = "(//li[a='Calculators']/a)[1]")
    public WebElement Calculators;

    @FindBy(xpath = "(//li[a='Video Tutorials']/a)[1]")
    public WebElement VideoTutorials;

    @FindBy(xpath = "(//li[a='INGOT Glossary']/a)[1]")
    public WebElement INGOTGlossary;

    @FindBy(xpath = "(//div[a='Market News and Announcements']/a)[1]")
    public WebElement MarketNewsandAnnouncements;

    @FindBy(xpath = "(//div[a='Download Center']/a)[1]")
    public WebElement DownloadCenter;

    @FindBy(xpath = "(//div[a='The Forge']/a)[1]")
    public WebElement TheForge;


    @FindBy(xpath = "(//li[a='Secure Start by INGOT']/a)[1]")
    public WebElement SecureStartbyINGOT;

    @FindBy(xpath = "(//li[a='Zero Zero Zero']/a)[1]")
    public WebElement ZeroZeroZero;

    @FindBy(xpath = "(//div[a='Account Types']/a)[1]")
    public WebElement AccountTypes;

    @FindBy(xpath = "(//div[a='About Us']/a)[1]")
    public WebElement AboutUs;


    @FindBy(xpath = "(//div[a='Sponsorships']/a)[1]")
    public WebElement Sponsorships;

    @FindBy(xpath = "(//div[a='Licenses & Regulation']/a)[1]")
    public WebElement LicensesAndRegulation;

    @FindBy(xpath = "(//div[a='Safety of Your Funds']/a)[1]")
    public WebElement SafetyofYourFunds;

    @FindBy(xpath = "(//li[a='Partnership Programs']/a)[1]")
    public WebElement PartnershipPrograms;


    @FindBy(xpath = "(//div[a='Careers']/a)[1]")
    public WebElement Careers;

    @FindBy(xpath = "(//li[a='Contact Us']/a)[1]")
    public WebElement ContactUs;

    @FindBy(xpath = "(//li[a='Help Center']/a)[1]")
    public WebElement HelpCenter;

    @FindBy(xpath = "(//li[a='FAQ']/a)[1]")
    public WebElement FAQ;

    @FindBy(xpath = "(//div[a='INGOT News Room']/a)[1]")
    public WebElement INGOTNewsRoom;

    @FindBy(xpath = "")
    public WebElement getStras1211221;

    @FindBy(xpath = "")
    public WebElement str12a112;
}
