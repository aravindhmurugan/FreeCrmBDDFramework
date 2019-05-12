Feature: Deal data creation

Scenario: Free CRM create a new deal scenario

Given user is already on login page
When title of page is free crm
Then user enters username and password
| aravindhmurugan | welcome1 |
Then user clicks on login button
Then user is on home page
Then user moves to deal page
And user enters deal details
| Test deal | Akash | 1000 | 50 |
#|Deal2      | Vetri | 2000 | 25 |
Then close the browser