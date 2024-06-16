package runner;

 

import java.io.*;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import dataProviders.ConfigFileReader;
 
 
@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\test\\resources\\Feature",
glue = "stepDefinitions",
plugin = {"html:report/cucumber-reports", "com.cucumber.listener.ExtentCucumberFormatter:report/cucumber-reports/extent-report/report.html"},
tags = {"@UItest"},

monochrome = true)


public class Runner {	
	
	

@AfterClass
public static void writeExtentReport() {
	
	ConfigFileReader reader=new ConfigFileReader();
	Reporter.loadXMLConfig(new File (reader.getReportpath()));
	Reporter.setSystemInfo("User Name.", System.getProperty("user.name"));
	Reporter.setSystemInfo("Time Zone:", System.getProperty("user.timezone"));
	Reporter.setSystemInfo("64 bit", "Windows 10");


}
}