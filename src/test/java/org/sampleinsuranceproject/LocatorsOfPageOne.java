package org.sampleinsuranceproject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsOfPageOne extends InsuranceBase  {
	
	public LocatorsOfPageOne() {
    PageFactory.initElements(driver, this);
	
	}
	
	@FindBy (xpath="//span[text()='Travel Insurance']")
	private WebElement TravelInsurance;

	public WebElement getTravelInsurance() {
		return TravelInsurance;
	}
	@FindBy(xpath="//a[@class='trip-select-btn mb-3 mb-md-3 mr-md-3']")
	private WebElement SingleTrip;

	public WebElement getSingleTrip() {
		return SingleTrip;
	}

	


}
