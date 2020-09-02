package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import io.cucumber.java.en.*;

public class ShopSteps extends PageSteps {

    @Given("el cliente se encuentra en la pagina de home")
    public void elCllienteSeEncuentraEnLaPaginaDeHome(){
        Injector._page(ShopHomePage.class).go();
        Injector._page(ShopHomePage.class).verifyHome();
    }

    @When("el cliente hace click en el boton (.*)")
    public void elClienteHaceClickEnElBotonSignIn() {
        Injector._page(ShopHomePage.class).clickSinginButton();
    }

    @Then("el cliente verifica que fué redireccionado a la pantalla de (.*)")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaDeLogin(String pantalla) {
    }

    @When("el cliente ingresa su emal: (.*)")
    public void elClienteIngresaSuEmalLuisjivillalbaGmailCom() {
    }

    @And("el cliente ingresa su password: (.*)")
    public void elClienteIngresaSuPasswordAsd(String arg0) {
    }


}

