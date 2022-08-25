package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.google.common.io.Files;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {
	public WebDriver driver ;

	public WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "C://Users//1000075142//Documents//chromedriver.exe");
		driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void scrollDown(int val) throws IOException, InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+"("+"0"+","+val+")");
		Thread.sleep(3000);
    }
	
	public void takeScreen( String filePath)throws IOException, InterruptedException {
    	TakesScreenshot takeIt = (TakesScreenshot)driver;
    	File srcFile = takeIt.getScreenshotAs(OutputType.FILE);
    	File destFile = new File(filePath);
    	Files.copy(srcFile, destFile);
	}
	
	public String getCells(int cellParam, int rowParam ) throws EncryptedDocumentException, IOException {
		File f = new File ("C:\\Users\\1000075142\\Documents\\Data.xlsx");
		
		InputStream input = new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(input);
		Sheet sheet = wb.getSheetAt(0);
		
		int iRow=0;
		Row row = sheet.getRow(iRow);
		
		while (row!= null) {
			
			Cell cell = row.getCell(cellParam);
			String value = cell.getStringCellValue();
			
			System.out.println("Valor de la celda " + value);
			if(iRow==rowParam) {
				return value;
			}else {
			iRow++;
			}
		}
		return null;
	}
	
	
}
