package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDetail.BaseDetail;

public class SocialMediaIconsPage extends BaseDetail{
	public SocialMediaIconsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Social')]")
	WebElement socialMediaTab;
	
	@FindBy(id = "addSocialBtnTop")
	WebElement addOtherSocial;
	
	@FindBy(xpath = "//h3[text() = 'Make it easy to follow you']")
	WebElement makeItEasyText;
	
	@FindBy(xpath = "//p[contains(text(),'Drag')]")
	WebElement dragToReOrderText;
	
	@FindBy(xpath = "//h4[text() = 'Customize Your Social Media Icon Placement']")
	WebElement customizeYourSocialText;
	
	@FindBy(xpath = "//p[text() = 'Feature icons at the top or bottom of your profile']")
	WebElement featureIconsText;
	
	@FindBy(xpath = "//label[contains(text(),'Top')]")
	WebElement labelTopSpelling;
	
	@FindBy(xpath = "//label[contains(text(),'Bottom')]")
	WebElement labelBottomSpelling;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/facebook.svg']")
	WebElement faceBookLogo;
	
	@FindBy(xpath = "//div[text() = ' Facebook']")
	WebElement faceBookText;
	
	@FindBy(xpath = "//input[@placeholder = 'https://facebook.com/facebookpageurl']")
	WebElement faceBookInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/instagram.svg']")
	WebElement instagramLogo;
	
	@FindBy(xpath = "//div[text() = ' Instagram']")
	WebElement instagramText;
	
	@FindBy(xpath = "//input[@placeholder = '@instagramusername']")
	WebElement instagramInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/twitter.svg']")
	WebElement twitterLogo;
	
	@FindBy(xpath = "//div[text() = ' X']")
	WebElement twitterText;
	
	@FindBy(xpath = "//input[@placeholder = '@yourxhandle']")
	WebElement twitterInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/linkedIn.svg']")
	WebElement linkedInLogo;
	
	@FindBy(xpath = "//div[text() = ' LinkedIn']")
	WebElement linkedInText;
	
	@FindBy(xpath = "//input[@placeholder = 'https://linkedin.com/in/username']")
	WebElement linkedInInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/youTube.svg']")
	WebElement youtubeLogo;
	
	@FindBy(xpath = "//div[text() = ' YouTube']")
	WebElement youtubeText;
	
	@FindBy(xpath = "//input[@placeholder = 'https://youtube.com/channel/youtubeurl']")
	WebElement youtubeInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/whatsapp.svg']")
	WebElement whatsAppLogo;
	
	@FindBy(xpath = "//div[text() = ' WhatsApp']")
	WebElement whatsAppText;
	
	@FindBy(xpath = "//input[@placeholder = '+0000000000']")
	WebElement whatsAppInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/snapchat.svg']")
	WebElement snapchatLogo;
	
	@FindBy(xpath = "//div[text() = ' Snapchat']")
	WebElement snapchatText;
	
	@FindBy(xpath = "//input[@placeholder = 'https://www.snapchat.com/add/username']")
	WebElement snapchatInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/discord.svg']")
	WebElement discordLogo;
	
	@FindBy(xpath = "//div[text() = ' Discord']")
	WebElement discordText;
	
	@FindBy(xpath = "//input[@placeholder = 'https://discord.com/invite/yourchannel']")
	WebElement discordInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/threads.svg']")
	WebElement threadsLogo;
	
	@FindBy(xpath = "//div[text() = ' Threads']")
	WebElement threadsText;
	
	@FindBy(xpath = "//input[@placeholder = '@threadsusername']")
	WebElement threadsInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/dribbble.svg']")
	WebElement dribbleLogo;
	
	@FindBy(xpath = "//div[text() = ' Dribbble']")
	WebElement dribbleText;
	
	@FindBy(xpath = "//input[@placeholder = 'https://dribbble.com/add/username']")
	WebElement dribbleInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/tikTok.svg']")
	WebElement tikTokLogo;
	
	@FindBy(xpath = "//div[text() = ' TikTok']")
	WebElement tikTokText;
	
