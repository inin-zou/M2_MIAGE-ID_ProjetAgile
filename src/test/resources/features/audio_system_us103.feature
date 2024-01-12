Feature:US_103 Calculating Black Friday Price for Car and Audio System
  As a promotions manager,
  I want to offer additional discounts to customers purchasing a car and an audio system during Black Friday,
  So that I can boost sales and attract more customers.


  Scenario: Calculating Black Friday price for car and audio system
    Given the price of the AudioSystem's car is 10000 euros
    And the price of the audio system is 5000 euros
    When a 0.8 Black Friday promotional factor is applied
    Then the Black Friday total price should be 12000 euros

  Scenario Outline: Calculating Black Friday price for car and audio system
    Given the price of the AudioSystem's car is <car_price> euros
    And the price of the audio system is <audio_price> euros
    When a <bf_promo_factor> Black Friday promotional factor is applied
    Then the Black Friday total price should be <bf_total_price> euros

    Examples:
      | car_price | audio_price | bf_promo_factor | bf_total_price |
      | 10000     | 5000        | 0.8             | 12000          |
      | 12000     | 6000        | 0.75            | 13500          |
      | 15000     | 4000        | 0.7             | 13300          |