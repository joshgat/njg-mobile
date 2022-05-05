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
    By docsScreen = By.xpath("android.widget.TextView[@text='DOCUMENTS");
    By plusBtn = By.id("mega.privacy.android.app:id/add_fab_button");
    By newTxtFileBtn = By.id("mega.privacy.android.app:id/new_txt_option");
    By txtFileName = By.id("mega.privacy.android.app:id/type_text");
    By createTxtFileBtn = By.xpath("//android.widget.Button[@text='CREATE']");
    By saveTxtFileBtn = By.id("mega.privacy.android.app:id/action_save");
    By rubbishBinDocOptions = By.id("mega.privacy.android.app:id/rubbish_bin_option");
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
    public void verifyUserIsInHomeScreen(){
        waitForElementToAppear(docsCategory);
    }
    public void clickDocsCategory(){
        waitForElementToAppear(docsCategory);
        click(docsCategory);
    }
    public void verifyUserIsInDocsScreen(){
        waitForElementToAppear(docsScreen);
    }

    public void clickPlusBtn(){
        click(plusBtn);
    }

    public void createTxtFile(String fileName){
        click(newTxtFileBtn);
        writeText(txtFileName, fileName);
        click(createTxtFileBtn);
        click(saveTxtFileBtn);
    }
    public void verifyFileCreated(String fileName){
        verifyIfDocExists(fileName);
    }

    public void clickDocOptions(String fileName){
        click(docOptionsBtn(fileName));
        waitForElementToAppear(docOptionsMenu);
    }

    public void swipeUp(){
        verticalSwipeByPercentages(0.9, 0.1, 0.5);
    }

    public void clickRubbishBinFromDocOptions(){
        click(rubbishBinDocOptions);
    }

    public void clickMove(){
        click(moveBtn);
    }

    public void navigateBack(){
        click(leftBackBtn);
    }

    public void clickLeftMenuPane(){
        click(leftMenuPane);
    }

    public void clickRubbishBinFromLeftMenu(){
        click(rubbishBinLeftMenu);
    }

    public void verifyDocExistsInRubbishBin(String fileName){
        verifyIfDocExists(fileName);
    }

    public void clickRubbishBinOptions(String fileName){
        click(rubbishOptionsMenu(fileName));
    }

    public void clickRestore(){
        click(restoreOptionBtn);
    }
}
