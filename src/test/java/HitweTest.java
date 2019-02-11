import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.MainPage;
import pages.SystemDialogPage;

import java.util.Set;

public class HitweTest extends BaseTest {

    @BeforeMethod
    public void startBrowser() {
        System.out.println("Open test URL");
        driver.get(testProperties.getTestURL());
    }

    @Test()
    public void hitweTest() {
        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        Assert.assertTrue(landingPage.isHeaderLogoDispalyed());
        Assert.assertTrue(landingPage.isHeaderSloganDispalyed());
        Assert.assertTrue(landingPage.isH1TitleDispalyed());
        Assert.assertTrue(landingPage.isInterSlideTitleDispalyed());
        Assert.assertTrue(landingPage.isInterStepsPresent());
        Assert.assertTrue(landingPage.isCurrentStepNumberActive("1"));
        Assert.assertTrue(landingPage.isInterTitleDispalyed());
        Assert.assertTrue(landingPage.isLeftPhotoDisplayed());
        Assert.assertTrue(landingPage.isRightPhotoDisplayed());
        Assert.assertTrue(landingPage.isLeftButtonDisplayed());
        Assert.assertTrue(landingPage.isRightButtonDisplayed());
        Assert.assertTrue(landingPage.isFooterDisplayed());
        Assert.assertTrue(landingPage.isFooterLinksPresent());
        String landingPageUrl_1 = driver.getCurrentUrl();
        landingPage.clickLeftButton();

        String landingPageUrl_2 = driver.getCurrentUrl();
        Assert.assertNotEquals(landingPageUrl_1, landingPageUrl_2);
        Assert.assertTrue(landingPage.isCurrentStepNumberActive("2"));
        landingPage.clickLeftButton();

        String landingPageUrl_3 = driver.getCurrentUrl();
        Assert.assertNotEquals(landingPageUrl_2, landingPageUrl_3);
        Assert.assertTrue(landingPage.isCurrentStepNumberActive("3"));
        landingPage.clickLeftButton();

        String landingPageUrl_4 = driver.getCurrentUrl();
        Assert.assertNotEquals(landingPageUrl_3, landingPageUrl_4);
        Assert.assertTrue(landingPage.isCurrentStepNumberActive("4"));
        landingPage.clickLeftButton();

        String landingPageUrl_5 = driver.getCurrentUrl();
        Assert.assertNotEquals(landingPageUrl_4, landingPageUrl_5);

        Assert.assertTrue(landingPage.isInterFormDisplayed());
        Assert.assertTrue(landingPage.isH3TitleDispalyed());
        Assert.assertTrue(landingPage.isInputNameDispalyed());
        Assert.assertTrue(landingPage.isInputEmailDispalyed());
        Assert.assertTrue(landingPage.isSelectorGenderDispalyed());
        Assert.assertTrue(landingPage.isSelectorAgeDispalyed());
        Assert.assertTrue(landingPage.isSubmitButtonDispalyed());
        Assert.assertTrue(landingPage.isTextUnderFormDispalyed());
        Assert.assertTrue(landingPage.isSocialButtonsPresent());

        String name = "TestUser" + Math.random();
        String email = "testemail" + Math.random() + "@testmail.com";
        landingPage.sendName(name);
        landingPage.sendEmail(email);
        landingPage.selectGender(2);
        landingPage.selectAge(3);
        landingPage.clickSubmitButton();

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        Assert.assertTrue(mainPage.isVerificationConfirmTitleDisplayed());

        Assert.assertTrue(mainPage.isProfileConfirmationPageTitleDispalyed());
        Assert.assertTrue(mainPage.isVerificationConfirmTitleDisplayed());
        Assert.assertTrue(mainPage.isVerificationTitleDisplayed());
        Assert.assertEquals(email, mainPage.getDisplayedEmail());
        Assert.assertTrue(mainPage.isResendEmailButtonDisplayed());
        Assert.assertTrue(mainPage.isHeaderDiscoveryButtonDisplayed());
        Assert.assertTrue(mainPage.isHeaderMessagesButtonDisplayed());
        Assert.assertTrue(mainPage.isHeaderFeedButtonDisplayed());
        Assert.assertTrue(mainPage.isHeaderHotusersButtonDisplayed());
        Assert.assertTrue(mainPage.isHeaderVisitorsButtonDisplayed());
        Assert.assertTrue(mainPage.isHeaderMenuDisplayed());

        for (int i =1; i < 4; i++){
            mainPage.clickMessagesButton();
            mainPage.clickFeedButton();
        }

        Assert.assertTrue(mainPage.isModalContainerDisplayed());
        Assert.assertTrue(mainPage.isModalTitleDisplayed());
        Assert.assertTrue(mainPage.isModalNotificationDisplayed());
        Assert.assertTrue(mainPage.isModalEnableButtonDisplayed());
        Assert.assertTrue(mainPage.isModalSkipButtonDisplayed());
        mainPage.clickModalEnableButton();

        String webContext = driver.getContext();
        Set<String> contexts = driver.getContextHandles();
        for (String context: contexts){
            if (context.contains("NATIVE_APP")){
                driver.context(context);
                break;
            }
        }
        SystemDialogPage systemDialogPage = PageFactory.initElements(driver, SystemDialogPage.class);
        Assert.assertTrue(systemDialogPage.isSystemDialogDispalyed());
        Assert.assertTrue(systemDialogPage.isSystemDialogTitleDispalyed());
        Assert.assertTrue(systemDialogPage.isSystemDialogBlockButtonDispalyed());
        Assert.assertTrue(systemDialogPage.isSystemDialogAllowButtonDispalyed());
        systemDialogPage.clickAllowDialogButton();
    }




}
