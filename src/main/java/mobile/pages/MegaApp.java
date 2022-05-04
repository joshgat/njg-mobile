package mobile.pages;

import io.appium.java_client.android.AndroidDriver;
import mobile.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MegaApp extends BasePage {

    public MegaApp(AndroidDriver driver) {
        super(driver);
    }
    By docsCategory = By.xpath("//android.widget.TextView[@text='Docs']");
    By plusBtn = By.id("mega.privacy.android.app:id/add_fab_button");
    By newTxtFileBtn = By.id("mega.privacy.android.app:id/new_txt_option");
    By txtFileName = By.id("mega.privacy.android.app:id/type_text");

    By createTxtFileBtn = By.xpath("//android.widget.Button[@text='CREATE']");

    public void clickDocsCategory(){
        waitForElementToAppear(docsCategory);
        click(docsCategory);
    }

    public void clickPlusBtn(){
        click(plusBtn);
    }

    public void createNewTxtFile(String fileName){
        click(newTxtFileBtn);
        writeText(txtFileName, fileName);
        click(createTxtFileBtn);
    }
}
