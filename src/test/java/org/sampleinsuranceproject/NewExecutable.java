package org.sampleinsuranceproject;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

public class NewExecutable extends InsuranceBase {
	public static void main(String[] args) throws Throwable {
		launchChrome("https://www.endsleigh.co.uk/personal/travel-insurance/");
		LocatorsOfPageOne l1=new LocatorsOfPageOne();
	    click(l1.getTravelInsurance());
	    click(l1.getSingleTrip());
	    
	    
	    LocatorsOfPage2 l2 = new LocatorsOfPage2();
	    
	    dropDownByValue(l2.getDropdownDest(), "2");
	    sendKeys(l2.getStartdate(),"31");
        sendKeys(l2.getStartmonth(),"01");  
	    sendKeys(l2.getStartyear(),"2020");
	    sendKeys(l2.getEnddate(),"14");
	    sendKeys(l2.getEndmonth(), "02");
	    sendKeys(l2.getEndYear(), "2020");
	    sendKeys(l2.getEldercount(),"1");
	    sendKeys(l2.getFulltimeedu(), "1");
	    sendKeys(l2.getYears0(),"0");
	    sendKeys(l2.getAge(), "60");
	    click(l2.getHowmuch());
	    
	    LocatorsOfPage3 l3 = new LocatorsOfPage3();
	    
	    click(l3.getAgree());
	    click(l3.getSingletrip());
	    click(l3.getPayonline());
	    
	    LocatorsOfPage4 l4 = new LocatorsOfPage4();
	    
	    Thread.sleep(5000);

	    dropDownByValue(l4.getTitle(),"Mr");
	    sendKeys(l4.getFname(),"soundar");
	    sendKeys(l4.getSurname(),"rajan");
	    sendKeys(l4.getBday(),"31");
	    sendKeys(l4.getMonth(), "01");
	    sendKeys(l4.getYear(), "1999");
	    dropDownByText(l4.getGender(),"Male");
	    sendKeys(l4.getOccupation(), "Social Worker");
	    sendKeys(l4.getTelephone(), "9965105007");
	    sendKeys(l4.getPhone2(), "9965105007");
	    sendKeys(l4.getPostcode(), "GL51 6UE");
	    click(l4.getAddress1());
	    sendKeys(l4.getEmail(), "xtatonsoundar09@gmail.com");
	    dropDownByValue(l4.getDropdown(),"Mr");
	    sendKeys(l4.getFname1(),"chandru");
	    sendKeys(l4.getLastname(), "chinna");
	    sendKeys(l4.getBday2(), "17");
	    sendKeys(l4.getBmonth2(), "11");
	    sendKeys(l4.getByear2(), "1959");
	    click(l4.getPayonline1());
	    
	    LocatorsOfPage5 l5 = new LocatorsOfPage5();
	    
	    click(l5.getAgree1());
	    click(l5.getPayonline2());
	    click(l5.getCardtype());
	    downKey();
	    downKey();
	    enterKey();
	    click(l5.getConform());
	     Thread.sleep(15000);
        driver.switchTo().frame("sopresults");
	    sendKeys(l5.getCardno(),"1345435484785874");
	    dropDownByValue(l5.getExpmonth(), "02");
	    dropDownByText(l5.getYear1(), "2021");
	    sendKeys(l5.getCvv(), "555");
	    click(l5.getPaynow3());
	    

	    
	    
	    
	    
	    


	    


	
	
	}
}