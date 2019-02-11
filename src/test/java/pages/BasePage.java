package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class BasePage {

    protected AppiumDriver driver;
    protected WebDriverWait wait;

    /**
     * Constructor injecting the Driver interface
     */
    public BasePage(WebDriver driver) {
        this.driver = (AppiumDriver) driver;
        wait = new WebDriverWait(driver, 30);
        wait.ignoring(StaleElementReferenceException.class);
    }

}
