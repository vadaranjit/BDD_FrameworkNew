Feature: Buy Product 
@sanityTestingg
Scenario: Buy Product Sucessfuly
    Given lonch the browser and open Url
    When enter username and password and click on login button
    And click on Add to cart button
    And click on cart icon and click checkout button
    And enter name and postal code
    And click on continue button and finish button
    Then varify order placed sucessfuly
    
