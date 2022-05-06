package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobile.core.BaseTest;
import mobile.pages.MegaApp;

import java.net.MalformedURLException;

public class MegaTxtSteps {
    MegaApp megaApp;
    BaseTest baseTest;

    @Before
    public void setUp() throws MalformedURLException {
        baseTest = new BaseTest();
        baseTest.setUpAndroidAppium();
        megaApp = new MegaApp(baseTest.getDriver());
    }

    @Given("User is on Home Screen")
    public void userOnHomeScreen() {
        megaApp.verifyUserIsInHomeScreen();
    }

    @And("User clicks Docs")
    public void userClicksDocs(){
        megaApp.clickDocsCategory();
    }

    @And("User clicks Add Button")
    public void userClicksPlus(){
        megaApp.clickPlusBtn();
    }

    @And("User creates a {string} file")
    public void userCreatesAFile(String fileName) {
        megaApp.createTxtFile(fileName);
    }

    @And("{string} file exists in Docs")
    public void fileExistsInDocs(String fileName) {
        megaApp.verifyFileCreated(fileName);
    }

    @Given("User is on Docs Screen")
    public void userOnDocsScreen() {
        megaApp.verifyUserIsInDocsScreen();
    }

    @When("User clicks Docs three dot option for {string}")
    public void userClicksDocsThreeDots(String fileName) {
        megaApp.clickDocOptions(fileName);
    }

    @And("User swipes up")
    public void userSwipesUp() {
        megaApp.swipeUp();
    }

    @And("User clicks Rubbish Bin from Options")
    public void userClicksRubbishBinFromOptions() {
        megaApp.clickRubbishBinFromDocOptions();
    }

    @And("User clicks Move")
    public void userClicksMove() {
        megaApp.clickMove();
    }

    @And("User navigates Back")
    public void userNavigatesBack() {
        megaApp.navigateBack();
    }

    @And("User clicks Left Menu button")
    public void userClicksLeftMenuButton() {
        megaApp.clickLeftMenuPane();
    }

    @And("User clicks Rubbish Bin from Left Menu")
    public void userClicksRubbishBinFromLeftMenu() {
        megaApp.clickRubbishBinFromLeftMenu();
    }

    @Then("{string} file exists in Rubbish Bin")
    public void fileExistsInRubbishBin(String fileName) {
        megaApp.verifyDocExistsInRubbishBin(fileName);
    }

    @And("User clicks Rubbish Bin three dot option for {string}")
    public void userClicksRubbishBinThreeDotOptionFor(String fileName) {
        megaApp.clickRubbishBinOptions(fileName);
    }

    @And("User clicks Restore")
    public void userClicksRestore() {
        megaApp.clickRestore();
    }
}
