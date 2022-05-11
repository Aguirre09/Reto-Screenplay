package co.com.reto.choucair.sistecredito.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage {
    public static final Target PAYMENT_HEADING = Target.the("Mode of payment")
            .locatedBy("//*[@class=\"fbra_paymentOptionsTitle__heading__payment\"]");
}
