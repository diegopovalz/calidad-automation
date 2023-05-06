package co.edu.udea.certificacion.calidad.stepdefinitions;

import co.edu.udea.certificacion.calidad.questions.Validation;
import co.edu.udea.certificacion.calidad.tasks.OpenThe;
import co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FindHomePageStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver driver;

    private Actor student = Actor.named("Diego");

    @Before
    public void setup() {
        driver.manage().window().maximize();
        student.can(BrowseTheWeb.with(driver));
    }

    @After
    public void cleanUp() {
        driver.quit();
    }

    @Given("que me encuentro en la pagina de Google")
    public void queMeEncuentroEnLaPaginaPrincipal() {
        student.can(BrowseTheWeb.with(driver));
    }

    @When("escribo la sentencia U de A")
    public void cuandoEscriboLaSentenciaUDeA() {
        student.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }

    @Then("puedo ver el link de la pagina oficial")
    public void entoncesPuedoVerElLinkDeLaPaginaOficial() {
        //WebDriverWait wait = new WebDriverWait(driver, 120);
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='layoutContainers']/div/div[2]/div/div[4]/section/div[2]/footer/div/div[1]/div/div[3]/p[3]")));
        student.should(seeThat(Validation.theHomePage(), equalTo(true)));
    }
}
