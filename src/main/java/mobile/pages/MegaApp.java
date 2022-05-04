package mobile.pages;

import io.appium.java_client.android.AndroidDriver;
import mobile.core.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MegaApp extends BasePage {

    public MegaApp(AndroidDriver driver) {
        super(driver);
    }
    By docsCategory = By.xpath("//android.widget.TextView[@text='Docs']");
    By plusBtn = By.id("mega.privacy.android.app:id/add_fab_button");
    By newTxtFileBtn = By.id("mega.privacy.android.app:id/new_txt_option");
    By txtFileName = By.id("mega.privacy.android.app:id/type_text");
    By createTxtFileBtn = By.xpath("//android.widget.Button[@text='CREATE']");
    By saveTxtFileBtn = By.id("mega.privacy.android.app:id/action_save");
    By rubbishBin = By.id("mega.privacy.android.app:id/rubbish_bin_option");
    By docOptionsMenu = By.id("mega.privacy.android.app:id/node_title_layout");
    By moveBtn = By.xpath("//android.widget.Button[@text='MOVE']");
    By leftBackBtn= By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
    By leftMenuPane= By.id("mega.privacy.android.app:id/left_action");
    By rubbishBinLeftMenu = By.id("mega.privacy.android.app:id/rubbish_bin_section");
    By restoreOptionBtn = By.id("mega.privacy.android.app:id/restore_option");

    public By docOptionsBtn (String fn) {
        return By.xpath("//android.widget.TextView[@text='"+fn+"']/following-sibling::android.widget.ImageView");
    }

    public By rubbishOptionsMenu (String fn) {
        return By.xpath("//android.widget.TextView[@text='"+fn+"']/parent::android.widget.RelativeLayout/following-sibling::android.widget.RelativeLayout//android.widget.ImageView");
    }


    //Verification
    public void verifyIfDocExists(String fn){
        By fileName = By.xpath("//android.widget.TextView[@text='"+ fn +"']");
        Assert.assertEquals(readText(fileName),fn);
    }

    //Actions
    public void clickDocsCategory(){
        waitForElementToAppear(docsCategory);
        click(docsCategory);
    }

    public void clickPlusBtn(){
        click(plusBtn);
    }

    public void createAndVerifyNewTxtFile(String fileName){
        click(newTxtFileBtn);
        writeText(txtFileName, fileName);
        click(createTxtFileBtn);
        click(saveTxtFileBtn);
        verifyIfDocExists(fileName);
    }

    public void deleteTxtFile(String fileName){
        click(docOptionsBtn(fileName));
        waitForElementToAppear(docOptionsMenu);
        verticalSwipeByPercentages(0.9, 0.1, 0.5);
        click(rubbishBin);
        click(moveBtn);
        click(leftBackBtn);
        click(leftMenuPane);
        click(rubbishBinLeftMenu);
        verifyIfDocExists(fileName);
    }

    public void restoreTxtFile(String fileName){
        click(rubbishOptionsMenu(fileName));
        click(restoreOptionBtn);
        click(leftBackBtn);
        clickDocsCategory();
        verifyIfDocExists(fileName);
    }

}
