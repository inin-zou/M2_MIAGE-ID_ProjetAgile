package testAutoJava;

import AutoJava.AudioSystem;
import AutoJava.Voiture;
import static org.junit.jupiter.api.Assertions.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AudioSystemStepDefinitions {

    private AudioSystem audioSystem;
    private Voiture voiture;
    private double result;

    @Given("the original price of the audio system is {double} euros")
    public void getOriginalPriceAudioSystem(double price) {
        audioSystem = new AudioSystem();
        audioSystem.setPrixAudio(price);
    }
    @When("a {double} promotional factor is applied to the audio system")
    public void promoAudioSystem(double promo) {
        result = audioSystem.promoAudio(promo);
    }
    @Then("the promotional price of the audio system should be {double} euros")
    public void promoAudioSystemCheck(double expectedPrice) {
        assertEquals(expectedPrice, result, 0.01);
    }


    @Given("the price of the audio system is {double} euros")
    public void getNewPriceAudioSystem(double price) {
        audioSystem = new AudioSystem();
        audioSystem.setPrixAudio(price);
    }
    @When("I calculate the sum of both prices")
    public void sumPriceCombo() {
        result = audioSystem.sumPrix(voiture);
    }
    @Then("the total price should be {double} euros")
    public void sumPriceComboCheck(double expectedPrice) {
        assertEquals(expectedPrice, result, 0.01);
    }


    @Given("the price of the AudioSystem's car is {double} euros")
    public void getPriceCar(double price) {
        voiture = new Voiture();
        voiture.setPrixVoiture(price);
    }
    @When("a {double} Black Friday promotional factor is applied")
    public void promoBlackFriday(double promo) {
        result = audioSystem.PrixBlackFriday(voiture, promo);
    }
    @Then("the Black Friday total price should be {double} euros")
    public void promoBlackFridayCheck(double expectedPrice) {
        assertEquals(expectedPrice, result, 0.01);
    }
}
