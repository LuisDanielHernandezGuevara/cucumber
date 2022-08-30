package stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandingPage;
import PageObjects.PersonalInfoPage;
import PageObjects.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import resources.base;

//@RunWith(Cucumber.class)
public class stepDefinition extends base {

	/*
	 * COMMON SCENARIO STEPS
	 */
	@Given("Initialize the browser with chrome")
	public void initilize_chrome_browser() {
		 driver =initializeDriver();
	}
	
	@Given("Open the chrome browser and launch the application")
	public void open_the_chrome_browser_and_launch_the_application() throws EncryptedDocumentException, IOException {
				String val = getCells(0,0);
				driver.get(val);		
	}
	
	@And("Clicks on te sign in button")
	public void clicks_on__sign_in_button() {
		LandingPage lp = new LandingPage(driver);
		lp.getSignIn().click();
		System.out.println("another excecutin");
	}
	
	@And("^Enter an email with \"([^\"]*)\"$")
	//@And("^Enter an email")
	public void enter_an_email(String email) throws EncryptedDocumentException, IOException {
		LandingPage lp = new LandingPage(driver);
		//String mail = getCells(1,1);
		lp.getEmail().sendKeys(email);
		System.out.println(email);
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
	    
	    /*
	     * WRONG INFO SENT
	     */
	    @Then("^User sends Wrong Information$")
	    public void user_sends_wrong_information() throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getBtnAccount().click();
		    scrollDown(250);
		    takeScreen( "C://Users//1000075142//Documents//SeleniumResults//WrongInfoError.png");
	    }
	    
	    
	    
	    
	    /*
	     * SEARCH FEATURE
	     */

	   
	    @And("^Hover on Womens link$")
	    public void hover_on_womens_link() throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getWomensLink();
	    }

	    @And("^ClickTShirt Sub Menu$")
	    public void clicktshirt_sub_menu() throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getSubTShirt().click();
	    }

	    @And("^Get Name of displayed Text$")
	    public void get_name_of_displayed_text() throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getItems();
			//Missing step wth test ng
			//compare result text
	    	
	    }

	    @And("^Enter the name on search bar$")
	    public void enter_the_name_on_search_bar() throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			String text = pp.getItems();
			pp.getsearchBar().sendKeys(text);

	    }
	    
	    @Then("^Click on search Button$")
	    public void click_on_search_button() throws Throwable {
			PersonalInfoPage pp = new PersonalInfoPage(driver);
			pp.getbtnBar();
			
	    }
	    
	    
	    /*
	     * buyProduct
	     */
	    
	    @And("Click on more button")
	    public void click_more_btn() {
	    ProductPage pp = new ProductPage(driver) ;
	    List<WebElement> spans = pp.getbtnMore();
	  for(WebElement i : spans) {
		String text = i.getText();
		if(text.contains("More")) {
			i.click();
			break;
		}
    }
	  
	    }
	    
	    
	    @And("Increment items")
	    public void increment_items() {
		    ProductPage pp = new ProductPage(driver) ;
		    pp.getIconIncrement().click();
		    pp.getIconIncrement().click();
	    }
	    
	    @And("Select size")
	    public void select_size() {
		    ProductPage pp = new ProductPage(driver) ;
		    pp.getSize().selectByIndex(2);
	    }
	    

	    @And("^Select orange color$")
	    public void select_orange_color() throws Throwable {
		    ProductPage pp = new ProductPage(driver) ;
		    pp.getColor().click();;
	    }

	    @And("^Click add to cart button$")
	    public void click_add_to_cart_button() throws Throwable {
		    ProductPage pp = new ProductPage(driver) ;
		   List<WebElement> products= pp.getCartBtn();
		   for(WebElement b: products ) {
				if(b.getText().equals("Add to cart")) {
					b.click();
				}
			}
	    }
	    
	    @And("Proceed to process payment")
	    public void click_process() throws Throwable  {
	    	 ProductPage pp = new ProductPage(driver) ;
			    pp.getProcess().click();
			    pp.getProcess2().click();
	    }

	    @And("^Send \"([^\"]*)\" as an email field$")
	    public void send_something_as_an_email_field(String email) throws Throwable {
		    ProductPage pp = new ProductPage(driver) ;
		    pp.getEmail().sendKeys(email);
	    }

	    @And("^Send \"([^\"]*)\" as a password field$")
	    public void send_something_as_a_password_field(String password) throws Throwable {
		    ProductPage pp = new ProductPage(driver) ;
		    pp.getPassword().sendKeys(password);

	    }

	    @And("^Click on the submit login button$")
	    public void click_on_the_submit_login_button() throws Throwable {
		    ProductPage pp = new ProductPage(driver) ;
		    pp.getSubmitInfo().click();
	    }

	    @And("^Click button in process address$")
	    public void click_button_in_process() throws Throwable {
		    ProductPage pp = new ProductPage(driver) ;
		    pp.getProcessCarrier();
	    }

	    @And("^Click on checkbox agreement$")
	    public void click_on_checkbox_agreement() throws Throwable {
		    ProductPage pp = new ProductPage(driver) ;
		    pp.getCheck().click();
	    }

	    @Then("^Finishes the process$")
	    public void finishes_the_process() throws Throwable {
		    ProductPage pp = new ProductPage(driver) ;
		    pp.getLastBtn().click();
	    }

	    
	    
	    

	    
	
	
	

}
