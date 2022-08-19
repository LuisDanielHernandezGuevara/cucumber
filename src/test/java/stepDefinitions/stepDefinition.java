package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandingPage;
import PageObjects.PersonalInfoPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import resources.base;

//@RunWith(Cucumber.class)
public class stepDefinition extends base {

	@Given("Initialize the browser with chrome")
	public void initilize_chrome_browser() {
		 driver =initializeDriver();
	}
	
	@Given("Open the chrome browser and launch the application")
	public void open_the_chrome_browser_and_launch_the_application() {
		//driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.get("http://automationpractice.com/index.php");
		System.out.println("executed");
	}
	
	@And("Clicks on te sign in button")
	public void clicks_on__sign_in_button() {
		LandingPage lp = new LandingPage(driver);
		lp.getSignIn().click();
		System.out.println("another excecutin");
	}
	
	@And("^Enter an email with \"([^\"]*)\"$")
	public void enter_and_email(String mail) {
		LandingPage lp = new LandingPage(driver);
		lp.getEmail().sendKeys(mail);
		System.out.println(mail);
	}
	
	@Then("^User tries to create an account$")
	public void user_tries_to_create_an_account() {
		LandingPage lp = new LandingPage(driver);
		lp.getAccountBtn().click();
	}
	
	@And("^Select a gender$")
	public void select_a_gender() throws InterruptedException {
		Thread.sleep(4000);
		PersonalInfoPage pp = new PersonalInfoPage(driver);
		pp.getchGender().click();
	}
	
	@And("^Enter a name with \"([^\"]*)\"$")
	public void enter_a_name(String name) {
		PersonalInfoPage pp = new PersonalInfoPage(driver);
		pp.getName().sendKeys(name);
	}
	
	@And("^Enter a lastname with \"([^\"]*)\"$")
	public void enter_a_last_name(String lastname) {
		PersonalInfoPage pp = new PersonalInfoPage(driver);
		pp.getLastname().sendKeys(lastname);
	}
	
	@And("Enter \"([^\"]*)\" as a password$") 
	public void enter_a_password(String password) {
		PersonalInfoPage pp = new PersonalInfoPage(driver);
		pp.getPassword().sendKeys(password);;
	}
	
	
	@And("select a day option$") 
	public void select_a_day_option() {
		PersonalInfoPage pp = new PersonalInfoPage(driver);
		pp.dropDays().selectByValue("22");
	}
	
	
	@And("select a month option$") 
	public void select_a_month_option() throws Throwable{
		PersonalInfoPage pp = new PersonalInfoPage(driver);
		pp.dropDays().selectByIndex(0);
	}
	
	@And("select a year option$") 
	public void select_a_year_option( ) throws Throwable {
		PersonalInfoPage pp = new PersonalInfoPage(driver);
		pp.dropMonths().selectByIndex(0);
		//pp.dropDays().selectByIndex(0);
	}
	
	@And("Check newsletter option$") 
	public void check_news_letter_option() throws Throwable {
		PersonalInfoPage pp = new PersonalInfoPage(driver);
		pp.checkUniformNewsLetter();
	}
	
	@And("Check option birthday$")
	public void check_birtday_option()throws Throwable {
		PersonalInfoPage pp = new PersonalInfoPage(driver);
		pp.optin().click();
	}
	
		@And("^Enter \"([^\"]*)\" as company$")
	    public void enter_something_as_company(String company) throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getCompany().sendKeys(company);
	    }

	    @And("^Enter \"([^\"]*)\" ad address$")
	    public void enter_something_ad_address(String address1) throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getAddres1().sendKeys(address1);
	    }

	    @And("^Enter \"([^\"]*)\" ad address2$")
	    public void enter_something_ad_address2(String address2) throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getAddres2().sendKeys(address2);
	    }

	    @And("^Enter \"([^\"]*)\" as a city$")
	    public void enter_something_as_a_city(String city) throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getCity().sendKeys(city);
	    }
	    
	    @And("^Select the dropdown State$")
	    public void select_the_dropdown_state() throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getStateDrop().selectByIndex(3);
	    }

	    @And("^Enter \"([^\"]*)\" as a postal code$")
	    public void enter_postal_code(String zip) throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getZip().sendKeys(zip);
	    }
	    
	    @And("^Select dropdown Country$")
	    public void select_dropdown_city() throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getCountryDrop().selectByIndex(1);
	    }

	    @And("^set \"([^\"]*)\" as a telephone number$")
	    public void set_something_as_a_telephone_number(String number) throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getPhoneNumber().sendKeys(number);;
	    }

	    @And("^Set \"([^\"]*)\" as a mobile number$")
	    public void set_something_as_a_mobile_phone_number(String mobile) throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getMobileNumber().sendKeys(mobile);
	    }
	    
	    /*
	     * LAST STEPS
	     */
	    @Then("^User sends Account Information$")
	    public void user_sends_account_information() throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getBtnAccount().click();
		    scrollDown(250);
		    takeScreen( "C://Users//1000075142//Documents//SeleniumResults//AcountCreated.png");
	    }
	    
	    /*
	     * ERROR MAIL SCENARIO METHOD	     */
	    @Then("^An error message is displayed$")
	    public void error_message_is_displayed() throws Throwable {
	    	scrollDown(150);
		    takeScreen("C://Users//1000075142//Documents//SeleniumResults//ErrorEmail.png");
	    }
	    
	    @Then("^User sends no Information$")
	    public void user_sends_no_information( ) throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getBtnAccount().click();
	    }
	    
	    @Then("^An error message blank fields is displayed$")
	    public void error_message_blank_fields_is_displayed() throws Throwable {
	    	scrollDown(150);
		    takeScreen("C://Users//1000075142//Documents//SeleniumResults//ErrorBlankFields.png");
	    }
	    
	    
	    
	
	
	

}
