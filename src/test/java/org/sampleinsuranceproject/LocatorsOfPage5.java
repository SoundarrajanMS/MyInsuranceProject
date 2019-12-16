package org.sampleinsuranceproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsOfPage5 extends InsuranceBase {
	public LocatorsOfPage5() {
	    PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath="//*[@id=\"eccPopUpImportantHealthConditions_PopUpInfoAgree_Pay\"]")
	private WebElement Agree1;
	public WebElement getAgree1() {
		return Agree1;
	}	
	@FindBy(xpath="//*[@id=\"btnPayOnline\"]")
	private WebElement Payonline2;
	public WebElement getPayonline2() {
		return Payonline2;
	}	
	@FindBy(xpath="//*[@id=\"ddlPaymentCardType\"]")
	private WebElement Cardtype;
	public WebElement getCardtype() {
		return Cardtype;
	}	
	@FindBy(xpath="//*[@id=\"Payment\"]/div/div/div/div[5]/div/div[2]/div[7]/button")
	private WebElement Conform;
	public WebElement getConform() {
		return Conform;
	}	
	@FindBy(xpath="//*[@id=\"card_number\"]")
	private WebElement Cardno;
	public WebElement getCardno() {
		return Cardno;
	}	
	@FindBy(xpath="//*[@id=\"card_expiry_month\"]")
	private WebElement Expmonth;
	public WebElement getExpmonth() {
		return Expmonth;
	}
	
	@FindBy(xpath="//*[@id=\"card_expiry_year\"]")
	private WebElement Year1;
	public WebElement getYear1() {
		return Year1;
	}
	@FindBy(xpath="//*[@id=\"card_cvn_masked\"]")
	private WebElement Cvv;
	public WebElement getCvv() {
		return Cvv;
	}
	@FindBy(xpath="//*[@id=\"payment_details\"]/input")
	private WebElement Paynow3;
	public WebElement getPaynow3() {
		return Paynow3;
	}


}
