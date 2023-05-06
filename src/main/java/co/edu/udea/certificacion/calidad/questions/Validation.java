package co.edu.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.VALIDATION_TEXT;

public class Validation implements Question<Boolean> {

    private final String EXPECTED_TEXT = "Copyright 2020 Todos los Derechos Reservados";

    @Override
    public Boolean answeredBy(Actor actor) {
        String validationText = Text.of(VALIDATION_TEXT).viewedBy(actor).asString();
        return validationText.contains(EXPECTED_TEXT);
    }

    public static Validation theHomePage() {
        return new Validation();
    }
}
