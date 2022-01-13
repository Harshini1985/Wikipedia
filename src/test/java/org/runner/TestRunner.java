package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Regression\\Wiki.feature",glue="org.stepdef",monochrome=true,dryRun=false,strict=true,plugin= {"pretty","junit:target/Reports/data.xml","json:target/Reports/data.json"}, snippets=SnippetType.CAMELCASE)
public class TestRunner {
	@AfterClass
	public static void afterClass() {
		JVMReport.genrateJVMReport(System.getProperty("user.dir")+"\\target\\Reports\\data.json");
	}
	}

