package LinkHive.LinkHive;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseDetail.BaseDetail;
import POM.ProfileInfoPage;
import POM.SignUpPage;
import POM.SocialMediaIconsPage;
import junit.framework.Assert;

public class SocialMediaIconsTest extends BaseDetail{
	String act;
	String exp;
	SocialMediaIconsPage social;
	
	/*public SocialMediaIconsTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		launchApp();
		social = new SocialMediaIconsPage();
		social.validCred();
	}*/
	
	@Test(priority = 1)
	public void clickSocialMediaTab_AndAddOtherSocialBtnDisplayedOrNot() {
		
		social = new SocialMediaIconsPage();
		Assert.assertTrue(social.socialMedia_Tab());
	}
	
	@Test(priority = 2)
	public void verify_getAddOthersSocialSpelling() {
		act = social.getAddSocialTab();
		exp = "Add Other Socials".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 3)
	public void verify_AddOtherSocialBtnIsEnableOrNot() {
		Assert.assertTrue(social.getAddSocialEnabled());
	}
	
	@Test(priority = 4)
	public void verify_makeItEasySpelling() {
		act = social.makeItEasy_Text();
		exp = "Make it easy to follow you";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 5)
	public void verify_dragToReOrderSpelling() {
		act = social.dragToReOrder_Text();
		exp = "Drag to reorder, toggle on/off each social. Icons only in preview.".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 6)
	public void verify_customizeYourSocialSpelling() {
		act = social.customizeYourSocial_Text();
		exp = "Customize Your Social Media Icon Placement";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 7)
	public void verify_featureIconsSpelling() {
		act = social.featureIcon_Text();
		exp = "Feature icons at the top or bottom of your profile";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 8)
	public void verify_topLabelSpelling() {
		act = social.labelTopSpelling_Text();
		exp = "Top".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 9)
	public void verify_bottomLabelSpelling() {
		act = social.labelBottomSpelling_Text();
		exp = "Bottom".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 10)
	public void verify_faceBookLogoDisplayOrNot() {
		Assert.assertTrue(social.faceBookLogoDisplay());
	}
	
	@Test(priority = 11)
	public void verify_faceBookSpelling() {
		act = social.faceBookSpelling_Text();
		exp = " Facebook".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 12)
	public void verify_faceBookPlaceHolder() {
		act = social.faceBookInputPlaceHolder();
		exp = "https://facebook.com/facebookpageurl";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 13)
	public void verify_faceBookInputEnabledOrNot() {
		Assert.assertTrue(social.faceBookInputEnabled());
	}
	
	@Test(priority = 14)
	public void verify_instagramLogoDisplayOrNot() {
		Assert.assertTrue(social.instagramLogoDisplay());
	}
	
	@Test(priority = 15)
	public void verify_instagramSpelling() {
		act = social.instagramSpelling_Text();
		exp = " Instagram".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 16)
	public void verify_instagramPlaceHolder() {
		act = social.instagramInputPlaceHolder();
		exp = "@instagramusername";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 17)
	public void verify_instagramInputEnabledOrNot() {
		Assert.assertTrue(social.instagramInputEnabled());
	}
	
	@Test(priority = 18)
	public void verify_twitterLogoDisplayOrNot() {
		Assert.assertTrue(social.twitterLogoDisplay());
	}
	
	@Test(priority = 19)
	public void verify_twitterSpelling() {
		act = social.twitterSpelling_Text();
		exp = " X".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 20)
	public void verify_twitterPlaceHolder() {
		act = social.twitterInputPlaceHolder();
		exp = "@yourxhandle";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 21)
	public void verify_twitterInputEnabledOrNot() {
		Assert.assertTrue(social.twitterInputEnabled());
	}
	
	@Test(priority = 22)
	public void verify_linkedInLogoDisplayOrNot() {
		Assert.assertTrue(social.linkedInLogoDisplay());
	}
	
	@Test(priority = 23)
	public void verify_linkedInSpelling() {
		act = social.linkedInSpelling_Text();
		exp = " LinkedIn".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 24)
	public void verify_linkedInPlaceHolder() {
		act = social.linkedInInputPlaceHolder();
		exp = "https://linkedin.com/in/username";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 25)
	public void verify_linkedInInputEnabledOrNot() {
		Assert.assertTrue(social.linkedInInputEnabled());
	}
	
