package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import io.cucumber.java.en.*;

public class ShopSteps extends PageSteps {

    @Given("el cliente se encuentra en la pagina home")
    public void elCllienteSeEncuentraEnLaPaginaHome(){
        Injector._page(ShopHomePage.class).go();
    }

    @When("el cliente hace click en el boton (.*)")
    public void elClienteHaceClickEnElBoton (String button) {
        Injector._page(ShopHomePage.class).clickButton(button);
    }

    @Then("el cliente verifica que fué redireccionado a la pantalla (.*)")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaD(String pantalla) {
        Injector._page(ShopHomePage.class).redirectScreen(pantalla);

    }

    @When("el cliente ingresa su emal: (.*)")
    public void elClienteIngresaSuEmalLuisjivillalbaGmailCom(String email) {
        Injector._page(ShopHomePage.class).setTextEmailBox(email);
    }

    @And("el cliente ingresa su password: (.*)")
    public void elClienteIngresaSuPasswordAsd(String pass) {
        Injector._page(ShopHomePage.class).setTextPasswordBox(pass);
    }







}

