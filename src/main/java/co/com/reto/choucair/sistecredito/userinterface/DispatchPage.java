package co.com.reto.choucair.sistecredito.userinterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DispatchPage  {

    public static final Target EMAIL_PURCHASED = Target.the("User's email")
            .locatedBy("//input[@name='emailAddress']");

    public static final Target EMAIL_PURCHASED_BUTTON_CONTINUE = Target.the("To continue dispatch")
            .located(By.xpath("//*[@class=\"fbra_button fbra_test_button fbra_emailInputForm__submitButton fbra_test_emailInputForm__submitButton\"]"));

    public static final Target REGION = Target.the("Region place")
            .located(By.xpath("//*[@id=\"region\"]"));

    public static final Target CITY= Target.the("city place")
            .located(By.xpath("//*[@id=\"ciudad\"]"));

    public static final Target TOWN= Target.the("Town place")
            .located(By.xpath("//*[@id=\"comuna\"]"));

    public static final Target DISPATCHED_BUTTON_CONTINUE= Target.the("Button for continue with dispatch place")
            .located(By.xpath("//*[@class=\"fbra_button fbra_test_button fbra_formItem__field04\"]"));

    public static final Target ADDRESS_PURCHASED = Target.the("User's address")
            .locatedBy("//input[@id='address']");

    public static final Target ADDRESS_APARTMENT_PURCHASED = Target.the("User's apartment")
            .locatedBy("//input[@id='departmentNumber']");

    public static final Target BUTTON_ADDRESS_PURCHASED = Target.the("User's adress button")
            .locatedBy("//button[@name=\"useAddress\"]");

    public static final Target BUTTON_ADDRESS_PURCHASED_CONTINUE = Target.the("When user put the address and then user can to continue for pay")
            .locatedBy("//*[@class=\"fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton\"]");
}