	@FindBy(xpath = "//input[@placeholder = '@tiktokusername']")
	WebElement tikTokInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/twitch.svg']")
	WebElement twitchLogo;
	
	@FindBy(xpath = "//div[text() = ' Twitch']")
	WebElement twitchText;
	
	@FindBy(xpath = "//input[@placeholder = 'https://twitch.tv/']")
	WebElement twitchInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/pinterest.svg']")
	WebElement pinterestLogo;
	
	@FindBy(xpath = "//div[text() = ' Pinterest']")
	WebElement pinterestText;
	
	@FindBy(xpath = "//input[@placeholder = 'https://pinterest.com/']")
	WebElement pinterestInput;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/reddit.svg']")
	WebElement redditLogo;
	
	@FindBy(xpath = "//div[text() = ' Reddit']")
	WebElement redditText;
	
	@FindBy(xpath = "//input[@placeholder = 'https://www.reddit.com/yourid']")
	WebElement redditInput;
	
	@FindBy(id = "addSocialBtnBottom")
	WebElement bottomAddSocialBtn;
	
	@FindBy(xpath = "//img[@src = 'https://user.linqhive.com/assets/images/social/website.svg']")
	WebElement customSocialLogo;
	
	@FindBy(xpath = "//div[text() = ' Custom Social']")
	WebElement customSocialText;
	
	@FindBy(xpath = "//input[@placeholder = 'https://']")
	WebElement customSocialInput;
	
	@FindBy(xpath = "(//button[@class = 'btn p-0 text-secondary cussocialdelBtn'])[17]")
	WebElement deleteIcon;
	
	@FindBy(xpath = "//h4[text() = 'Are you sure?']")
	WebElement areYouSureText;
	
	@FindBy(xpath = "//p[text() = 'Are you sure you want to delete this social link?']")
	WebElement deleteConfirmationText;
	
	@FindBy(xpath = "//button[text() = 'Yes, Delete It!']")
	WebElement yesDeleteIt;
	
	@FindBy(xpath = "//button[text() = 'Close']")
	WebElement closeBtn;
	
	@FindBy(id = "email")
	WebElement emailInput;
	
	@FindBy(id = "password")
	WebElement passwordInput;
	
	@FindBy(id = "loginButton")
	WebElement loginBtn;
	
	
	public boolean socialMedia_Tab() {
		click(socialMediaTab);
		boolean social = addOtherSocial.isEnabled();
		return social;
	}
	
