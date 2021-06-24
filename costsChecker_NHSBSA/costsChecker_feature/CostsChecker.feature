
Feature: NHS Costs Checker 
Scenario: Wales person Eligibility Checker
Given I am a person from Wales
When I put my circumstances into the Checker tool
Then I should get a result of whether I will get help or not
