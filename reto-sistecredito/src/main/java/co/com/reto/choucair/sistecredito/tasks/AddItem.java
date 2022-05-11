package co.com.reto.choucair.sistecredito.tasks;

import co.com.reto.choucair.sistecredito.userinterface.IndexPage;
import co.com.reto.choucair.sistecredito.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.reto.choucair.sistecredito.userinterface.PurchasePage.BUTTON_ADD_CAR_MARKET;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddItem implements Task {
    private  String item;

    public AddItem(String item) {
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Enter.theValue(Constants.ITEM).into(IndexPage.ITEM_PLACE),
                Click.on(IndexPage.BUTTON_SEARCH),
                Click.on(BUTTON_ADD_CAR_MARKET)
        );
    }

    public static AddItem addItem(String item){
        return instrumented(AddItem.class,item);
    }
}