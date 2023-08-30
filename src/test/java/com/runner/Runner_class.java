package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(features ="C:\\Users\\Admin\\eclipse-workspace\\Lime_Road\\src\\test\\java\\com\\feature\\lime.feature", 
                 glue ="com.step", monochrome= true, plugin = {"pretty", "json:Report/Cucumber.json", 
                		 "html:Report/Cucumber_report.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner_class extends Base_class{
	@BeforeClass
	public static void launchbrowser() {
		browserLaunch("chrome");

	}
	
	

}
