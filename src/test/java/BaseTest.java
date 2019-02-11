import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import util.TestProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest {

    public AppiumDriver driver;
    public final TestProperties testProperties = new TestProperties();

    @BeforeClass
    public void createDriver() throws Exception {
        System.out.println("Create new driver:");
        initProperties();
        System.out.println("Android " + testProperties.getPlatformVersion());
        System.out.println(testProperties.getDeviceName());
        driver = getAndroidAppDriver(testProperties.getPlatformVersion(), testProperties.getDeviceName());
    }

    private AppiumDriver getAndroidAppDriver(String platformVersion, String deviceName) throws MalformedURLException {

        URL serverUrl = new URL(testProperties.getHost());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        return new AndroidDriver(serverUrl, capabilities);
    }

    private void initProperties() {
        System.out.println("initProperties");
        String PROPERTY_FILE = "src/test/resources/test.properties";
        Properties properties = new Properties();
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(PROPERTY_FILE);
            properties.load(fileInputStream);
        } catch (IOException e) {
            System.err.println("Properties file not found.");
        }
        testProperties.setHost(properties.getProperty("host"));
        testProperties.setPlatformVersion(properties.getProperty("platformVersion"));
        testProperties.setDeviceName(properties.getProperty("deviceName"));
        testProperties.setTestURL(properties.getProperty("testURL"));
    }

    @AfterMethod
    public void resetApp() throws InterruptedException {
        driver.resetApp();
        System.out.println("reset app");
    }

    @AfterClass
    public void quitAppium() {
        driver.quit();
        System.out.println("quit");
    }

    public void waitForApp() throws InterruptedException {
        driver.wait(5);
    }
}
