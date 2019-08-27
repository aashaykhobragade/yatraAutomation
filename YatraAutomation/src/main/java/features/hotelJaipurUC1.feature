@Test
Feature: yatra.com validations
@SmokeTest
   Scenario: yatra.com Use case1 scenarios
    
    Given User is already on yatra.com page
    Then User clicks on Hotels
    And User selects city as Jaipur
    And User selects Checkin and Checkout dates
    Then User selects Travellers
    And Clicks Search Hotels button
    Then Print Total number of Hotel records

@End2EndTest
Scenario: yatra.com Use case2 scenarios

   Given User Selects Star rating as 5 Star
   Then User Selects bottom of top 5 hotel 
   Then User clicks Hotel and Print the price
   And User Clicks on review tab 
   When User choose room button and click on book now
   Then User Verify the same price and hotel name 
   And User Verify the tariff details 
   Then Close the browser
    
     