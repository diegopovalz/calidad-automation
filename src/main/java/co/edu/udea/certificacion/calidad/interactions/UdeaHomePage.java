package co.edu.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.ANCHOR;
import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.INPUT_TEXT1;

public class UdeaHomePage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("U de A").into(INPUT_TEXT1).thenHit(Keys.RETURN));
        actor.attemptsTo(Click.on(ANCHOR));
    }

    public static UdeaHomePage go() {
        return Tasks.instrumented(UdeaHomePage.class);
    }
}
