package org.sampleinsuranceproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsOfPage4 extends InsuranceBase {
	public LocatorsOfPage4 () {
	    PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(xpath="//*[@id=\"Title\"]")
	private WebElement Title;
	public WebElement getTitle() {
		return Title;
    }
	@FindBy(xpath="//*[@id=\"Firstname\"]")
	private WebElement fname;

	public WebElement getFname() {
		return fname;
	}
	@FindBy(xpath="//*[@id=\"Surname\"]")
	private WebElement Surname;
	public WebElement getSurname() {
		return Surname;
	}
	@FindBy(xpath="//*[@id=\"DOB_Day\"]")
	private WebElement Bday;
	public WebElement getBday() {
		return Bday;
	}
	@FindBy(xpath="//*[@id=\"DOB_Month\"]")
	private WebElement Month;
	public WebElement getMonth() {
		return Month;
	}
	@FindBy(xpath="//*[@id=\"DOB_Year\"]")
	private WebElement Year;
	public WebElement getYear() {
		return Year;
	}
	@FindBy(xpath="//*[@id=\"Gender\"]")
	private WebElement Gender;
	public WebElement getGender() {
		return Gender;
	}
	@FindBy(xpath="//*[@id=\"TypedOccupation\"]")
	private WebElement Occupation;
	public WebElement getOccupation() {
		return Occupation;
	}
	@FindBy(xpath="//*[@id=\"TelephoneNo\"]")
	private WebElement Telephone;
	public WebElement getTelephone() {
		return Telephone;
	}
	@FindBy(xpath="//*[@id=\"Address\"]")
	private WebElement Phone2;
	public WebElement getPhone2() {
		return Phone2;
	}	
	@FindBy(xpath="//*[@id=\"Postcode\"]")
	private WebElement Postcode;
	public WebElement getPostcode() {
		return Postcode;
	}	
	@FindBy(xpath="//*[@id=\"AddressCheck\"]")
	private WebElement Address1;
	public WebElement getAddress1() {
		return Address1;
	}	
	@FindBy(xpath="//*[@id=\"Email\"]")
	private WebElement Email;
	public WebElement getEmail() {
		return Email;
	}	
	@FindBy(xpath="//*[@id=\"Traveller1Title\"]")
	private WebElement Dropdown;
	public WebElement getDropdown() {
		return Dropdown;
	}	
	@FindBy(xpath="//*[@id=\"Traveller1Forename\"]")
	private WebElement Fname1;
	public WebElement getFname1() {
		return Fname1;
	}	
	@FindBy(xpath="//*[@id=\"Traveller1Surname\"]")
	private WebElement Lastname;
	public WebElement getLastname() {
		return Lastname;
	}	
	@FindBy(xpath="//*[@id=\"Traveller1DOB_Day\"]")
	private WebElement Bday2;
	public WebElement getBday2() {
		return Bday2;
	}	
	@FindBy(xpath="//*[@id=\"Traveller1DOB_Month\"]")
	private WebElement Bmonth2;
	public WebElement getBmonth2() {
		return Bmonth2;
	}	
	@FindBy(xpath="//*[@id=\"Traveller1DOB_Year\"]")
	private WebElement Byear2;
	public WebElement getByear2() {
		return Byear2;
	}	
	@FindBy(xpath="//*[@id=\"PayOnline\"]")
	private WebElement Payonline1;
	public WebElement getPayonline1() {
		return Payonline1;
	}	
	

}
