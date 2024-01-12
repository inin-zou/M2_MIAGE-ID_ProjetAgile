package testAutoJava;

import AutoJava.Voiture;
import static org.junit.jupiter.api.Assertions.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class VoitureStepDefinitions {

    private Voiture voiture;
    private double promotionalPrice;

    @Given("the original price of the car is {double} euros")
    public void getOriginalPriceCar(double prix) {
        voiture = new Voiture();
        voiture.setPrixVoiture(prix);
    }
    @When("a {double} promotional factor is applied to the car")
    public void promoCar(double discount) {
        promotionalPrice = voiture.promoVoiture(discount);
    }
    @Then("the calculated promotional price should be {double} euros")
    public void promoCarCheck(double expectedPrice) {
        assertEquals(expectedPrice, promotionalPrice, 0.01);
    }
}