package POM;

import org.apache.poi.ss.util.CellRangeAddressList;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDetail.BaseDetail;

public class AddLinkPage extends BaseDetail{
	public AddLinkPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/logo.svg']")
	WebElement linkHiveLogo;
	
	@FindBy(id = "addLinkBtn")
	WebElement addLinkText;
	
	@FindBy(id = "modalForm")
	WebElement addPopUp;
	
	@FindBy(xpath = "//h2[text() = ' Add Link']")
	WebElement addLinkText1;
	
	@FindBy(xpath = "(//label[contains(text(), 'Title')])[2]")
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
	
	@FindBy(id = "addLinkBtn")
	WebElement addLinkButton;
	
	@FindBy(xpath ="//div[@class = 'toggle-switch']")
	WebElement toggle;
	
	@FindBy(xpath = "(//div[@id = 'previewLinks']/a)[1]")
	WebElement previewLink;
	
	@FindBy(xpath = "(//button[@title = 'Delete Link'])[1]")
	WebElement delete;
	
	@FindBy(xpath = "//h4[text() = 'Are you sure?']")
	WebElement areyouSure;
	
	@FindBy(xpath = "//p[text() = 'Are you sure you want to delete this link?']")
	WebElement deleteconformText;
	
	@FindBy(xpath = "//button[text() = 'Yes, Delete It!']")
	WebElement deleteItText;
	
	@FindBy(xpath = "(//div[@data-id = '3'])[1]")
	WebElement createdLink;
	
	@FindBy(id = "linkTitle-error")
	WebElement titleErrorMessage;
	
	@FindBy(xpath = "//div[@id = 'linkUrl-error']")
	WebElement urlErrorMessage;
	
	@FindBy(xpath = "//div[@class = 'link-info']/div[text() = 'demmy12']")
	WebElement createLinkMatches;
	
	@FindBy(xpath = "(//button[@id = 'saveShareBtn'])[2]")
	WebElement saveButton;
	
	@FindBy(id = "toast-container")
	WebElement toastMessage;
	
	@FindBy(xpath = "//div[@class = 'share-modal-body modal-body text-center qr-modal-body']")
	WebElement shareLink_PopUp;
	
	@FindBy(id = "email")
	WebElement emailInput;
	
	@FindBy(id = "password")
	WebElement passwordInput;
	
	@FindBy(id = "loginButton")
	WebElement loginBtn;
	
	@FindBy(xpath = "(//button[@aria-label = 'Close'])[1]")
	WebElement cancelIcon;
	
	@FindBy(xpath = "//button[text() = 'Close']")
	WebElement closeButton;
	
	@FindBy(xpath = "//div[text() = 'Saved successfully!']")
	WebElement saveToasterMessage;
	
	@FindBy(id = "saveModalBtn")
	WebElement clickaddLinkPopUp;
	
	@FindBy(xpath = "//div[@class = 'toggle-switch active']")
	WebElement toggleIcon;
	
	public boolean logoDisplay() {
		boolean logo = linkHiveLogo.isDisplayed();
		return logo;
	}
	
