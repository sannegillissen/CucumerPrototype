Feature: My feature

  Scenario Outline: My first test
    When I navigate to <Link>
    Then the title should be <Title>

    Examples: 
      | Link                   | Title  |
      | https://www.google.com | Google |
      | https://www.bing.com   | Bing   |
   
    Scenario Outline: My Second test
    When I navigate to <Link>
    Then the title should be <Title>

    Examples: 
      | Link                   | Title  |
      | https://www.google.com | Google |
      | https://www.bing.com   | Bing   |