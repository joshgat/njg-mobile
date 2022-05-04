package mobiletests;

import mobile.core.BaseTest;
import mobile.pages.MegaApp;

import org.testng.annotations.Test;

public class MegaAppTests extends BaseTest {
    @Test(enabled=true)
    public void myFirstTest() {
        MegaApp megaApp = new MegaApp(getDriver());
        megaApp.clickDocsCategory();
        megaApp.clickPlusBtn();
        megaApp.createNewTxtFile("test");
    }
}
