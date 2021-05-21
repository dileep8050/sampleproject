package stepdefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
	
public class LoginPageSteps {
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	private static String title;

	@Given("user launched the {string}")
	public void user_launched_the(String string) {
		DriverFactory.getDriver().get("https://www.google.com/");
	}

	@Given("User gets the title fo the page")
	public void user_gets_the_title_fo_the_page() {
		title=loginPage.getLoginPageTitle();
		System.out.println("Page title is : "+title);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("check the search box")
	public void check_the_search_box() {
		Assert.assertTrue(false);
	}

	
	@Given("User launched the url {string}")
	public void user_launched_the_url(String url) {
		DriverFactory.getDriver().get(url);
	}
}