	public boolean addLinkBtn() {
		return addLinkText.isDisplayed();
	}
	public String addLink_Text() {
		String text = addLinkText.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean addLinkButton(){
		boolean button = addLinkText.isEnabled();
		return button;
	}
	
	public boolean addLinkPopUp(){
		click(addLinkText);
		waitForElementToBeVisible(addPopUp);
		boolean popUp = addPopUp.isDisplayed();
		return popUp;
	}
	
	public String add_Link_Text(){
		String text = addLinkText1.getText();
		System.out.println(text);
		return text;
	}
	
	public String add_titleLabel(){
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
		String text = urlLabel.getText().replaceAll("\\*", "").trim();;
		System.out.println(text);
		return text;
	}
	
	public String urlPlaceHolder(){
		String text = urlInput.getAttribute("placeholder");
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
	
	public String addLinkText(){
		String text = addLinkButton.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean addLink_enabled(){
		boolean text = addLinkButton.isEnabled();
		return text;
	}
	

	
	/*public boolean toggleIcon(){
		click(toggle);
		if(!(previewLink.isDisplayed())){
			boolean preview = previewLink.isDisplayed();
			return preview;
		}
		else if((previewLink.isDisplayed())) {
			boolean preview = previewLink.isDisplayed();
			return preview;
			
		}
		return true;
	}*/
	
	public boolean clickdelete(){
		click(cancelIcon);
		waitForElementToBeClickable(delete);
		click(delete);
		waitForElementToBeVisible(areyouSure);
		boolean deletePopUp = areyouSure.isDisplayed();
		click(closeButton);
		return deletePopUp;
	}
	
	public String getAreyouSure(){
		//click(closeButton);
		waitForElementToBeClickable(delete);
		click(delete);
		waitForElementToBeVisible(areyouSure);
		String text = areyouSure.getText();
		System.out.println(text);
		click(closeButton);
		return text;
	}
	
	public String deleteconform_text(){
		//click(closeButton);
		waitForElementToBeClickable(delete);
		click(delete);
		waitForElementToBeVisible(areyouSure);
		String text = deleteconformText.getText();
		System.out.println(text);
		click(closeButton);
		return text;
	}
	
	public String deleteit_Text(){
		
		waitForElementToBeClickable(delete);
		click(delete);
		waitForElementToBeVisible(areyouSure);
		String text = deleteItText.getText();
		System.out.println(text);
		click(closeButton);
		return text;
	}
	
	public boolean deleteitButton_enabled(){
		
		waitForElementToBeClickable(delete);
		click(delete);
		waitForElementToBeVisible(areyouSure);
		boolean text = deleteItText.isEnabled();
		click(closeButton);
		return text;
	}
	
	public String deletecloseButton(){
		
		waitForElementToBeClickable(delete);
		click(delete);
		waitForElementToBeVisible(areyouSure);
		String text = closeButton.getText();
		System.out.println(text);
		click(closeButton);
		return text;
	}
	
	public boolean closeButton_enabled(){
		//click(cancelIcon);
		waitForElementToBeClickable(delete);
		click(delete);
		waitForElementToBeVisible(areyouSure);
		boolean text = closeButton.isEnabled();
		click(closeButton);
		return text;
	}
	
	public boolean closeButtonisWorkingorNot(){
		click(delete);
		
		boolean addLink = addLinkText.isDisplayed();
		click(closeButton);
		return addLink;
	}
	
	public boolean createLink(){
		boolean addLink = createdLink.isDisplayed();
		click(addLinkButton);
		return addLink;
		
	}
	
//	public void clickAddBtnLink() {
//		click(addLinkButton);
//	}
	
	
	public void add_Link(String Title, String Url, String Description){
		try {
	        // Wait until addLinkText is visible and clickable
	        waitForElementToBeVisible(addLinkText);
	        waitForElementToBeClickable(addLinkText);
	        
	        if (addLinkText.isDisplayed()) {
	            try {
	                click(addLinkText); // Normal click
	            } catch (ElementClickInterceptedException e) {
	                System.out.println("Element click intercepted, trying JavaScript click...");
	                JavascriptExecutor js = (JavascriptExecutor) driver;
	                js.executeScript("arguments[0].click();", addLinkText);
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

	    // Wait for the button to be clickable before clicking
	    waitForElementToBeClickable(clickaddLinkPopUp);
	    try {
	        click(clickaddLinkPopUp); // Normal click
	    } catch (ElementClickInterceptedException e) {
	        System.out.println("Element click intercepted, using JavaScript click...");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", clickaddLinkPopUp);
	    }
		
//			clear(titleInput);
//			clear(urlInput);
//			clear(descriptionInput);
//			inputValue(titleInput, Title);
//			inputValue(urlInput, Url);
//			inputValue(descriptionInput, Description);
//			waitForElementToBeClickable(clickaddLinkPopUp);
//			click(clickaddLinkPopUp);
//			
//			if(addLinkText.isDisplayed()) {
//				click(addLinkText);
//			}
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
	
	public void validCred() {
		inputValue(emailInput, "hexanewuser1@gmail.com");
		inputValue(passwordInput, "Test@123");
		click(loginBtn);
	}
	public void saveToaster() {
		javaScriptExecutorScrollIntoView(createLinkMatches);
		click(saveButton);
	}
}
