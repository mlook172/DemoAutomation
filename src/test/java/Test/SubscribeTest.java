package Test;

import Page.SubscribePage;

import org.testng.annotations.Test;

import static Page.SubscribePage.Country.SA;
import static Page.SubscribePage.Country.Baharin;
import static Page.SubscribePage.Country.Kuwait;

public class SubscribeTest extends BaseTest {


    @Test  (priority = 0, groups = {"Subscribe"} )

    public void ValdaiteSubscribeWithCountrySaudi( ){
        SubscribePage subscribe = new SubscribePage(driver);

    subscribe.CuntryType(SA);


    }
    @Test  (priority =1, groups = {"Subscribe"} )

    public void ValdaiteSubscribeWithCountryKuwait(){
        SubscribePage subscribe = new SubscribePage(driver);

        subscribe.CuntryType(Kuwait);


    }
    @Test  (priority = 2, groups = {"Subscribe"} )

    public void ValdaiteSubscribeWithCountryBahrian( ){
        SubscribePage subscribe = new SubscribePage(driver);

        subscribe.CuntryType(Baharin);


    }
}
