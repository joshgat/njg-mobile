package mobiletests;

import mobile.core.BaseTest;
import mobile.pages.MegaApp;

import org.testng.annotations.Test;

public class MegaAppTests extends BaseTest {
    @Test
    public void createMegaTxtFile() {
        MegaApp megaApp = new MegaApp(getDriver());
        megaApp.clickDocsCategory();
        megaApp.clickPlusBtn();
        megaApp.createAndVerifyNewTxtFile("a.txt");
    }

    @Test
    public void deleteMegaTxtFile() {
        MegaApp megaApp = new MegaApp(getDriver());
        megaApp.deleteTxtFile("a.txt");
    }

    @Test
    public void restoreMegaTxtFile() {
        MegaApp megaApp = new MegaApp(getDriver());
        megaApp.restoreTxtFile("a.txt");
    }
}
