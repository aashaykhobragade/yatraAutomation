package runnerclass;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/ABHISHEK/Documents/Java/YatraAutomation/src/main/java/features",
		glue = {"stepdefination"},
		format={"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		tags = {"@Test"},
		strict= true,
		dryRun =false,
		monochrome = true
		)

    public class TestRunner {
    
	 private TestNGCucumberRunner testNGCucumberRunner;
	
	 @BeforeClass(alwaysRun = true)
	    public void setUpClass()  throws Exception {
	    	testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    	 
	    }
	    	
	    @Test(groups ="cucumber" , description = "Runs cucumber feature" , dataProvider= "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature){
	    	testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    	
	    }
	    
	    @DataProvider
	    public Object[][] features() {
	    	return testNGCucumberRunner.provideFeatures();
	    	
	    }
	    
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
	    	testNGCucumberRunner.finish();
		
		
	    }
}
