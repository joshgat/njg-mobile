package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobile.core.BaseTest;
import mobile.pages.MegaApp;

import java.net.MalformedURLException;

public class MegaTxtSteps extends BaseTest {
    MegaApp megaApp = new MegaApp(getDriver());
    @Given("User is on Home Screen")
    public void userOnHomeScreen() throws MalformedURLException {
        megaApp.verifyUserIsInHomeScreen();
    }
    @Given("User clicks Docs")
    public void userClicksDocs(){
        megaApp.clickDocsCategory();
    }
    @Given("User clicks Plus")
    public void userClicksPlus(){
        megaApp.clickPlusBtn();
    }
    @When("User creates a {string} file")
    public void userCreatesAFile(String arg0) {
        megaApp.createTxtFile(arg0);
    }
    @Then("{string} file is created in Docs")
    public void fileIsCreatedInDocs(String arg0) {
        megaApp.verifyFileCreated(arg0);
    }
}
