Feature: Reset functionality on login page of Application	 
			
Scenario Outline: Verification of reset button with numbers of credential

Given Open the Chrome and launch the application	
			
When Enter the Username <username> and Password <password>

Then Reset the credential						

Examples:                      		

|username  |password         |
|jyotsna   |xyz              |
|avinash   |abc              |

