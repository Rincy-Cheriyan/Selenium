package com.cg.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue="com.cg.stepdef",plugin="com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html")
public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config//extent-config.xml"));
	}

}
