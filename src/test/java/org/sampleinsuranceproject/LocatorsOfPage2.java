package org.sampleinsuranceproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsOfPage2 extends InsuranceBase {
	
	public LocatorsOfPage2() {
	    PageFactory.initElements(driver, this);
		
		}
	
	
	@FindBy(xpath="//select[@class='selectBody']")
	private WebElement DropdownDest;

	public WebElement getDropdownDest() {
		return DropdownDest;
	}
	@FindBy(xpath="//input[@id='sumYourCover_From_Day']")
	private WebElement Startdate;

	public WebElement getStartdate() {
		return Startdate;
	}
	@FindBy(xpath="//input[@id='sumYourCover_From_Month']")
	private WebElement Startmonth;

	public WebElement getStartmonth() {
		return Startmonth;
	}
	@FindBy(xpath="//input[@id='sumYourCover_From_Year']")
	private WebElement Startyear;

	public WebElement getStartyear() {
		return Startyear;
	}
	
    @FindBy(xpath="//input[@id='sumYourCover_To_Day']")
    private WebElement Enddate;

	public WebElement getEnddate() {
		return Enddate;
	}
	@FindBy(xpath="//input[@id='sumYourCover_To_Month']")
	private WebElement Endmonth;

	public WebElement getEndmonth() {
		return Endmonth;
	}
	@FindBy(xpath="//input[@id='sumYourCover_To_Year']")
	private WebElement EndYear;

	public WebElement getEndYear() {
		return EndYear;
	}
	@FindBy(xpath="//input[@id='sumYourCover_txtTravellers18to85']")
	private WebElement Eldercount;

	public WebElement getEldercount() {
		return Eldercount;
	}
	@FindBy(xpath="//input[@id='sumYourCover_txtTravellers18to23FullTimeEdu']")
    private WebElement Fulltimeedu;

	public WebElement getFulltimeedu() {
		return Fulltimeedu;
	}
	@FindBy(xpath="//*[@id=\"sumYourCover_txtTravellers0to17\"]")
	private WebElement Years0;

	public WebElement getYears0() {
		return Years0;
	}
	@FindBy(xpath="//input[@id='sumYourCover_txtEldestTraveller']")
	private WebElement Age;

	public WebElement getAge() {
		return Age;
	}
	@FindBy(xpath="//input[@id='sumYourCover_btnNextStep']")
	private WebElement Howmuch;

	public WebElement getHowmuch() {
		return Howmuch;
	}  
}
