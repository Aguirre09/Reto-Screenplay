package co.com.reto.choucair.sistecredito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.reto.choucair.sistecredito.userinterface.PurchasePage.BUTTON_GO_TO_BUY;
import static co.com.reto.choucair.sistecredito.userinterface.PurchasePage.BUTTON_SEE_SHOPPING_BAG;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ShoppingBag implements Task {
    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Click.on(BUTTON_SEE_SHOPPING_BAG),
                Click.on(BUTTON_GO_TO_BUY)
        );
    }

    public static ShoppingBag shoppingBag(){
        return instrumented(ShoppingBag.class);
    }
}
