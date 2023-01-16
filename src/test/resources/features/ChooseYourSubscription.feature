Feature: Country selection on home page and verify subscription package details

  Background:
    Given Page is translated to English

  @regression
  Scenario Outline: Country selection on subscription page

    When Select the country "<countryName>"
    Then "<countryName>" country should get selected
    Examples:
    |countryName|
    |UAE|
    |Jordan|

  @regression
  Scenario Outline: Verify subscription packages

    When Select the country "<countryName>"
    Then Verify that package type is "<packageType>"
    And Verify that currencyType is "<currencyType>" and price is "<price>"
    Examples:
    |countryName|  |packageType| |currencyType| |price|
    |UAE|          |CLASSIC| | AED    | |10   |
    |Jordan|       |CLASSIC| | JOD    | |0.99 |