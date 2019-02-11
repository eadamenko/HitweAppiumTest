package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingPage extends BasePage {
    /**
     * Constructor injecting the Driver interface
     *
     * @param driver
     */
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    By headerLogo = By.xpath("//img[@alt='hitwe.com']");
    By headerSlogan = By.xpath("//strong[@class='slogan white']");
    By h1Title = By.xpath("//h1");
    By interSlideTitle = By.xpath("//div[@class='inter-slide-title']");
    By interSteps = By.xpath("//li[@class]");
    By currentInnerStep = By.xpath("//li[@class='current']");
    By interTitle = By.xpath("//h2[@class='inter-title']");
    By leftPhoto = By.xpath("//div[@class='inter-select-item left']//img");
    By rightPhoto = By.xpath("//div[@class='inter-select-item right']//img");
    By leftButton = By.xpath("//a[@class='land-btn no']");
    By rightButton = By.xpath("//a[@class='land-btn yes']");
    By footer = By.xpath("//footer");
    By footerLinks = By.xpath("//footer//li");
    By interForm = By.xpath("//div[@class='inter-slider']");
    By h3Title = By.xpath("//h3");
    By inputName = By.xpath("//input[@name='name']");
    By inputEmail = By.xpath("//input[@name='email']");
    By selectorGender = By.xpath("//select[@name='gender']");
    By selectorAge = By.xpath("//select[@name='age']");
    By submitButton = By.xpath("//button[@type='submit']");
    By formTextDevider = By.xpath("//p[@class='form-text-divider']");
    By socialButtons = By.xpath("//ul[@class='land-social']/li");



    public boolean isHeaderLogoDispalyed() {
        System.out.println("isHeaderLogoDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(headerLogo)).isDisplayed();
    }

    public boolean isHeaderSloganDispalyed() {
        System.out.println("isHeaderSloganDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(headerSlogan)).isDisplayed();
    }

    public boolean isH1TitleDispalyed() {
        System.out.println("isH1TitleDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(h1Title)).isDisplayed();
    }

    public boolean isInterSlideTitleDispalyed() {
        System.out.println("isInterSlideTitleDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(interSlideTitle)).isDisplayed();
    }

    public boolean isInterStepsPresent() {
        System.out.println("isInterStepsPresent");
        return driver.findElements(interSteps).size() == 4;
    }

    public String getCurrentStepNumber() {
        System.out.println("getCurrentStepNumber");
        return driver.findElement(currentInnerStep).getText();
    }

    public boolean isCurrentStepNumberActive(String stepNumber) {
        System.out.println("isCurrentStepNumberActive");
        return getCurrentStepNumber().equals(stepNumber);
    }

    public boolean isInterTitleDispalyed() {
        System.out.println("isInterTitleDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(interTitle)).isDisplayed();
    }

    public boolean isLeftPhotoDisplayed() {
        System.out.println("isLeftPhotoDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(leftPhoto)).isDisplayed();
    }

    public boolean isRightPhotoDisplayed() {
        System.out.println("isRightPhotoDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(rightPhoto)).isDisplayed();
    }

    public boolean isLeftButtonDisplayed() {
        System.out.println("isLeftButtonDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(leftButton)).isDisplayed();
    }

    public boolean isRightButtonDisplayed() {
        System.out.println("isRightButtonDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(rightButton)).isDisplayed();
    }

    public boolean isFooterDisplayed() {
        System.out.println("isFooterDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(footer)).isDisplayed();
    }

    public boolean isFooterLinksPresent() {
        System.out.println("isFooterLinksDisplayed");
        return driver.findElements(footerLinks).size() == 6;
    }

    public void clickLeftButton() {
        System.out.println("clickLeftButton");
        wait.until(ExpectedConditions.visibilityOfElementLocated(leftButton)).click();
    }

    public boolean isInterFormDisplayed() {
        System.out.println("isInterFormDisplayed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(interForm)).isDisplayed();
    }

    public boolean isH3TitleDispalyed() {
        System.out.println("isH3TitleDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(h3Title)).isDisplayed();
    }

    public boolean isInputNameDispalyed() {
        System.out.println("isInputNameDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(inputName)).isDisplayed();
    }

    public boolean isInputEmailDispalyed() {
        System.out.println("isInputEmailDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail)).isDisplayed();
    }

    public boolean isSelectorGenderDispalyed() {
        System.out.println("isSelectorGenderDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(selectorGender)).isDisplayed();
    }

    public boolean isSelectorAgeDispalyed() {
        System.out.println("isSelectorAgeDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(selectorAge)).isDisplayed();
    }

    public void sendName(String name) {
        System.out.println("sendName" + name);
        driver.findElement(inputName).sendKeys(name);
    }

    public void sendEmail(String email) {
        System.out.println("sendEmail" + email);
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void selectGender(int index) {
        System.out.println("selectGender");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//select[@name='gender']/option[" + index + "]"
        ))).click();
    }

    public void selectAge(int index) {
        System.out.println("selectAge");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//select[@name='age']/option[" + index + "]"
        ))).click();
    }

    public boolean isSubmitButtonDispalyed() {
        System.out.println("isSubmitButtonDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton)).isDisplayed();
    }

    public void clickSubmitButton() {
        System.out.println("clickSubmitButton");
        driver.findElement(submitButton).click();
    }

    public boolean isTextUnderFormDispalyed() {
        System.out.println("isTextUnderFormDispalyed");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(formTextDevider)).isDisplayed();
    }

    public boolean isSocialButtonsPresent() {
        System.out.println("isSocialButtonsPresent");
        return driver.findElements(socialButtons).size() == 6;
    }


}
