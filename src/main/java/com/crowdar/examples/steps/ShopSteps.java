package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.GoogleHomePage;
import com.crowdar.examples.pages.GoogleSearchResultPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class ShopSteps extends PageSteps {

    @Given("el cliente se encuentra en la pagina de home")
    public void elCllienteSeEncuentraEnLaPaginaDeHome(){
    }
    @When("el cliente hace click en el boton (.*)")
    public void elClienteHaceClickEnElBoton(){
    }

    @Then("el cliente verifica que fué redireccionado a la pantalla de login")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaDeLogin(String pantalla){
    }

    @When ("el cliente ingresa su emal: (.*)")
    public void elClienteIngresaSumalLuisjivillalbaGmailCom(String email){
    }
    @And ("el cliente ingresa su password: {int}")
    public void elClienteIngresaSuPassword(String arg0){
    }

    @Then ("el cliente verifica que fué redireccionado a la pantalla de My Account")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaDeMyAccount(){
    }
}
