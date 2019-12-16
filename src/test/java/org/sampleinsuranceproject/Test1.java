package org.sampleinsuranceproject;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Ecommerce\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.endsleigh.co.uk/personal/travel-insurance/");
		
		
		WebElement L1tavelinsurance = driver.findElement(By.xpath("//span[text()='Travel Insurance']"));
		L1tavelinsurance.click();
		
		WebElement L2singletrip = driver.findElement(By.xpath("//a[@class='trip-select-btn mb-3 mb-md-3 mr-md-3']"));
		L2singletrip.click();
		Thread.sleep(10000);
		
		WebElement dropdownDest = driver.findElement(By.xpath("//select[@class='selectBody']"));
		
		Select dp = new Select(dropdownDest);
		dp.selectByValue("2");
		
		WebElement LStartdate = driver.findElement(By.xpath("//input[@id='sumYourCover_From_Day']"));
		LStartdate.sendKeys("31");
	    
		WebElement LStartmonth = driver.findElement(By.xpath("//input[@id='sumYourCover_From_Month']"));
		LStartmonth.sendKeys("01");
		
		WebElement LStartyear = driver.findElement(By.xpath("//input[@id='sumYourCover_From_Year']"));
		LStartyear.sendKeys("2020");
	
		WebElement LEnddate = driver.findElement(By.xpath("//input[@id='sumYourCover_To_Day']"));
		LEnddate.sendKeys("14");
       
		WebElement LEndmonth = driver.findElement(By.xpath("//input[@id='sumYourCover_To_Month']"));
		LEndmonth.sendKeys("02");
		
		WebElement LEndYear = driver.findElement(By.xpath("//input[@id='sumYourCover_To_Year']"));
		LEndYear.sendKeys("2020");
		
		WebElement Leldercount = driver.findElement(By.xpath("//input[@id='sumYourCover_txtTravellers18to85']"));
		Leldercount.sendKeys("1");
		
		WebElement LFulltimeedu = driver.findElement(By.xpath("//input[@id='sumYourCover_txtTravellers18to23FullTimeEdu']"));
		LFulltimeedu.sendKeys("1");
		
		WebElement L0years = driver.findElement(By.xpath("//*[@id=\"sumYourCover_txtTravellers0to17\"]"));
		L0years.sendKeys("0");
		
		WebElement Lage = driver.findElement(By.xpath("//input[@id='sumYourCover_txtEldestTraveller']"));
		Lage.sendKeys("60");
		
		WebElement LHowmuch = driver.findElement(By.xpath("//input[@id='sumYourCover_btnNextStep']"));
		LHowmuch.click();
		
		WebElement Lagree = driver.findElement(By.xpath("//*[@id=\"UKEligibilityStatements_agreeButton\"]"));
		Lagree.click();
		
		WebElement LSingletrip = driver.findElement(By.xpath("//*[@id=\"sumEssential_BuyEssential\"]"));
		LSingletrip.click();
		
		WebElement LPayonline = driver.findElement(By.xpath("//*[@id=\"sumOverview_btnPayOnlineTop\"]"));
		LPayonline.click();
		 Thread.sleep(5000);
		WebElement Ltitle = driver.findElement(By.xpath("//*[@id=\"Title\"]"));
		Select dp2 = new Select(Ltitle);
		dp2.selectByValue("Mr");
		
		WebElement Lfname = driver.findElement(By.xpath("//*[@id=\"Firstname\"]"));
		Lfname.sendKeys("soundar");	
		
		WebElement Lsurname = driver.findElement(By.xpath("//*[@id=\"Surname\"]"));
		Lsurname.sendKeys("rajan");
		
		WebElement Lbday = driver.findElement(By.xpath("//*[@id=\"DOB_Day\"]"));
		Lbday.sendKeys("31");
		
		WebElement Lbmonth = driver.findElement(By.xpath("//*[@id=\"DOB_Month\"]"));
		Lbmonth.sendKeys("01");
		
		WebElement Lbyear = driver.findElement(By.xpath("//*[@id=\"DOB_Year\"]"));
	    Lbyear.sendKeys("1999");
	    
	    WebElement Lgender = driver.findElement(By.xpath("//*[@id=\"Gender\"]"));
	    Select dp3 = new Select(Lgender);
	    dp3.selectByVisibleText("Male");
	    
	    WebElement Loccupation = driver.findElement(By.xpath("//*[@id=\"TypedOccupation\"]"));
	    Loccupation.sendKeys("Social Worker");
	    
	    WebElement LTelephone = driver.findElement(By.xpath("//*[@id=\"TelephoneNo\"]"));
	    LTelephone.sendKeys("9965105007");
	    
	    WebElement Lphone2 = driver.findElement(By.xpath("//*[@id=\"Address\"]"));
	    Lphone2.sendKeys("9965105007");
	    
	    WebElement Lpostcode = driver.findElement(By.xpath("//*[@id=\"Postcode\"]"));
	    Lpostcode.sendKeys("GL51 6UE");
	    
	    WebElement Laddress = driver.findElement(By.xpath("//*[@id=\"AddressCheck\"]"));
	    Laddress.click();
	    
	    WebElement Lemail = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
	    Lemail.sendKeys("xtatonsoundar09@gmail.com");
	    
	    WebElement Ltitle2 = driver.findElement(By.xpath("//*[@id=\"Traveller1Title\"]"));
	    Select dp4 = new Select(Ltitle2);
	    dp4.selectByValue("Mr");
	    
	    WebElement Lfname1 = driver.findElement(By.xpath("//*[@id=\"Traveller1Forename\"]"));
	    Lfname1.sendKeys("chandru");
	    
	    WebElement Llstname2 = driver.findElement(By.xpath("//*[@id=\"Traveller1Surname\"]"));
	    Llstname2.sendKeys("chinna");
	    
	    WebElement Lbday2 = driver.findElement(By.xpath("//*[@id=\"Traveller1DOB_Day\"]"));
	    Lbday2.sendKeys("17");
	  
	    WebElement Lbmonth2 = driver.findElement(By.xpath("//*[@id=\"Traveller1DOB_Month\"]"));
	    Lbmonth2.sendKeys("11");
	    
	    WebElement Lbyear2 = driver.findElement(By.xpath("//*[@id=\"Traveller1DOB_Year\"]"));
	    Lbyear2.sendKeys("1959");
	    
	   /* WebElement Ltitle3 = driver.findElement(By.xpath("//*[@id=\"Traveller2Title\"]"));
	    Select dp5 = new Select(Ltitle3);
	    dp5.selectByValue("Mr");
	    
	    WebElement Lfname3 = driver.findElement(By.xpath("//*[@id=\"Traveller2Forename\"]"));
	    Lfname3.sendKeys("moorthy");
	    
	    WebElement Llstname3 = driver.findElement(By.xpath("//*[@id=\"Traveller2Surname\"]"));
	    Llstname3.sendKeys("sundaram");
	    
	    WebElement Lbday3 = driver.findElement(By.xpath("//*[@id=\"Traveller2DOB_Day\"]"));
	    Lbday3.sendKeys("04");
	    
	    WebElement Lbmonth3 = driver.findElement(By.xpath("//*[@id=\"Traveller2DOB_Month\"]"));
	    Lbmonth3.sendKeys("12");
	    
	    WebElement Lbyear3 = driver.findElement(By.xpath("//*[@id=\"Traveller2DOB_Year\"]"));
	    Lbyear3.sendKeys("1959");*/
	    
	    WebElement Lpayonline = driver.findElement(By.xpath("//*[@id=\"PayOnline\"]"));
	    Lpayonline.click();
	    
	    WebElement Lagree1 = driver.findElement(By.xpath("//*[@id=\"eccPopUpImportantHealthConditions_PopUpInfoAgree_Pay\"]"));
	    Lagree1.click();
	    
	    WebElement Lpayonline1 = driver.findElement(By.xpath("//*[@id=\"btnPayOnline\"]"));
	    Lpayonline1.click();
	    
	    Thread.sleep(5000);
	    
	    WebElement Lcardtype = driver.findElement(By.xpath("//*[@id=\"ddlPaymentCardType\"]"));
	    Lcardtype.click();
//	    Actions acc=new Actions(driver);
//	    acc.click(Lcardtype);
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement Lconform = driver.findElement(By.xpath("//*[@id=\"Payment\"]/div/div/div/div[5]/div/div[2]/div[7]/button"));
	    Lconform.click();
	    Thread.sleep(6000);
	    
	    WebElement Lcardno = driver.findElement(By.xpath("//*[@id=\"card_number\"]"));
	    Lcardno.sendKeys("1345435484785874");
	    
	    WebElement Lexpmonth = driver.findElement(By.xpath("//*[@id=\"card_expiry_month\"]"));
	    Select dp7= new Select(Lexpmonth);
	    dp7.selectByValue("02");
	    
	    WebElement Lyear = driver.findElement(By.xpath("//*[@id=\"card_expiry_year\"]"));
	    Select dp8= new Select(Lyear);
	    dp8.selectByValue("2021");
	    
	    WebElement Lcvv = driver.findElement(By.xpath("//*[@id=\"card_cvn_masked\"]"));
	    Lcvv.sendKeys("555");
	    
	    WebElement Lpaynow3 = driver.findElement(By.xpath("//*[@id=\"payment_details\"]/input"));
	    Lpaynow3.click();
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	}

}
