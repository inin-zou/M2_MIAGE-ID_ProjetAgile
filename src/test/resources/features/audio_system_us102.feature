Feature: US_102 Calculating the Total Price of the Car and Audio System
  As a sales manager for car and audio system combos,
  I want to be able to calculate the total price when buying a car and an audio system,
  So that I can provide clear pricing information to customers, facilitating their purchase decision.

  Scenario: Calculating total price of car and audio system
    Given the price of the AudioSystem's car is 10000 euros
    And the price of the audio system is 5000 euros
    When I calculate the sum of both prices
    Then the total price should be 15000 euros

  Scenario Outline: Calculating promotional price of an audio system
    Given the original price of the audio system is <audio_price> euros
    When a <promo_factor> promotional factor is applied to the audio system
    Then the promotional price of the audio system should be <promo_audio_price> euros

    Examples:
      | audio_price | promo_factor | promo_audio_price |
      | 5000        | 0.9          | 4500              |
      | 6000        | 0.85         | 5100              |
      | 7000        | 0.8          | 5600              |
