package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDetail.BaseDetail;

public class LoginPage extends BaseDetail{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@class = 'log-logo']/img")
	WebElement logo;
	
	@FindBy(xpath = "//p[text() = 'Welcome back! Please enter your details.']")
	WebElement welcomeText;
	
	@FindBy(xpath = "//h5")
	WebElement signInText;
	
	@FindBy(xpath = "//label[text() = 'Email ']")
	WebElement emailLabel;
	
	@FindBy(id = "email")
	WebElement emailInput;
	
	@FindBy(xpath = "//label[text() = 'Password ']")
	WebElement passwordLabel;
	
	@FindBy(id = "password")
	WebElement passwordInput;
	
	@FindBy(id = "loginButton")
	WebElement signInButton;
	
	@FindBy(xpath = "//p[@class = 'mb-0 signupcon']")
	WebElement dontHaveAccountTxt;
	
	@FindBy(xpath = "//a[text() = ' Sign Up ']")
	WebElement signUpLink;
	
	@FindBy(xpath = "//a[text() = 'Sign In']")
	WebElement signInLink;
	
	@FindBy(id = "email-error")
	WebElement email_error;
	
	@FindBy(id = "password-error")
	WebElement pass_error;
	
	@FindBy(xpath = "//div[@id = 'toast-container']/div/div[2]")
	WebElement ToasterAlert;

	public boolean linkHiveLogo() {
		boolean logo1 = logo.isDisplayed();
		return logo1;
	}
	
	public String getWelcomeText() {
		String text = welcomeText.getText();
		System.out.println(text);
		return text;
	}
	
	public String signInText() {
		String text = signInText.getText();
		System.out.println(text);
		return text;
	}
	
	public String email_Label() {
		String text = emailLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public String email_PlaceHolder() {
		String text = emailInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean email_enabledOrNot() {
		boolean text = emailInput.isEnabled();
		return text;
	}
	
	public String password_Label() {
		String text = passwordLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public String password_placeHolder(){
		String text = passwordInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean password_enabledOrNot(){
		boolean text = passwordInput.isEnabled();
		return text;
	}
	
	public String signIn_Button(){
		String text = signInButton.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean signInButton_enableOrNot(){
		boolean text = signInButton.isEnabled();
		return text;
	}
	
	public String dontHaveAccountText(){
		String text = dontHaveAccountTxt.getText();
		System.out.println(text);
		return text;
	}
	
	public void signUpLink(){
		click(signUpLink);
	}
	
	public void signIn_Link(){
		//javaScriptExecutorScrollIntoView(signInLink);
		click(signInLink);
	}
	
	public void login(String userEmail, String userPassWord) {
		clear(emailInput);
		clear(passwordInput);
		inputValue(emailInput, userEmail);
		inputValue(passwordInput, userPassWord);
		click(signInButton);
	}
	
	public String getEmailerror() {
		String text = email_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String getPasserror() {
		String text = pass_error.getText();
		System.out.println(text);
		return text;
	}
	
	public String scriptToaster() {
		waitForElementToBeVisible(ToasterAlert);
		String toastText = ToasterAlert.getText();
		System.out.println(toastText);
		return toastText;
	}
	
	public void waitforElementBeInVisible() {
		waitForElementToBeInVisible(ToasterAlert);
	}
	
	public String successLoginToaster() {
		String text = ToasterAlert.getText();
		return text;
	}
	
}
