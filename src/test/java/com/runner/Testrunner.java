package com.runner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features= {"src\\test\\resources"},glue= {"com.stepdefiniton"},monochrome=true,dryRun=false,plugin= {"pretty"})
public class Testrunner extends AbstractTestNGCucumberTests{

}
