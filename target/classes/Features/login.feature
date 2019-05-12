Feature: Free CRM Login Feature

#Scenario: Free CRM Login Test Scenario
#
#Given user is already on login page
#When title of login page is Free CRM
#Then user enters user name and password
#And user clicks on login button
#And user is on home page

#without examples keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on login page
#When title of login page is Free CRM
#Then user enters "aravindhmurugan" and "welcome1"
#And user clicks on login button
#And user is on home page

#with examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
And user clicks on login button
And user is on home page

Examples: 
	|      username         |   password  |
	|  aravindhmurugan      |   welcome1  |  
	|        admin          |   test123   |