	public String getAddSocialTab() {
		String text = addOtherSocial.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean getAddSocialEnabled() {
		boolean text = addOtherSocial.isEnabled();
		return text;
	}
	
	public String makeItEasy_Text() {
		String text = makeItEasyText.getText();
		System.out.println(text);
		return text;
	}
	
	public String dragToReOrder_Text() {
		String text = dragToReOrderText.getText();
		System.out.println(text);
		return text;
	}
	
	public String customizeYourSocial_Text() {
		String text = customizeYourSocialText.getText();
		System.out.println(text);
		return text;
	}
	
	public String featureIcon_Text() {
		String text = featureIconsText.getText();
		System.out.println(text);
		return text;
	}
	
	public String labelTopSpelling_Text() {
		String text = labelTopSpelling.getText();
		System.out.println(text);
		return text;
	}
	
	public String labelBottomSpelling_Text() {
		String text = labelBottomSpelling.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean faceBookLogoDisplay() {
		boolean text = faceBookLogo.isDisplayed();
		return text;
	}
	
	public String faceBookSpelling_Text() {
		String text = faceBookText.getText();
		System.out.println(text);
		return text;
	}
	
	public String faceBookInputPlaceHolder() {
		String text = faceBookInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean faceBookInputEnabled() {
		boolean text = faceBookInput.isEnabled();
		return text;
	}
	
	public boolean instagramLogoDisplay() {
		boolean text = instagramLogo.isDisplayed();
		return text;
	}
	
	public String instagramSpelling_Text() {
		String text = instagramText.getText();
		System.out.println(text);
		return text;
	}
	
	public String instagramInputPlaceHolder() {
		String text = instagramInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean instagramInputEnabled() {
		boolean text = instagramInput.isEnabled();
		return text;
	}
	
	public boolean twitterLogoDisplay() {
		boolean text = twitterLogo.isDisplayed();
		return text;
	}
	
	public String twitterSpelling_Text() {
		String text = twitterText.getText();
		System.out.println(text);
		return text;
	}
	
	public String twitterInputPlaceHolder() {
		String text = twitterInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean twitterInputEnabled() {
		boolean text = twitterInput.isEnabled();
		return text;
	}
	
	public boolean linkedInLogoDisplay() {
		boolean text = linkedInLogo.isDisplayed();
		return text;
	}
	
	public String linkedInSpelling_Text() {
		String text = linkedInText.getText();
		System.out.println(text);
		return text;
	}
	
	public String linkedInInputPlaceHolder() {
		String text = linkedInInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean linkedInInputEnabled() {
		boolean text = linkedInInput.isEnabled();
		return text;
	}
	
	public boolean youtubeInLogoDisplay() {
		boolean text = youtubeLogo.isDisplayed();
		return text;
	}
	
	public String youtubeSpelling_Text() {
		String text = youtubeText.getText();
		System.out.println(text);
		return text;
	}
	
	public String youtubeInputPlaceHolder() {
		String text = youtubeInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean youtubeInputEnabled() {
		boolean text = youtubeInput.isEnabled();
		return text;
	}
	
	public boolean whatsAppInLogoDisplay() {
		boolean text = whatsAppLogo.isDisplayed();
		return text;
	}
	
	public String whatsAppSpelling_Text() {
		String text = whatsAppText.getText();
		System.out.println(text);
		return text;
	}
	
	public String whatsAppInputPlaceHolder() {
		String text = whatsAppInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean whatsAppInputEnabled() {
		boolean text = whatsAppInput.isEnabled();
		return text;
	}
	
	public boolean snapchatInLogoDisplay() {
		boolean text = snapchatLogo.isDisplayed();
		return text;
	}
	
	public String snapchatSpelling_Text() {
		String text = snapchatText.getText();
		System.out.println(text);
		return text;
	}
	
	public String snapchatInputPlaceHolder() {
		String text = snapchatInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean snapchatInputEnabled() {
		boolean text = snapchatInput.isEnabled();
		return text;
	}
	
	public boolean discordInLogoDisplay() {
		boolean text = discordLogo.isDisplayed();
		return text;
	}
	
	public String discordSpelling_Text() {
		String text = discordText.getText();
		System.out.println(text);
		return text;
	}
	
	public String discordInputPlaceHolder() {
		String text = discordInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean discordInputEnabled() {
		boolean text = discordInput.isEnabled();
		return text;
	}
	
	public boolean threadsInLogoDisplay() {
		boolean text = threadsLogo.isDisplayed();
		return text;
	}
	
	public String threadsSpelling_Text() {
		String text = threadsText.getText();
		System.out.println(text);
		return text;
	}
	
	public String threadsInputPlaceHolder() {
		String text = threadsInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean threadsInputEnabled() {
		boolean text = threadsInput.isEnabled();
		return text;
	}
	
	public boolean dribbbleInLogoDisplay() {
		boolean text = dribbleLogo.isDisplayed();
		return text;
	}
	
	public String dribbble_Text() {
		String text = dribbleText.getText();
		System.out.println(text);
		return text;
	}
	
	public String dribbbleInputPlaceHolder() {
		String text = dribbleInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean dribbbleInputEnabled() {
		boolean text = dribbleInput.isEnabled();
		return text;
	}
	
	public boolean tikTokInLogoDisplay() {
		boolean text = tikTokLogo.isDisplayed();
		return text;
	}
	
	public String tikTok_Text() {
		String text = tikTokText.getText();
		System.out.println(text);
		return text;
	}
	
	public String tikTokInputPlaceHolder() {
		String text = tikTokInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean tikTokInputEnabled() {
		boolean text = tikTokInput.isEnabled();
		return text;
	}
	
	public boolean twitchInLogoDisplay() {
		boolean text = twitchLogo.isDisplayed();
		return text;
	}
	
	public String twitch_Text() {
		String text = twitchText.getText();
		System.out.println(text);
		return text;
	}
	
	public String twitchInputPlaceHolder() {
		String text = twitchInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean twitchInputEnabled() {
		boolean text = twitchInput.isEnabled();
		return text;
	}
	
	public boolean pinterestInLogoDisplay() {
		boolean text = pinterestLogo.isDisplayed();
		return text;
	}
	
	public String pinterest_Text() {
		String text = pinterestText.getText();
		System.out.println(text);
		return text;
	}
	
	public String pinterestInputPlaceHolder() {
		String text = pinterestInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean pinterestInputEnabled() {
		boolean text = pinterestInput.isEnabled();
		return text;
	}
	
	public boolean redditLogoDisplay() {
		boolean text = redditLogo.isDisplayed();
		return text;
	}
	
	public String reddit_Text() {
		String text = redditText.getText();
		System.out.println(text);
		return text;
	}
	
	public String redditInputPlaceHolder() {
		String text = redditInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean redditInputEnabled() {
		boolean text = redditInput.isEnabled();
		return text;
	}
	
	public String addSocialBtn() {
		String text = bottomAddSocialBtn.getText();
		System.out.println(text);
		return text;
	}
	
	public boolean addSocialBottomDisplayed() {
		boolean text = bottomAddSocialBtn.isDisplayed();
		return text;
	}
	
	public boolean customSocialLogoDisplay() {
		boolean text = customSocialLogo.isDisplayed();
		return text;
	}
	
	public String customSocial() {
		String text = customSocialText.getText();
		System.out.println(text);
		return text;
	}
	
	public String customSocialInputPlaceHolder() {
		String text = customSocialInput.getAttribute("placeholder");
		System.out.println(text);
		return text;
	}
	
	public boolean customSocialInputEnabled() {
		boolean text = customSocialInput.isEnabled();
		return text;
	}
	
	public boolean deletePopUpDisplay() {
		boolean text = deleteIcon.isDisplayed();
		return text;
		
	}
	
	public String areYouSureText() throws InterruptedException {
		for(int i = 0; i <= 10;i++) {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			 j.executeScript("window.scrollBy(0,400)");//To scroll down   
			 Thread.sleep(1000);
			}
		waitForElementToBeClickable(deleteIcon);
		click(deleteIcon);
		waitForElementToBeVisible(areYouSureText);
		String text = areYouSureText.getText();
		System.out.println(text);
		click(closeBtn);
		return text;
	}
	
	public String deleteConfirmText() {
		
		waitForElementToBeClickable(deleteIcon);
		click(deleteIcon);
		waitForElementToBeVisible(areYouSureText);
		String text = deleteConfirmationText.getText();
		System.out.println(text);
		click(closeBtn);
		return text;
	}
	
	public String yesDeleteItText() {
		
		waitForElementToBeClickable(deleteIcon);
		click(deleteIcon);
		waitForElementToBeVisible(areYouSureText);
		String text = yesDeleteIt.getText();
		System.out.println(text);
		click(closeBtn);
		return text;
	}
	
	public boolean yesDeleteItEnabled() throws InterruptedException {
		
		waitForElementToBeClickable(deleteIcon);
		click(deleteIcon);
		waitForElementToBeVisible(areYouSureText);
		boolean text = yesDeleteIt.isEnabled();
		click(closeBtn);
		return text;
		
	}
	
	public String closeBtnText(){
		
		//scrollTillend();
		waitForElementToBeClickable(deleteIcon);
		click(deleteIcon);
		waitForElementToBeVisible(areYouSureText);
		String text = closeBtn.getText();
		System.out.println(text);
		click(closeBtn);
		return text;
	}
	
	public boolean closeBtnEnabled() {
		
		//scrollTillend();
		waitForElementToBeClickable(deleteIcon);
		click(deleteIcon);
		waitForElementToBeVisible(areYouSureText);
		boolean text = closeBtn.isEnabled();
		click(closeBtn);
		return text;
	}
	
	public void validCred() {
		inputValue(emailInput, "hexanewuser1@gmail.com");
		inputValue(passwordInput, "Test@123");
		click(loginBtn);
	}
}
