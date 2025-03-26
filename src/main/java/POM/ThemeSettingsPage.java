package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDetail.BaseDetail;

public class ThemeSettingsPage extends BaseDetail{
	public ThemeSettingsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	WebElement emailInput;
	
	@FindBy(id = "password")
	WebElement passwordInput;
	
	@FindBy(id = "loginButton")
	WebElement loginBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Theme')]")
	WebElement clickThemeSettings;
	
	@FindBy(xpath = "//h4[contains(text(),'Overview')]")
	WebElement overViewText;
	
	@FindBy(id = "applyOverviewImageBtn")
	WebElement editImageBtn;
	
	@FindBy(id = "cancelOverviewImg")
	WebElement removeBtn;
	
	@FindBy(xpath = "//label[text() = 'Title']")
	WebElement titleLabel;
	
	@FindBy(id = "themeTitle")
	WebElement titleInput;
	
	@FindBy(xpath = "//label[text() = 'Description']")
	WebElement descriptionLabel;
	
	@FindBy(id = "themeDesc")
	WebElement descriptionInput;
	
	@FindBy(xpath = "//h4[text() = 'Layouts']")
	WebElement layOutText;
	
	@FindBy(xpath = "//button[contains(text(),'BUILD')]")
	WebElement buildYourOwnText;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/frames/template2.png']")
	WebElement selectImage;
	
	@FindBy(xpath = "//div[contains(@style,'/frames/frame2.png')]")
	WebElement previewImage;
	
	@FindBy(xpath = "//h4[text() = 'Background']")
	WebElement backgroundText;
	
	@FindBy(xpath = "//div[text() = 'Choose Mode:']")
	WebElement chooseModeText;
	
	@FindBy(xpath = "//span[text() = 'Flat Color']")
	WebElement flatColourText;
	
	@FindBy(xpath = "//span[text() = 'Gradient']")
	WebElement gradientText;
	
	@FindBy(xpath = "//span[text() = 'Image']")
	WebElement imageText;
	
	@FindBy(id = "applyFlatBtn")
	WebElement selectBackgroundStyle;
	
	@FindBy(xpath = "//div[contains(@style, 'color: rgb(255, 255, 255); background-size: cover; background-color: rgb(0, 0, 0)')]")
	WebElement previewBackground;
	
	@FindBy(id = "applyGradBtn")
	WebElement selectBackgroundStyle1;
	
	@FindBy(xpath = "//div[contains(@style, 'color: rgb(255, 255, 255); background-size: cover; background-color:')]")
	WebElement previewBackground1;
	
	@FindBy(id = "applyImgBtn")
	WebElement imageStyle;
	
	@FindBy(xpath  = "//label[text() = 'Background Image']")
	WebElement backgroundImageText;
	
	@FindBy(xpath = "//h4[text() = 'Button Style']")
	WebElement buttonStyleText;
	
	@FindBy(xpath = "//label[text() = 'Button Color']")
	WebElement buttonColourText;
	
	@FindBy(xpath = "//label[text() = 'Text Color']")
	WebElement textColour;
	
	@FindBy(xpath = "//label[text() = 'Border Color']")
	WebElement borderColourText;
	
	@FindBy(xpath = "//div[text() = 'Rectangle']")
	WebElement rectangleText;
	
	@FindBy(xpath = "//div[text() = 'Solid']")
	WebElement solidText;
	
	@FindBy(xpath = "//div[contains(text(),'Outline')]")
	WebElement outLineText;
	
	@FindBy(xpath = "//div[text() = 'Rounded']")
	WebElement roundedText;
	
	@FindBy(xpath = "//div[contains(text(),'Round Out')]")
	WebElement roundOutText;
	
	@FindBy(xpath = "//div[contains(text(),'Pill')]")
	WebElement pillText;
	
	@FindBy(xpath = "//h4[contains(text(),'Icon Style')]")
	WebElement IconStyleText;
	
	@FindBy(xpath = "//label[contains(text(),'Icon Color:')]")
	WebElement iconColourText;
	
	@FindBy(xpath = "//h2[contains(text(),'Fonts Style')]")
	WebElement fontStyleText;
	
	@FindBy(xpath = "//label[contains(text(),'Choose a Font Family')]")
	WebElement chooseFontFamilyText;
	
