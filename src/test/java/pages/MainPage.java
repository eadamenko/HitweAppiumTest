package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    /**
     * Constructor injecting the Driver interface
     *
     * @param driver
     */
    public MainPage(WebDriver driver) {
        super(driver);
    }

    By verificationConfirmTitle = By.xpath("//h1[@class='verification__title']");
    By displayedEmail = By.xpath("//h2/b");
    By verificationTitle = By.xpath("//h2[@class='verification__title-green']");
    By resendEmailButton = By.xpath("//div[@class='send-buttons-wrap']");
    By profileConfirmationPageTitle = By.xpath("//a[@class='title ']");
    By headerDiscoveryButton = By.xpath("//a[@qa-header-discovery]");
    By headerMessagesButton = By.xpath("//a[@qa-header-messages]");
    By headerFeedButton = By.xpath("//a[@qa-header-feed]");
    By headerHotusersButton = By.xpath("//a[@qa-header-hotusers]");
    By headerVisitorsButton = By.xpath("//a[@qa-header-visitors]");
    By headerMenuButton = By.xpath("//a[@qa-header-menu]");

    By modalContainer = By.xpath("//div[@id='modal-container']");
    By modalTitle = By.xpath("//div[@class='desktop-notifications-title']");
    By modalNotification = By.xpath("//div[@class='desktop-notifications-modal']");
    By modalEnableButton = By.xpath("//a[@class='enable-push-notifications btn blue']");
    By modalSkipButton = By.xpath("//a[@class='skip-push-notifications']");


    public void clickModalEnableButton() {
        System.out.println("clickModalEnableButton");
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalEnableButton)).click();
    }

    public boolean isModalSkipButtonDisplayed() {
        System.out.println("isModalSkipButtonDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(modalSkipButton)).isDisplayed();
    }

    public boolean isModalEnableButtonDisplayed() {
        System.out.println("isModalEnableButtonDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(modalEnableButton)).isDisplayed();
    }

    public boolean isModalNotificationDisplayed() {
        System.out.println("isModalNotificationDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(modalNotification)).isDisplayed();
    }

    public boolean isModalTitleDisplayed() {
        System.out.println("isModalTitleDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(modalTitle)).isDisplayed();
    }

    public boolean isModalContainerDisplayed() {
        System.out.println("isModalContainerDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(modalContainer)).isDisplayed();
    }

    public void clickMessagesButton() {
        System.out.println("clickMessagesButton");
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerMessagesButton)).click();
    }

    public void clickFeedButton() {
        System.out.println("clickFeedButton");
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerFeedButton)).click();
    }

    public boolean isVerificationConfirmTitleDisplayed() {
        System.out.println("isVerificationConfirmTitleDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(verificationConfirmTitle)).isDisplayed();
    }

    public boolean isHeaderMenuDisplayed() {
        System.out.println("isHeaderMenuDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(headerMenuButton)).isDisplayed();
    }

    public boolean isHeaderVisitorsButtonDisplayed() {
        System.out.println("isHeaderVisitorsButtonDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(headerVisitorsButton)).isDisplayed();
    }

    public boolean isHeaderHotusersButtonDisplayed() {
        System.out.println("isHeaderHotusersButtonDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(headerHotusersButton)).isDisplayed();
    }

    public boolean isHeaderFeedButtonDisplayed() {
        System.out.println("isHeaderFeedButtonDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(headerFeedButton)).isDisplayed();
    }

    public boolean isHeaderMessagesButtonDisplayed() {
        System.out.println("isHeaderMessagesButtonDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(headerMessagesButton)).isDisplayed();
    }

    public boolean isHeaderDiscoveryButtonDisplayed() {
        System.out.println("isHeaderMenuDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(headerDiscoveryButton)).isDisplayed();
    }

    public String getDisplayedEmail() {
        System.out.println("getDisplayedEmail");
        return driver.findElement(displayedEmail).getText();
    }

    public boolean isVerificationTitleDisplayed() {
        System.out.println("isVerificationTitleDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(verificationTitle)).isDisplayed();
    }

    public boolean isResendEmailButtonDisplayed() {
        System.out.println("isResendEmailButtonDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resendEmailButton)).isDisplayed();
    }

    public boolean isProfileConfirmationPageTitleDispalyed() {
        System.out.println("isProfileConfirmationPageTitleDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(profileConfirmationPageTitle)).isDisplayed();
    }

}
