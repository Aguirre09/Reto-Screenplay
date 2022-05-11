package co.com.reto.choucair.sistecredito.tasks;

import co.com.reto.choucair.sistecredito.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWebSite implements Task {

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Open.url(Constants.LINK_WEB_PAGE)
        );
    }

        public static OpenWebSite openWebSite(){
        return instrumented(OpenWebSite.class);
    }
}