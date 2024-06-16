package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import managers.WebDriverManager;



public class UITest {
	ConfigFileReader fr = new ConfigFileReader();
	String App_name;
	WebDriver driver;
	WebDriverManager webDriverManager;
	
	
	@Given("^User Navigates to applicationname \"([^\"]*)\" application$")
	public void user_Navigates_to_applicationname_application(String applicationname) throws Throwable {
		App_name=applicationname;
		String app_url=fr.getApplicationUrl(applicationname);
	    System.out.println("Application url is:"+app_url);
		
		  webDriverManager = new WebDriverManager(); 
		  
		  driver =  webDriverManager.getDriver();
		  driver.manage().window().maximize();
		 
		  driver.get(app_url); 
		  
		driver.close();
		 
	    
       

	    
	}

	@When("^User should login with username and password in login page$")
	public void user_should_login_with_username_and_password_in_login_page() throws Throwable {
	    String username=fr.getApplicationUserName(App_name);
	    String password=fr.getApplicationPassword(App_name);
	    System.out.println("User name and password are "+username+" and "+password);
	}

	@Then("^User is navigated to home page$")
	public void user_is_navigated_to_home_page() throws Throwable {
	    System.out.println("You are in home page");
	    
	    
	}


}
