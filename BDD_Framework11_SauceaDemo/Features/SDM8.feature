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
Feature:SauceDemo

  @tag1
  Scenario:Products3
   Given I launch the browser8
  And I navigated to the URL8
  Then I give Valid username8
  And I give valid password8
  Then I click on login button8
  Then I click on add to cart button8
  And I click on cartimage8
  Then I click on continue shopping button8