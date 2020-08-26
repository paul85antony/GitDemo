Feature: Expedia header navigation


  @test1
  Scenario: When a user navigates to Expedia homepage
      Given The user is in expedia home page
      When User select the login button
      And User provide the username and password
      Then User should be logged in to the site
