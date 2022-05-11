package co.com.reto.choucair.sistecredito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IndexPage {

    public static final Target ITEM_PLACE = Target.the("Item place for search ")
            .located(By.className("SearchBar-module_searchBar__Input__1VvhT"));

    public static final Target BUTTON_SEARCH = Target.the("Button search")
            .located(By.xpath("//button[@class=\"SearchBar-module_searchBtnIcon__6KVum\"]"));

}
