Feature: Validate xpanxion home page url
  Scenario: Validate the xpanxion home page URL
    Given I navigate to xpanxion home page
    When the page loads
    Then validate the url