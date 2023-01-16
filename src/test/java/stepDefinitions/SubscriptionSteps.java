package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.stctv.pages.SubscriptionPage;

import org.testng.Assert;

public class SubscriptionSteps {

  SubscriptionPage subscriptionPage = new SubscriptionPage();

  @When("Select the country {string}")
  public void chooseTheCountry(String countryName) {
    subscriptionPage.chooseCountry(countryName);
  }

  @When("Page is translated to English")
  public void translatePageToEnglish() {
    subscriptionPage.translatePageToEnglish();
  }

  @Then("{string} country should get selected")
  public void translatePageToEnglish(String countryName) {
    Assert.assertEquals(subscriptionPage.getSelectedCountryName(), countryName);
  }

  @Then("Verify that package type is {string}")
  public void verifyPackageDetails(String packageType) {
    subscriptionPage.getPackageDescription();
    Assert.assertTrue(subscriptionPage.getPackageDescription().contains(packageType));
  }

  @And("Verify that currencyType is {string} and price is {string}")
  public void verifyPackageDetails(String currencyType, String price) {
    Assert.assertTrue(subscriptionPage.getPackageCost().contains(currencyType));
    Assert.assertTrue(subscriptionPage.getPackageCost().contains(price));
  }
}
