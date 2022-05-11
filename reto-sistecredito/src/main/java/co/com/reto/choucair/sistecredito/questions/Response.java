package co.com.reto.choucair.sistecredito.questions;

import co.com.reto.choucair.sistecredito.userinterface.PaymentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


@Subject("Message about payment process ")
public class Response implements Question<Boolean> {
    public Boolean answeredBy(Actor actor){
        System.out.println("el dato es : "+ PaymentPage.PAYMENT_HEADING.resolveFor(actor).isVisible() );
        return PaymentPage.PAYMENT_HEADING.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> isShown(){
        return new Response();
    }

}
