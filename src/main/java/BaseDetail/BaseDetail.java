package BaseDetail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseDetail {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
    public BaseDetail(){
    	
		try {
			prop = new Properties();
            FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\ResourcesFile\\PropFile.properties");
            prop.load(file);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
    
 	public static void launchApp(){  
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("IE")) {
            driver = new InternetExplorerDriver();
        }
        driver.manage().deleteAllCookies();
        driver.navigate().to(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
     }
	
	public static void inputValue(WebElement ele,String value) {
		ele.sendKeys(value);
		
	}
	
//	public void assertEqualsHard(String actual, String expected, String message) {         
//		Assert.assertEquals(actual, expected, message);    
//	}
	public static String currentUrl() {
		return driver.getCurrentUrl();
	}
	
	public static String getTitle2() {
		return driver.getTitle();
	}
	public static void click(WebElement ele) {
		ele.click();
	}
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public static void radioButton(By by) {
		driver.findElement(by).click();
	}
	
	public static void clear(WebElement ele) {
		ele.clear();
	}
	
	public static void dropDown(By by, String text) {
		Select s = new Select(driver.findElement(by));
		s.selectByVisibleText(text);
	}
	
	public static WebDriverWait explicitWait(Duration time){
		WebDriverWait wait = new WebDriverWait(driver,time);
		return wait;
	}
	
	public static void waitForElementToBeClickable(WebElement locator1) {
		wait.until(ExpectedConditions.elementToBeClickable(locator1));
	}
 
	public static void waitForElementToBeVisible(WebElement locator2) {
//		wait.until(ExpectedConditions.invisibilityOf(element));
		wait.until(ExpectedConditions.visibilityOfAllElements(locator2));
	}
	
	public static void waitForElementToBeInVisible(WebElement locator3) {
		wait.until(ExpectedConditions.invisibilityOf(locator3));
		
	}
	
	public static void javaScriptExecutorScrollIntoView(WebElement scroll){
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true)",scroll);
	}
	
	public static JavascriptExecutor scrollTillend(){
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		return je;
	}

	
	 public String getScreenshot(String testName,WebDriver driver) throws IOException {
		 String destination = System.getProperty("user.dir") + "/reports/screenshots/" + testName + ".png";
	   
	    	try {
		    	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	File destFile = new File(destination);
		    	FileUtils.copyFile(source, destFile);
	    	}
	    	catch (IOException e) {
	            e.printStackTrace();
	        }
			return destination;
	    }

}

