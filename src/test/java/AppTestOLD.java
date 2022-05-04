import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTestOLD {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;
    //public WebDriverWait wait;

    @BeforeSuite
    public void setupAppium() throws MalformedURLException {

        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        url = new URL(URL_STRING);

        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        //capabilities.setCapability(MobileCapabilityType.APP, "mega.privacy.android.app");
        capabilities.setCapability("appPackage", "mega.privacy.android.app");
        capabilities.setCapability("appActivity", "mega.privacy.android.app.main.ManagerActivity");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //4
        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //driver.resetApp();
        //wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    //5
//    @AfterSuite
//    public void uninstallApp() throws InterruptedException {
//        driver.removeApp("com.example.android.contactmanager");
//    }
    //6
//    @Test (enabled=true)
//    public void myFirstTest() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//android.widget.TextView[@text='Docs']")).click();
//        driver.findElement(By.id("mega.privacy.android.app:id/add_fab_button")).click();
//    }
}