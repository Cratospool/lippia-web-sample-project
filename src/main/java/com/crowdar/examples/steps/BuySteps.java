package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import io.cucumber.java.en.*;

public class BuySteps extends PageSteps {

    @Given("El cliente se encuentra el la pagina My Account")
    public void elClienteSeEncuentraElLaPaginaMyAccount() {
    }

    @When("El cliente posiciona el puntero: (.*)")
    public void elClientePosicionaElPunteroProducto(String locator) {
    }

    @Then("El cliente verifica si el boton (.*) fué desplegado")
    public void elClienteVerificaSiElBotonAddToCartFuéDesplegado(String boton) {
    }

    @When("El clinte hace click en el boton: (.*)")
    public void elClinteHaceClickEnElBoton(String boton) {
    }

    @And("El cliente verifica que fue redireccionado a la pagina (.*)")
    public void elClienteVerificaQueFueRedireccionadoALaPagina(String pagina) {
    }

    @When("El cliente verifica que hay un solo producto en su carrito")
    public void elClienteVerificaQueHayUnSoloProductoEnSuCarrito() {
    }

    @And("El Cliente click en un check aceptando los terminos de servicio")
    public void elClienteClickEnUnCheckAceptandoLosTerminosDeServicio() {
    }
}