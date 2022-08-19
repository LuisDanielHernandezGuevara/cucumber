package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class PersonalInfoPage {
	
	public WebDriver driver;

	/*
	 * SELECT RADIO BUTTON
	 */
	By chGender = By.cssSelector("input#id_gender1");
	/*
	 *ENTER FIRST NAME
	 */
	By name = By.id("customer_firstname");
	/*
	 * ENTER LASTANME
	 */
	By lastname = By.id("customer_lastname");
	
	
	/*
	 * GET THE PASSWORD FIELD
	 */
	By password = By.id("passwd");
	
	/*
	 * DROPS
	 */
	By days = By.id("days");
	By month = By.id("months");
	By years = By.id("years");
	
	
	/*
	 * CHECKBOX NEWSLETTER
	 */
	By newsletter = By.id("uniform-newsletter");
	By option = By.id("optin");

	/*
	 * 
	 * ADDRESS INFO
	 */
	By company = By.id("company");
	By address1 =By.id("address1");
	By address2 = By.id("address2");
	By city = By.id("city");
	
	/*
	 * WebElement id_state = driver.findElement(By.id("id_state"));
    	Select state = new Select(id_state);
    	state.selectByIndex(0);
    	
    	u1.setId(driver, "postcode","56789");

    
    	WebElement id_country = driver.findElement(By.id("id_country"));
    	Select country = new Select(id_country);
    	country.selectByIndex(0);
	 */
	
	By stateDrop = By.id("id_state");
	By countryDrop =By.id("id_country");

	/*
	 * POST CODE
	 */
	By zip = By.id("postcode");
	
	
	/*
	 * SET TELEPHONES
	 */
	By phone = By.id("phone");
	By phone_mobile = By.id("phone_mobile");
	
	/*
	 * CLICK ACC BTN
	 */
	By btnAcc = By.id("submitAccount");
	
	public WebElement getName() {
		return driver.findElement(name);
	}


	public WebElement getLastname() {
		return driver.findElement(lastname);
	}


	public PersonalInfoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getchGender() {
		return driver.findElement(chGender);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public Select dropDays() {
		WebElement dropDays = driver.findElement(days);
		dropDays.click();
		Select select1 = new Select(dropDays);
		return  select1;
	}
	
	public Select dropMonths() {
		WebElement dropMonths = driver.findElement(month);
		dropMonths.click();
		Select select2 = new Select(dropMonths);
		return  select2;
	}
	
	public Select dropYears() {
		WebElement dropYears = driver.findElement(years);
		dropYears.click();
		Select selectYear = new Select(dropYears);
		return  selectYear;
	}
	
	public WebElement checkUniformNewsLetter() {
		return driver.findElement(newsletter);
	}
	
	public WebElement optin() {
		return driver.findElement(option);
	}
	
	public WebElement getCompany() {
		return driver.findElement(company);
	}
	
	public WebElement getAddres1() {
		return driver.findElement(address1);
	}

	public WebElement getAddres2() {
		return driver.findElement(address2);
	}
	
	public WebElement getCity() {
		return driver.findElement(city);
	}
	
	public Select getStateDrop() {
		WebElement dropState = driver.findElement(stateDrop);
		dropState.click();
		Select selectState = new Select(dropState);
		return selectState;
	}
	
	public WebElement getZip() {
		return driver.findElement(zip);
	}
	
	public Select getCountryDrop() {
		WebElement dropCountry = driver.findElement(countryDrop);
		dropCountry.click();
		Select selectCountry = new Select(dropCountry);
		return selectCountry;
	}
	
	public WebElement getPhoneNumber() {
		return driver.findElement(phone);
	}
	
	public WebElement getMobileNumber() {
		return driver.findElement(phone_mobile);
	}
	
	public WebElement getBtnAccount() {
		return driver.findElement(btnAcc);
	}
	
	
	
	
	
	
	

}