	@FindBy(xpath = "//label[contains(text(),'Global Text Color')]")
	WebElement globalTextColour;
	
	
	public void validCred() {
		inputValue(emailInput, "hexanewuser1@gmail.com");
		inputValue(passwordInput, "Test@123");
		click(loginBtn);
	}
	
	public boolean clickTheme() {
		click(clickThemeSettings);
		boolean overview = overViewText.isDisplayed();
		return overview;
	}
	
	public String overViewSpelling() {
		String text = overViewText.getText();
		System.out.println(text);
		return text;
	}
	
	public String editImageSpelling() {
		String text = editImageBtn.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean editImageBtnEnabled() {
		boolean text = editImageBtn.isEnabled();
		return text;
	}
	
	public String removeBtnSpelling() {
		String text = removeBtn.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean removeBtnEnabled() {
		boolean text = removeBtn.isEnabled();
		return text;
	}
	
	public String titleLabelSpelling() {
		String text = titleLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean titleInputEnabled() {
		boolean text = titleInput.isEnabled();
		return text;
	}
	
	public String descriptionSpelling() {
		String text = descriptionLabel.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean descriptionInputEnabled() {
		boolean text = descriptionInput.isEnabled();
		return text;
	}
	
	public String layOutSpelling() {
		String text = layOutText.getText();
		System.out.println(text);
		return text;
	}
	
	public String buildYourOwnSpelling() {
		String text = buildYourOwnText.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean selectImageIsReflectToPreview() {
		click(selectImage);
		boolean preview = previewImage.isDisplayed();
		return preview;
	}
	
	public String backGroundSpelling() {
		String text = backgroundText.getText();
		System.out.println(text);
		return text;
	}
	
	public String chooseModeSpelling() {
		String text = chooseModeText.getText();
		System.out.println(text);
		return text;
	}
	
	public String flatColourSpelling() {
		String text = flatColourText.getText();
		System.out.println(text);
		return text;
	}
	
	public String gradientSpelling() {
		String text = gradientText.getText();
		System.out.println(text);
		return text;
	}
	
	public String imageTextSpelling() {
		String text = imageText.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean backgroundImageTextDisplay() throws InterruptedException {
		for(int i = 1; i <3 ;i++) {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			 j.executeScript("window.scrollBy(0,400)");//To scroll down   
			 Thread.sleep(1000);
			}
		waitForElementToBeClickable(imageStyle);
		click(imageStyle);
		waitForElementToBeVisible(backgroundImageText);
		boolean preview = backgroundImageText.isDisplayed();
		return preview;
	}
	
	public String buttonStyleTextSpelling() {
		String text = buttonStyleText.getText();
		System.out.println(text);
		return text;
	}
	
	public String buttonColourTextSpelling() {
		String text = buttonColourText.getText();
		System.out.println(text);
		return text;
	}
	
	public String textColourSpelling() {
		String text = textColour.getText();
		System.out.println(text);
		return text;
	}
	
	public String borderColourSpelling() {
		String text = borderColourText.getText();
		System.out.println(text);
		return text;
	}
	
	public String rectangleTextSpelling() {
		String text = rectangleText.getText();
		System.out.println(text);
		return text;
	}
	
	public String solidTextSpelling() {
		String text = solidText.getText();
		System.out.println(text);
		return text;
	}
	
	public String outlineTextSpelling() {
		String text = outLineText.getText();
		System.out.println(text);
		return text;
	}
	
	public String roundedTextSpelling() {
		String text = roundedText.getText();
		System.out.println(text);
		return text;
	}
	
	public String roundOutTextSpelling() {
		String text = roundOutText.getText();
		System.out.println(text);
		return text;
	}
	
	public String pillTextSpelling() {
		String text = pillText.getText();
		System.out.println(text);
		return text;
	}
	
	public String iconStyleTextSpelling() {
		String text = IconStyleText.getText();
		System.out.println(text);
		return text;
	}
	
	public String iconColourTextSpelling() {
		String text = iconColourText.getText();
		System.out.println(text);
		return text;
	}
	
	public String fontStyleTextSpelling() {
		String text = fontStyleText.getText();
		System.out.println(text);
		return text;
	}
	
	public String chooseFontFamilyTextSpelling() {
		String text = chooseFontFamilyText.getText();
		System.out.println(text);
		return text;
	}
	
	public String globalTextColourSpelling() {
		String text = globalTextColour.getText();
		System.out.println(text);
		return text;
	}
	
	
}