	@Test(priority = 26)
	public void verify_youtubeLogoDisplayOrNot() {
		Assert.assertTrue(social.youtubeInLogoDisplay());
	}
	
	@Test(priority = 27)
	public void verify_youtubeSpelling() {
		act = social.youtubeSpelling_Text();
		exp = " YouTube".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 28)
	public void verify_youtubePlaceHolder() {
		act = social.youtubeInputPlaceHolder();
		exp = "https://youtube.com/channel/youtubeurl";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 29)
	public void verify_youtubeInputEnabledOrNot() {
		Assert.assertTrue(social.youtubeInputEnabled());
	}
	
	@Test(priority = 30)
	public void verify_whatsAppLogoDisplayOrNot() {
		Assert.assertTrue(social.whatsAppInLogoDisplay());
	}
	
	@Test(priority = 31)
	public void verify_whatsAppSpelling() {
		act = social.whatsAppSpelling_Text();
		exp = " WhatsApp".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 32)
	public void verify_whatsAppPlaceHolder() {
		act = social.whatsAppInputPlaceHolder();
		exp = "+0000000000";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 33)
	public void verify_whatsAppInputEnabledOrNot() {
		Assert.assertTrue(social.whatsAppInputEnabled());
	}
	
	@Test(priority = 34)
	public void verify_snapchatLogoDisplayOrNot() {
		Assert.assertTrue(social.snapchatInLogoDisplay());
	}
	
	@Test(priority = 35)
	public void verify_snapchatSpelling() {
		act = social.snapchatSpelling_Text();
		exp = " Snapchat".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 36)
	public void verify_snapchatPlaceHolder() {
		act = social.snapchatInputPlaceHolder();
		exp = "https://www.snapchat.com/add/username";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 37)
	public void verify_snapchatInputEnabledOrNot() {
		Assert.assertTrue(social.snapchatInputEnabled());
	}
	
	@Test(priority = 38)
	public void verify_discordLogoDisplayOrNot() {
		Assert.assertTrue(social.discordInLogoDisplay());
	}
	
	@Test(priority = 39)
	public void verify_discordSpelling() {
		act = social.discordSpelling_Text();
		exp = " Discord".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 40)
	public void verify_discordPlaceHolder() {
		act = social.discordInputPlaceHolder();
		exp = "https://discord.com/invite/yourchannel";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 41)
	public void verify_discordInputEnabledOrNot() {
		Assert.assertTrue(social.discordInputEnabled());
	}

	@Test(priority = 42)
	public void verify_threadsLogoDisplayOrNot() {
		Assert.assertTrue(social.threadsInLogoDisplay());
	}
	
	@Test(priority = 43)
	public void verify_threadsSpelling() {
		act = social.threadsSpelling_Text();
		exp = " Threads".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 44)
	public void verify_threadsPlaceHolder() {
		act = social.threadsInputPlaceHolder();
		exp = "@threadsusername";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 45)
	public void verify_threadsInputEnabledOrNot() {
		Assert.assertTrue(social.threadsInputEnabled());
	}
	
	@Test(priority = 46)
	public void verify_dribbleLogoDisplayOrNot() {
		Assert.assertTrue(social.dribbbleInLogoDisplay());
	}
	
	@Test(priority = 47)
	public void verify_dribbleSpelling() {
		act = social.dribbble_Text();
		exp = " Dribbble".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 48)
	public void verify_dribblePlaceHolder() {
		act = social.dribbbleInputPlaceHolder();
		exp = "https://dribbble.com/add/username";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 49)
	public void verify_dribbleInputEnabledOrNot() {
		Assert.assertTrue(social.dribbbleInputEnabled());
	}
	
	@Test(priority = 50)
	public void verify_tikTokLogoDisplayOrNot() {
		Assert.assertTrue(social.tikTokInLogoDisplay());
	}
	
