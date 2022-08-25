package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	public WebDriver driver;
	
	By btnMore = By.tagName("a");
	
	
	By increment = By.className("icon-plus");
	
	
	
	/*
	 * Select size
	 */
	
	By size = By.id("group_1");
	
	
	/*
	 * Select color
	 */
	By color = By.id("color_14");
	
	
	/*
	 * Add to cart btn 
	 */
	By cartBtn = By.tagName("span");
	
	
	/*
	 * Process Payment
	 */
	By process = By.cssSelector("a.btn.btn-default.button.button-medium");
	
	/*
	 * Process payment 2
	 */
	
	By process2 = By.cssSelector("a.button.btn.btn-default.standard-checkout.button-medium");
	
	
	/*
	 * email
	 */
	By email = By.id("email");
	
	/*
	 * Password
	 */
	By password = By.id("passwd");
	
	/*
	 * Button submit login info
	 */
	By btnSubmit = By.cssSelector("[id='SubmitLogin']");
	
	/*
	 * Process button
	 */
	By procBtn = By.cssSelector("button.button.btn.btn-default.button-medium");
	
	/*
	 * checkbox agreement
	 */
	By checkAgree = By.id("cgv");
	
	/*
	 * process carrier button
	 */
	By processCarrier = By.name("processCarrier");
	
	/*
	 * bankwire button
	 */
	By bankwire = By.className("bankwire");
	
	/*
	 * Last tbutton
	 */
	
	By lastBtn = By.cssSelector("button.button.btn.btn-default.button-medium");
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public List<WebElement> getbtnMore() {
		List<WebElement> spans = driver.findElements(btnMore);
		//for(WebElement i : spans) {
			//String text = i.getText();
			//if(text.contains("More")) {
				//i.click();
				//break;
			//}
			//return i;
	   // }
		return  spans;
	}
	
	public WebElement getIconIncrement() {
		return driver.findElement(increment);
	}
	
	public Select getSize() {
		WebElement sizeEl = driver.findElement(size);
		Select item = new Select (sizeEl);
		return item;
	}
	
	public WebElement getColor() {
		return driver.findElement(color);
	}
	
	public List<WebElement> getCartBtn(){
		return driver.findElements(cartBtn);
	}
	
	public WebElement getProcess() {
		return driver.findElement(process);
	}
	
	public WebElement getProcess2() {
		return driver.findElement(process2);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getSubmitInfo() {
		return driver.findElement(btnSubmit);
	}
	
	public WebElement getProcessBtn() {
		return driver.findElement(procBtn);
	}
	
	public WebElement getCheck() {
		return driver.findElement(checkAgree);
	}
	
	public WebElement getProcessCarrier() {
		return driver.findElement(processCarrier);
	}
	
	public WebElement getbankwire() {
		return driver.findElement(bankwire);
	}
	
	public WebElement getLastBtn() {
		return driver.findElement(lastBtn);
	}
}
