package co.com.reto.choucair.sistecredito.stepdefinitions;

import co.com.reto.choucair.sistecredito.questions.Response;
import co.com.reto.choucair.sistecredito.tasks.AddItem;
import co.com.reto.choucair.sistecredito.tasks.Dispatch;
import co.com.reto.choucair.sistecredito.tasks.OpenWebSite;
import co.com.reto.choucair.sistecredito.tasks.ShoppingBag;
import co.com.reto.choucair.sistecredito.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FalabellaStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("User wants to open and search a item inside Falabella store")
    public void userWantsToOpenAndSearchAItemInsideFalabellaStore() {
        OnStage.theActorCalled(Constants.ACTOR).wasAbleTo(OpenWebSite.openWebSite());
    }

    @When("User got put the item (.*) in  search place item")
    public void userGotPutTheItemAudífonosJBLTBLKAMInSearchPlaceItem(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddItem.addItem(item),
                ShoppingBag.shoppingBag()
                );
    }

    @And("User got put the item (.*) in department after (.*) in city and also town")
    public void userGotPutTheItemAntioquiaInDepartmentAfterBelloInCityAndAlsoTown(String department,String cityTown) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Dispatch.dispatch(department,cityTown)
        );
    }

    @Then("User can go to payment process")
    public void userCanGoToPaymentProcess() {
        System.out.println("C");

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Response.isShown()));
    }
}