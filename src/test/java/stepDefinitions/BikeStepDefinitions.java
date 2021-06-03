package stepDefinitions;

import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.Bike_Steps;

public class BikeStepDefinitions {
    @Steps
    Bike_Steps pasos = new Bike_Steps();
    @Given("^que me encuentro en la pagina de bikesonline$")
    public void queMeEncuentroEnLaPaginaDeBikesonline() {
        SeleniumWebDriver.firefoxDriver("https://www.bikesonline.com/");
    }
    @When("^busco diferentes modelos de ciclas en el buscador$")
    public void buscoDiferentesModelosDeCiclasEnElBuscador() {
        Bike_Steps.stepConBike_Excel();
    }
    @Then("^podre ver los productos buscados con su precio respectivo$")
    public void podreVerLosProductosBuscadosConSuPrecioRespectivo() {

    }
}
