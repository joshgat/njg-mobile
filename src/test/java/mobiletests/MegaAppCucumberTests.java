package mobiletests;

import io.cucumber.testng.CucumberOptions;
import mobile.core.BaseTest;

@CucumberOptions(tags = "", features = "src/test/resources/features/MegaTxt.feature"
        ,glue = {"steps"}
        ,plugin={"pretty","html:target/cucumber-html-report.html"})
public class MegaAppCucumberTests extends BaseTest {
}
