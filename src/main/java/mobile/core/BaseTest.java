package mobile.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;
    //
    @BeforeSuite
    public void setupAppium() throws MalformedURLException {
        //2
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        url = new URL(URL_STRING);
//3
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        //capabilities.setCapability(MobileCapabilityType.APP, "mega.privacy.android.app");
        capabilities.setCapability("appPackage", "mega.privacy.android.app");
        capabilities.setCapability("appActivity", "mega.privacy.android.app.main.ManagerActivity");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //4
        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.resetApp();
    }

    public AndroidDriver<MobileElement> getDriver() {
        return driver;
    }
}
