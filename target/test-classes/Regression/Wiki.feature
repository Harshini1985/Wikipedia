 
Feature: To validate the main page
Background:
  Given User launch the browser and navigates to main page
      
  @TC01
  Scenario: To launch the URL
  
  Then User should be able to view the main page
    

  @TC02
  Scenario: To click on the magnify image to search

    When User enters search keyword in the search field
    And  User clicks on the magnify image
    Then User validates the relevant search results

   @TC03
   
   Scenario: To check if the Commons Link is navigating to Wikimedia Commons
   
    When User clicks on the Commons Link in the main page
    Then User should be able to navigate to Wikimedia Commons
    
    @TC04
    
     Scenario: To check if help link is working
     
     When User clicks on the help link in the main page
     Then User should be able to navigate to the help page
    
     
