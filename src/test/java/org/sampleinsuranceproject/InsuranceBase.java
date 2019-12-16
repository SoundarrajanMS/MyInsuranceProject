package org.sampleinsuranceproject;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InsuranceBase {
	static WebDriver driver;
	public static void launchChrome(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Myinsuranceproject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	public static void sendKeys(WebElement location,String fillTheBox) {
	location.sendKeys(fillTheBox);

	}
	public static void click(WebElement location) {
		location.click();

	}
	public static void dropDownByValue(WebElement location,String s) {
		Select dp = new Select(location);
		dp.selectByValue(s);
		
	}
	public static void dropDownByText(WebElement location,String byText) {
		 Select dp3 = new Select(location);
		    dp3.selectByVisibleText(byText);
		    
	}
	public static void downKey() throws AWTException {
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	   
	}
	public static void enterKey() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}
	private void getExcelData(int rowNo,int cellNo) throws Throwable {
		File file = new File("C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Myinsuranceproject\\excel datas\\Endsleigh datas.xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(input);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
	    int cellType = cell.getCellType();
	    
	   /* if(cellType==1) {
	    	String stringCellValue = cell.getStringCellValue();
	    	else {
	    		if(cellType==0) {
	    			if(DateUtil.isCellDateFormatted(cell));
	    			SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
	    			sim.format(arg0)
	    			}
	    		else{
	    			double numericCellValue = cell.getNumericCellValue();}
	    		long l = (long)numeric;
    			String.valueOf(l);
    			
	    	}*/
//	    }

	}
	

}
