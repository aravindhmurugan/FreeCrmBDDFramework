@FunctionalTest
Feature: Free CRM Application testing

@Smoketest
Scenario: Login with correct username and password
Given This is a valid login test

@Regressiontest
Scenario: Login with incorrect username and password
Given This is a invalid login test

@Smoketest @Regressiontest
Scenario: Create a contact
Given This is a contact test case

@Smoketest @Regressiontest
Scenario: Create a deal
Given This is a deal test case

@Smoketest @Regressiontest
Scenario: Create a task
Given This is a task test case

@Smoketest
Scenario: Create a mail
Given This is a mail test case

@Regressiontest
Scenario: Create a text
Given This is a text test case

@End2End
Scenario: Create a sms
Given This is a sms test case

@End2End @Smoketest
Scenario: Create a docs
Given This is a docs test case

@Smoketest @Regressiontest
Scenario: Create a forms
Given This is a forms test case

Scenario: Create a reports
Given This is a reports test case

