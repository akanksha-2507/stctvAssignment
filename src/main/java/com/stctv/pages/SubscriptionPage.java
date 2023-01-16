package com.stctv.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.stctv.core.TestFactory;

public class SubscriptionPage extends TestFactory {

  public SubscriptionPage() {
    PageFactory.initElements(driver, this);
  }

  @FindBy(id = "translation-btn")
  WebElement translateButton;

  @FindBy(xpath = "//a[@id='country-btn']")
  WebElement btnCountry;

  @FindBy(id = "country-name")
  WebElement btnCountryName;

  @FindBy(className = "trial-description")
  WebElement textPackageDescription;

  @FindBy(className = "trial-cost")
  WebElement textPackageCost;

  String chooseCountryXpath = "//span[contains(@id,'contry-lable') and contains(text(), '%s')]";

  public String getSelectedCountryName() {
    return TestFactory.getText(btnCountry).trim();
  }

  public void chooseCountry(String countryName) {
    TestFactory.webElementClick(btnCountryName);
    WebElement country =
        driver.findElement(By.xpath(String.format(chooseCountryXpath, countryName)));
    TestFactory.webElementClick(country);
  }

  public void translatePageToEnglish() {
    TestFactory.webElementClick(translateButton);
  }

  public String getPackageDescription() {
    return TestFactory.getText(textPackageDescription);
  }

  public String getPackageCost() {
    return TestFactory.getText(textPackageCost);
  }
}
