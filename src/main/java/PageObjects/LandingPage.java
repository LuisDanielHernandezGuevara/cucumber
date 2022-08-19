package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	public WebDriver driver;
	
	/*
	 * FIRST STEP
	 * Find the signInBTN
	*/
	By btn = By.className("login");
	
	/*
	 * SECOND STEP
	 * when user sends an email
	 */
	By email = By.id("email_create");
	
	
	/*
	 * THIRD STEP
	 * user tries to create an account
	 */
	By accBtn = By.cssSelector("[id='SubmitCreate']");
	
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSignIn() {
		return driver.findElement(btn);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getAccountBtn() {
		return driver.findElement(accBtn);
	}
	
	
	
}
