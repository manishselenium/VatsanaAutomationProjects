package OnefeedTestCases;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
 
/**
 * Created by onurb on 29-Nov-16.
 */
public class UserAgentMobileTesting {
 
    private static WebDriver driver;
    private WebDriverWait wait = new WebDriverWait(driver,10);
 
    @BeforeClass
    public static void setup () throws MalformedURLException {
        //Declare Firefox Driver Location
        String geckoDriverLocation = "geckodriver";
        System.out.println("Gecko Driver: " + geckoDriverLocation );
        System.setProperty("webdriver.gecko.driver", geckoDriverLocation);
 
        //Firefox Profile Settings
        FirefoxOptions profile = new FirefoxOptions();
 
        //******************************************************
        // This is Optional For My Work Laptop Security Settings
        //******************************************************
        //Accept Untrusted Certificates
//        profile.setAcceptUntrustedCertificates(true);
//        profile.setAssumeUntrustedCertificateIssuer(false);
//        //Use No Proxy Settings
//        profile.setPreference("network.proxy.type", 0);
        //******************************************************
        //******************************************************
 
        //Change User Agent to HTC ONE M9
        profile.addPreference("general.useragent.override", "Mozilla/5.0 (Mozilla/5.0 (Linux; Android 7.0; SM-G892A Build/NRD90M; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/67.0.3396.87 Mobile Safari/537.36"); 
        driver = new FirefoxDriver(profile);
    }
 
    @Test
    public void mobileWebTestFirefox () throws InterruptedException {
        //Go To Amazon.com
        driver.navigate().to("https://m.onefeed.ai/");
 
//        //Get search bar and search button
//        WebElement searchBar = driver.findElement(By.id("nav-search-keywords"));
//        WebElement searchButton = driver.findElement(By.xpath("./*//*[fusion_builder_container hundred_percent="yes" overflow="visible"][fusion_builder_row][fusion_builder_column type="1_1" background_position="left top" background_color="" border_size="" border_color="" border_style="solid" spacing="yes" background_image="" background_repeat="no-repeat" padding="" margin_top="0px" margin_bottom="0px" class="" id="" animation_type="" animation_speed="0.3" animation_direction="left" hide_on_mobile="no" center_content="no" min_height="none"][@id='nav-search-form']/div[1]/div/input"));
//        
//        //Write Sony Headphones to the search bar and click search button
//        searchBar.sendKeys("Sony Headphones");
//        searchButton.click();
//        
//        //Wait until first element image is visible
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='resultItems']/li[1]/a/div/div[1]/div/img")));
//        
//        //Get first element's text and write it to the console
//        String firstSearchElementText = driver.findElement(By.xpath(".//*[@id='resultItems']/li[1]/a/div/div[2]/h5")).getText();
//        System.out.println("First Search Element Name: " + firstSearchElementText);
    }
 
    @AfterClass
    public static void quitDriver() {
        //driver.quit();
    }
}
