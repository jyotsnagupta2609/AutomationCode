Feature: loginPage

Scenario Outline: Successful login with valid credential
	Given user launch chrome browser
	When user open URL "http://51.140.8.102/AviBuyerWebDev/"
	And user enter email as "<email>" and Password as "<password>"
	And click on login
	Then page title should be "Avibuyer - Home Page"
	And close browser
	
	Examples:
		|email|password|
		|Super.Admin@avibuyer.org|A41BUY312##|
	
	