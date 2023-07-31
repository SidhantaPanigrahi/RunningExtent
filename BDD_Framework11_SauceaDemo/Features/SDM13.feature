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
  Scenario: About2
   Given I launch the browser13
  Then I open the URL13
  And I give valid username13
  And I give valid password13
  Then I click on login13
  And I click on 3 dot13
  Then I click on About13
  And I click on request a demo13
  Then I provide firstname13
  Then I provide lastname13
  Then I provide Businessmail13
  Then I provide company
  Then i provide phone number
  Then I select country
  Then i select interest
  Then i provide comment
  Then i select check box
  And I click on submit
  
   