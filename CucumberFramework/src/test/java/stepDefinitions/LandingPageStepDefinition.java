package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@Given("User is on a GreenCart Landing page")
	public void user_is_on_a_green_cart_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver");
		//testContextSetup.driver = new ChromeDriver();
		//testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		testContextSetup.testBase.WebDriverManager();
	}
	@When("user searched with short name {string} and extracted actual name of product")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//LandingPage landingPage = new LandingPage(testContextSetup.driver);
		LandingPage landingpage = testContextSetup.pageObjectManager.getLandingPage();
		Thread.sleep(2000);
		landingpage.searchItem(shortName);
		Thread.sleep(2000);
		testContextSetup.landingPageproductName = landingpage.getProductName().split("-")[0].trim();
		System.out.println(testContextSetup.landingPageproductName +" is extracted from home page");
		
	}

}