	@Test(priority = 51)
	public void verify_tikTokSpelling() {
		act = social.tikTok_Text();
		exp = " TikTok".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 52)
	public void verify_tikTokPlaceHolder() {
		act = social.tikTokInputPlaceHolder();
		exp = "@tiktokusername";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 53)
	public void verify_tikTokInputEnabledOrNot() {
		Assert.assertTrue(social.tikTokInputEnabled());
	}
	
	@Test(priority = 54)
	public void verify_twitchLogoDisplayOrNot() {
		Assert.assertTrue(social.twitchInLogoDisplay());
	}
	
	@Test(priority = 55)
	public void verify_twitchSpelling() {
		act = social.twitch_Text();
		exp = " Twitch".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 56)
	public void verify_twitchPlaceHolder() {
		act = social.twitchInputPlaceHolder();
		exp = "https://twitch.tv/";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 57)
	public void verify_twitchInputEnabledOrNot() {
		Assert.assertTrue(social.twitchInputEnabled());
	}
	
	@Test(priority = 58)
	public void verify_pinterestLogoDisplayOrNot() {
		Assert.assertTrue(social.pinterestInLogoDisplay());
	}
	
	@Test(priority = 59)
	public void verify_pinterestSpelling() {
		act = social.pinterest_Text();
		exp = " Pinterest".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 60)
	public void verify_pinterestPlaceHolder() {
		act = social.pinterestInputPlaceHolder();
		exp = "https://pinterest.com/";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 61)
	public void verify_pinterestInputEnabledOrNot() {
		Assert.assertTrue(social.pinterestInputEnabled());
	}
	
	@Test(priority = 62)
	public void verify_redditLogoDisplayOrNot() {
		Assert.assertTrue(social.redditLogoDisplay());
	}
	
	@Test(priority = 63)
	public void verify_redditSpelling() {
		act = social.reddit_Text();
		exp = " Reddit".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 64)
	public void verify_redditPlaceHolder() {
		act = social.redditInputPlaceHolder();
		exp = "https://www.reddit.com/yourid";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 65)
	public void verify_redditInputEnabledOrNot() {
		Assert.assertTrue(social.redditInputEnabled());
	}

	@Test(priority = 66)
	public void verify_addSocialBtnSpelling() {
		act = social.addSocialBtn();
		exp = "Add Other Socials".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 67)
	public void verify_addSocialBtnDisplay() {
		Assert.assertTrue(social.addSocialBottomDisplayed());
	}
	
	@Test(priority = 68)
	public void verify_customSocialLogoDisplayOrNot() {
		Assert.assertTrue(social.customSocialLogoDisplay());
	}
	
	@Test(priority = 69)
	public void verify_customSocialSpelling() {
		act = social.customSocial();
		exp = " Custom Social".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 69)
	public void verify_customSocialPlaceHolder() {
		act = social.customSocialInputPlaceHolder();
		exp = "https://";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 70)
	public void verify_customSocialInputEnabledOrNot() {
		Assert.assertTrue(social.customSocialInputEnabled());
	}
	
	@Test(priority = 71)
	public void verify_deletePopUpDisplay() {
		
		Assert.assertTrue(social.deletePopUpDisplay());
	}
	
	@Test(priority = 72)
	public void verify_deleteAreYouSureSpelling() throws InterruptedException {
		act = social.areYouSureText();
		exp = "Are you sure?".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 73)
	public void verify_deleteConfirmSpelling() {
		act = social.deleteConfirmText();
		exp = "Are you sure you want to delete this social link?".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 74)
	public void verify_yesDeleteItSpelling() {
		act = social.yesDeleteItText();
		exp = "Yes, Delete It!".trim();
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 75)
	public void verify_YesDeleteItbuttonEnable() throws InterruptedException {
		//scrollTillend();
		Assert.assertTrue(social.yesDeleteItEnabled());
	}
	
	@Test(priority = 76)
	public void verify_closeBtnSpelling() {
		//scrollTillend();
		act = social.closeBtnText();
		exp = "Close";
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 77)
	public void verify_closeBtnEnable() {
		//scrollTillend();
		Assert.assertTrue(social.closeBtnEnabled());
	}
	
}
