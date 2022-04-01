Feature: 

  Scenario Outline: 
    Given open browser
    And enter url and enter <username> and <password>
    When click on login btn
    Then navigate to home page

    Examples: 
      | username | password |
      | sachin   |    12345 |
      | Rohit    |    12345 |
      | Virat    |    12345 |
