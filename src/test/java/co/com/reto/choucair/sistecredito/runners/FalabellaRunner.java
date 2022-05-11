package co.com.reto.choucair.sistecredito.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/falabella_store.feature",
        tags="@buy",
        glue = "co.com.reto.choucair.sistecredito",
        snippets = SnippetType.CAMELCASE)
public class FalabellaRunner {
}
