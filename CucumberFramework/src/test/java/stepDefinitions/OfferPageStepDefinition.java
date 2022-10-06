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
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	

	@Then("user search for the {string} shortname in offers page to check if the product exist")
	public void user_search_for_the_same_shortname_in_offers_page_to_check_if_the_product_exist(String shortName) {
		switchToOffersPage();
		OfferPage offerPage = new OfferPage(testContextSetup.driver);
		offerPage.searchItem(shortName);
	    offerPageProductName = offerPage.getProductName();
		System.out.println(offerPageProductName +" is extracted from offer page");
	
	}
	
	public void switchToOffersPage()
	{
		LandingPage landingpage = testContextSetup.pageObjectManager.getLandingPage();
		landingpage.selectTopDealsPage();
		testContextSetup.genericUtils.SwitchWindowToChild();
	}
	
	@And("Validate product name in offers page matches with Landing Page")
	public void Validate_product_name_in_offers_page_matches_with_Landing_Page() 
	{
		Assert.assertEquals(testContextSetup.landingPageproductName, testContextSetup.landingPageproductName);
	}
}
