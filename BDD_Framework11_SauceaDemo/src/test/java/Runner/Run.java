package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
glue= {"StepDefinition"},
plugin= {"pretty","json:target/BDD_Framework11_SauceDemo.json","html:target/BDD_Framework11_SauceDemo.html",
		}

)


public class Run 
{

}
