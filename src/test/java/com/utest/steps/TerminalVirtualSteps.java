package com.utest.steps;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TerminalVirtualSteps {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Leandro");
    }
    @Dado("que se ingresa la credencial de acceso")
    public void queSeIngresaLaCredencialDeAcceso() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }

    @Cuando("se completa el formulario de terminal virtual")
    public void seCompletaElFormularioDeTerminalVirtual() {
    }

    @Entonces("se debe aprobar la transaccion")
    public void seDebeAprobarLaTransaccion() {
    }

    @Y("generar registro")
    public void generarRegistro() {
    }
}
