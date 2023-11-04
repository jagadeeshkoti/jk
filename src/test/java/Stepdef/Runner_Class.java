package Stepdef;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions
       (features = "src/test/java/Login.feature"
         ,snippets = SnippetType.CAMELCASE
         ,glue = "Stepdef")
public class Runner_Class extends AbstractTestNGCucumberTests {

}
