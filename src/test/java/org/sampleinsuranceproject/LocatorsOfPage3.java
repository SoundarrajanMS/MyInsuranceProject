package org.sampleinsuranceproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsOfPage3 extends InsuranceBase {
	
	public LocatorsOfPage3() {
	    PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(xpath="//*[@id=\'UKEligibilityStatements_agreeButton\']")
	private WebElement Agree;

	public WebElement getAgree() {
		return Agree;
	}
	@FindBy(xpath="//*[@id=\"sumEssential_BuyEssential\"]")
	private WebElement Singletrip;

	public WebElement getSingletrip() {
		return Singletrip;
	}
	@FindBy(xpath="//*[@id=\"sumOverview_btnPayOnlineTop\"]")
	private WebElement Payonline;

	public WebElement getPayonline() {
		return Payonline;
	}


}
