package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SystemDialogPage extends BasePage {
    /**
     * Constructor injecting the Driver interface
     *
     * @param driver
     */
    public SystemDialogPage(WebDriver driver) {
        super(driver);
    }

    By systemDialog = By.xpath("(//android.view.ViewGroup)[1]");
    By systemDialogTitle = By.id("com.android.chrome:id/infobar_message");
    By systemDialogBlockButton = By.id("com.android.chrome:id/infobar_close_button");
    By systemDialogAllowButton = By.id("com.android.chrome:id/button_primary");

    public boolean isSystemDialogDispalyed() {
        System.out.println("isSystemDialogDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(systemDialog)).isDisplayed();
    }

    public boolean isSystemDialogTitleDispalyed() {
        System.out.println("isSystemDialogTitleDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(systemDialogTitle)).isDisplayed();
    }

    public boolean isSystemDialogBlockButtonDispalyed() {
        System.out.println("isSystemDialogBlockButtonDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(systemDialogBlockButton)).isDisplayed();
    }

    public boolean isSystemDialogAllowButtonDispalyed() {
        System.out.println("isSystemDialogAllowButtonDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(systemDialogAllowButton)).isDisplayed();
    }

    public void clickAllowDialogButton() {
        System.out.println("clickAllowDialogButton");
        wait.until(ExpectedConditions.visibilityOfElementLocated(systemDialogAllowButton)).click();
    }

}
