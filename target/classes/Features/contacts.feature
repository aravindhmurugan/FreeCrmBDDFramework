Feature: Free CRM Login Feature

Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
And user clicks on login button
And user is on home page
And user clicks on new contact page
And user enters contact details "<firstname>" and "<lastname>" and "<position>"
And close the browser


Examples:

|   username      | password| firstname | lastname | position |
| aravindhmurugan |welcome1 | kandha    | kathir   | Manager  |
| aravindhmurugan |welcome1 | Arumugan  | vela     | Director |