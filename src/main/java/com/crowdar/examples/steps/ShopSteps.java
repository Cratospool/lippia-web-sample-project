package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import io.cucumber.java.en.*;

public class ShopSteps extends PageSteps {

    @Given("el cliente se encuentra en la pagina de home")
    public void elCllienteSeEncuentraEnLaPaginaDeHome(){
        Injector._page(ShopHomePage.class).go();
    }

    @When("el cliente hace click en el boton Sign in")
    public void elClienteHaceClickEnElBotonSignIn() {
        Injector._page(ShopHomePage.class).clickSignInButton();
    }

    @Then("el cliente verifica que fué redireccionado a la pantalla de login")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaDeLogin() {
        Injector._page(ShopHomePage.class).verifyHomePage();
    }

    @When("el cliente ingresa su emal: luisjivillalba@gmail.com")
    public void elClienteIngresaSuEmalLuisjivillalbaGmailCom() {
        Injector._page(ShopHomePage.class).setTextEmailBox();
    }

    @And("el cliente ingresa su password: asd123")
    public void elClienteIngresaSuPasswordAsd() {
        Injector._page(ShopHomePage.class).setTextPasswordBox();
    }

    @And("el cliente hace click en el boton Sign in verde")
    public void elClienteHaceClickEnElBotonSignInVerde() {
        Injector._page(ShopHomePage.class).clickSinginGreenButton();
    }

    @Then("el cliente verifica que fué redireccionado a la pantalla de My Account")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaDeMyAccount() {

    }



}

