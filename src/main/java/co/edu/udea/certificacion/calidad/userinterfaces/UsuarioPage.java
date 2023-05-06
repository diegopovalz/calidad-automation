package co.edu.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UsuarioPage extends PageObject {

    public static final Target INPUT_TEXT = Target.the("Input Text").located(By.id("q"));
    public static final Target INPUT_TEXT1 = Target.the("Input Text 1").locatedBy("//*[@id='APjFqb']");
    public static final Target ANCHOR = Target.the("UdeA Anchor").locatedBy("//*[@id='rso']/div[1]/div/div/div/div/div/div/div/div[1]/a");
    public static final Target VALIDATION_TEXT = Target.the("Validation text paragraph").locatedBy("//div[@class='ctn_body']/p[3]");
}
