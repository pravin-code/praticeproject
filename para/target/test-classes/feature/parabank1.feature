Feature:
  Registering and Logining in the ParaBank Webpage
 
  Scenario: Registering in the ParaBank
    Given User is on the para bank register page
    When User enters the Firstname
    When user enters the Lastname
    When user enters the Address
    When user enters the City
    When user enters the State
    When user the enters the Zip code
    When user the enters the Phone number
    When user the enters the SSN number
    When user the enters the Username
    When user the enters the Passowrd
    When user the enters the Passowrd Confirm
    When user clicks the Register
    Then user gets Confimation message
    Then user clicks Logout
