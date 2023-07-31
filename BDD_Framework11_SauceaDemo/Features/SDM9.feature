#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: SauceDemo
  @tag1
  Scenario: Produts4
     Given I launch the browser9
  And I navigated to the URL9
  Then I give Valid username9
  And I give valid password9
  Then I click on login button9
  Then I click on add to cart button9
  And I click on cartimage9
  Then I click on checkout button9
  And I provide first name9
  Then I provide last name9
  And I provide postalcode9
  Then I click on continue9
  And I click on finish9

 
