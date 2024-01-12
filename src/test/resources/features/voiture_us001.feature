Feature: US_001: Calculating the Promotional Price of a Car
  #As a car sales manager,
  #I want to be able to calculate the promotional price of a car under different promotional factors,
  #So that I can provide accurate discount information to customers and facilitate sales.

  # This feature describes the purpose of calculating the promotional price of a car
  # It ensures that the promoVoiture method in the Voiture class correctly calculates the discounted price

  Scenario: Calculate the discounted price of a car
    Given the original price of the car is 10000 euros
    When a 0.9 promotional factor is applied to the car
    Then the calculated promotional price should be 9000 euros

  Scenario Outline: Calculate the discounted price of a car
    Given the original price of the car is <original_price> euros
    When a <discount_factor> promotional factor is applied to the car
    Then the calculated promotional price should be <promotional_price> euros

    Examples:
      | original_price | discount_factor | promotional_price |
      | 10000          | 0.9             | 9000              |
      | 20000          | 0.85            | 17000             |
      | 15000          | 0.8             | 12000             |
