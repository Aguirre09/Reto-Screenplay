package co.com.reto.choucair.sistecredito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchasePage {

    public static final Target BUTTON_ADD_CAR_MARKET = Target.the("Market place")
            .located(By.xpath("//*[contains(text(), 'Agregar a la Bolsa')]"));

    public static final Target BUTTON_SEE_SHOPPING_BAG = Target.the("To see shopping bag ")
            .located(By.xpath("//*[@id=\"linkButton\"]"));

    public static final Target BUTTON_GO_TO_BUY = Target.the("Go to buy")
            .located(By.xpath("//*[@class=\"fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase\"]"));



}
