
Feature: YouTube
 
@Youtube
Scenario: searching on youtube
    Given open chrome
    When  give url "https://www.youtube.com/"
    Then   search "Dil e Umeed" 
    And   click on search
    

  
