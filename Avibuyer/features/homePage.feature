Feature: Home page

Scenario Outline: Successfully navigate to Home Page
Given user launch chrome browser
When user open URL "http://51.140.8.102/AviBuyerWebDev/"
And user enter email as "<email>" and Password as "<password>"
And click on login
And user is on home page
When I close select pharmacy popup window
Then click on Schedule Order menu
And click on Manage schedule order submenu
And I can see pharmacy popup window
And I enter pharmacy id as "100" in text area in popup window
And I can select first search result "100500 Prime Pharmacy"
And I click on search result
And I navigate to "Group Search" page

#Group Search Page
And I click on manage schedules button
And enter group name as "GRP0000013 Testing" in group search text area
And I select group name from autocomplete dropdown list
And I select start date as "20/02/2021" and end as "28/02/2021"
And I click on add drug button
And I navigate to manage schedule page
And I enter drug as "BRISTOWS DRY SHAMPOO TROPICAL PARADISE  150ML 150(s)" in search text area
And I select drug from search result 
And I click on drug name
And I can see schedule order details
And I enter "80" in quantity 1, "60" in quantity 2 text area
And I select suppliers text box
And I enter "100" in restrict order text field
And I click on save and exit button
And I navigate to group search page

Examples:
		|email|password|
		|Super.Admin@avibuyer.org|A41BUY312##|
