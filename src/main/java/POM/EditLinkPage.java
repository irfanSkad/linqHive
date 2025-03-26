package POM;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDetail.BaseDetail;

public class EditLinkPage extends BaseDetail{
	public EditLinkPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[@class = 'btn p-0 LinkeditBtn'])[1]")
	WebElement editIcon;
	
	@FindBy(id = "modalForm")
	WebElement editLinkPopUp;
	
	@FindBy(xpath = "//h2[text() = 'Edit Link']")
	WebElement editLink_Text;
	
	@FindBy(xpath = "(//div/label[contains(text(), 'Title')])[2]")
	WebElement titleLabel;
	
	@FindBy(id = "linkTitle")
	WebElement titleInput;
	
	@FindBy(xpath = "(//label[contains(text(),'URL')])[1]")
	WebElement urlLabel;
	
	@FindBy(id = "linkUrl")
	WebElement urlInput;
	
	@FindBy(xpath = "(//label[contains(text(),'Description')])[2]")
	WebElement descriptionLabel;
	
	@FindBy(id = "linkDesc")
	WebElement descriptionInput;
	
	@FindBy(id = "saveModalBtn")
	WebElement updateLinkButton;
	
	@FindBy(id = "linkTitle-error")
	WebElement titleErrorMessage;
	
	@FindBy(id = "linkUrl-error")
	WebElement urlErrorMessage;
	
	@FindBy(xpath = "//div[@class = 'link-info']/div[text() = 'demmy12']")
	WebElement createLinkMatches;
	
	@FindBy(id = "saveShareBtn")
	WebElement saveButton;
	
	@FindBy(id = "email")
	WebElement emailInput;
	
	@FindBy(id = "password")
	WebElement passwordInput;
	
	@FindBy(id = "loginButton")
	WebElement loginBtn;
	
	public String editText() {
		waitForElementToBeInVisible(editIcon);
		String text = editIcon.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean clickEditPopUp() {
		waitForElementToBeClickable(editIcon);
		click(editIcon);
		waitForElementToBeVisible(editLink_Text);
		boolean popUp = editLink_Text.isDisplayed();
		return popUp;
	}

	public String editLinkText() {
		String text = editLink_Text.getText();
		System.out.println(text);
		return text;
	}
	
	public String title_Label() {
		waitForElementToBeVisible(titleLabel);
		String text = titleLabel.getText().replaceAll("\\*", "").trim();
		System.out.println(text);
		return text;
	}
	
	public String title_inputPlaceHolder(){
		String text = titleInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean title_inputEnable(){
		boolean text = titleInput.isEnabled();
		return text;
	}
	
	public String urlLabel(){
		String text = urlLabel.getText().replaceAll("\\*", "").trim();
		System.out.println(text);
		return text;
	}
	
	public String urlPlaceHolder(){
		String text = urlInput.getAttribute("placeHolder");
		System.out.println(text);
		return text;
	}
	
	public boolean urlInput_enabled(){
		boolean text = urlInput.isEnabled();
		return text;
	}
	
	public String descriptionLabelText(){
		String text = descriptionLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public String descriptionplaceHolderText(){
		String text = descriptionInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean descriptionInput_enabled(){
		boolean text = descriptionInput.isEnabled();
		return text;
	}
	
	public String updateChangesButtonText(){
		waitForElementToBeVisible(updateLinkButton);
		String text = updateLinkButton.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean UpdateChanges_enabled(){
		boolean text = updateLinkButton.isEnabled();
		return text;
	}
	
	public void edit_Link(String Title, String Url, String Description) {
		
		try {
	        // Wait until addLinkText is visible and clickable
	        waitForElementToBeVisible(editIcon);
	        waitForElementToBeClickable(editIcon);
	        
	        if (editIcon.isDisplayed()) {
	            try {
	                click(editIcon); // Normal click
	            } catch (ElementClickInterceptedException e) {
	                System.out.println("Element click intercepted, trying JavaScript click...");
	                JavascriptExecutor js = (JavascriptExecutor) driver;
	                js.executeScript("arguments[0].click();", editIcon);
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("addLinkText is not available: " + e.getMessage());
	    }
		clear(titleInput);
		clear(urlInput);
		clear(descriptionInput);
		inputValue(titleInput, Title);
		inputValue(urlInput, Url);
		inputValue(descriptionInput, Description);
		
		 waitForElementToBeClickable(updateLinkButton);
		    try {
		        click(updateLinkButton); // Normal click
		    } catch (ElementClickInterceptedException e) {
		        System.out.println("Element click intercepted, using JavaScript click...");
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].click();", updateLinkButton);
		    }
	}
	
	public String titleValidateMessage() {
		String text = titleErrorMessage.getText();
		System.out.println(text);
		return text;
	}
	
	public String urlValidateMessage() {
		String text = urlErrorMessage.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean LinkDisplay() {
		boolean text = createLinkMatches.isDisplayed();
		return text;
	}
	
	public String saveToaster() {
		click(saveButton);
		String text = saveButton.getText();
		System.out.println(text);
		return text;
	}
	
	public void validCred() {
		inputValue(emailInput, "hexanewuser1@gmail.com");
		inputValue(passwordInput, "Test@123");
		click(loginBtn);
	}
}
