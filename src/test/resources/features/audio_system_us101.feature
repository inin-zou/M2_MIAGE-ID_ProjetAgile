Feature: US_101 Calculating Promotional Price of Audio System
  As an audio system salesperson,
  I want to be able to calculate the promotional price of the audio system with different promotional factors,
  So that I can offer attractive deals to customers and stimulate sales.

  Scenario: Calculating promotional price of an audio system
    Given the original price of the audio system is 5000 euros
    When a 0.9 promotional factor is applied to the audio system
    Then the promotional price of the audio system should be 4500 euros

  Scenario Outline: Calculating promotional price of an audio system
    Given the original price of the audio system is <audio_price> euros
    When a <promo_factor> promotional factor is applied to the audio system
    Then the promotional price of the audio system should be <promo_audio_price> euros

    Examples:
      | audio_price | promo_factor | promo_audio_price |
      | 5000        | 0.9          | 4500              |
      | 6000        | 0.85         | 5100              |
      | 7000        | 0.8          | 5600              |
