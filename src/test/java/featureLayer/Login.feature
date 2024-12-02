
Feature: Login 
@sanityTesting
Scenario: login with valid cred
    Given lonch the browser and open Url
    When enter username and password and click on login button
    Then user is logged in
    
@DataProviderDirect
Scenario: login with valid credential
    Given lonch the browser and open Url
    When enter username as "standard_user" and password as "secret_sauce" and click on login button
    Then user is logged in  
    
    
@DataProviderOutline
Scenario Outline: login with valid credential with Outline approch
    Given lonch the browser and open Url
    When enter userName as "<username>" and passWord as "<password>" and click on login button
    Then user is logged in  

Examples:
|username|password|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|
|standard_user|secret_sauce|

    
@DataProviderForSingleData
Scenario: login with valid credential
    Given lonch the browser and open Url
    When enter UserName and PassWord and click on login button
  	|standard_user|secret_sauce|
    Then user is logged in 
    
Scenario: Login with multiple users
  Given I have the following users:
    | username | password  |
    | user3    | pass123   |
    | user2    | pass456   |
    |user4|passre|

