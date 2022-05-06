package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/MegaTxt.feature"
        ,glue = {"steps"}
        ,plugin={"pretty","html:target/cucumber-html-report.html"})
public class MegaAppCucumberTests extends AbstractTestNGCucumberTests {

}
