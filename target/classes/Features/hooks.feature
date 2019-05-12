Feature: Freee CRM App Test

Scenario: free crm create deal test 
Given user is on create deal test
When user fills the deals form
Then deal is created

Scenario: free crm create contact test 
Given user is on create contact test
When user fills the contact form
Then contact is created

Scenario Outline: free crm create mail test 
Given user is on create mail test
When user fills the mail form
Then mail is created
Examples:
|mail1|
|mail2|
|mail3|