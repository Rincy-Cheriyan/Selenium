Feature: Login feature
Scenario Outline: negative login scenario
Given user is on login page
When user enters "<username>" and "<password>"
And clicks on signin
Then login is unsuccessful
Examples:
|username|password|
|rincy|rincy123|
|admin|admin123|