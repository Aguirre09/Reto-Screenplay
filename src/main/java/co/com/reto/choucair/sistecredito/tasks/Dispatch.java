package co.com.reto.choucair.sistecredito.tasks;

import co.com.reto.choucair.sistecredito.userinterface.DispatchPage;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.reto.choucair.sistecredito.userinterface.DispatchPage.ADDRESS_APARTMENT_PURCHASED;
import static co.com.reto.choucair.sistecredito.userinterface.DispatchPage.ADDRESS_PURCHASED;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Dispatch implements Task {
    private String cityTown;
    private String department;
    protected Faker faker = new Faker();

    public Dispatch(String department, String cityTown) {
        this.cityTown = cityTown;
        this.department = department;
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                SendKeys.of(department).into(DispatchPage.REGION),
                SendKeys.of(cityTown).into(DispatchPage.CITY),
                SendKeys.of(cityTown).into(DispatchPage.TOWN),
                Click.on(DispatchPage.DISPATCHED_BUTTON_CONTINUE),
                Enter.theValue(faker.address().fullAddress()).into(ADDRESS_PURCHASED),
                Enter.theValue(faker.address().buildingNumber()).into(ADDRESS_APARTMENT_PURCHASED),
                Click.on(DispatchPage.BUTTON_ADDRESS_PURCHASED),
                Click.on(DispatchPage.BUTTON_ADDRESS_PURCHASED_CONTINUE)
               );
    }

    public static Dispatch dispatch(String department, String cityTown){
        return instrumented(Dispatch.class,department,cityTown);
    }
}