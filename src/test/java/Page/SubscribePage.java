package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscribePage extends BasePage{
     By liteType = By.id("name-لايت");

    By country1 = By.id("country-name");
    By KSA = By.xpath("//span[@id='sa-contry-lable']");
    By Kw = By.xpath("//span[@id='kw-contry-lable']");
    By Bha = By.xpath("//span[@id='bh-contry-lable']");
    By LiteBtn = By.xpath(" //a[@id='لايت-selection']");


    By PriceLite = By.xpath("//b[contains(text(),'15')]");
    By PriceLiteKw = By.xpath("//b[contains(text(),'1.2')]");
    By PriceLiteBh = By.xpath("//b[contains(text(),'2')]");
    By currency = By.id("currency-لايت");
    By BasicType = By.id("name-الأساسية");
    By PreuimType = By.id("name-بريميوم");

    By PaymentMethodBtn = By.id("btnChoosePaymentMethod");
    By SelectionliteType = By.id("لايت-selection");
    By btnChooseAddons = By.id("btnChooseAddons");

    By btnFinalStepSubscribe = By.id("btnFinalStepSubscribe");


    By phoneNum = By.xpath("//input[contains(@placeholder,'رقم الجوال')]");
    public SubscribePage(WebDriver driver) {
        super(driver);
    }


    public enum Country {
        SA , Kuwait ,Baharin ;


    }



public void SubscribeLiteForm(){


    assertEquals(liteType,"لايت");
    assertEquals(PriceLite,"15");
    assertEquals(currency,"15 ريال سعودي/شهر");

click(LiteBtn);

    click(PaymentMethodBtn);
    click(btnChooseAddons);
    writeText(phoneNum ,"0581319515");

    click(btnFinalStepSubscribe);

    click(btnChooseAddons);
}

public void CuntryType(Country c){

        click(country1);

     if ( c == Country.SA) {
         System.out.println("Welcome");
         click(KSA);
        assertEquals(liteType,"لايت");
         assertEquals(PriceLite,"15");

         assertEquals(currency,"15 ريال سعودي/شهر");

         click(LiteBtn);

         click(PaymentMethodBtn);
         click(btnChooseAddons);
         writeText(phoneNum ,"0581319515");

         click(btnFinalStepSubscribe);

         click(btnChooseAddons);
     }
           else if ( c == Country.Kuwait) {

              click(Kw);

         assertEquals(liteType,"لايت");
         assertEquals(PriceLiteKw,"1.2");
         assertEquals(currency,"1.2 دينار كويتي/شهر");

         click(LiteBtn);

         click(PaymentMethodBtn);
         click(btnChooseAddons);


         } else {
         click(Bha);
         assertEquals(liteType,"لايت");
         assertEquals(PriceLiteBh,"2");


         click(LiteBtn);

         click(PaymentMethodBtn);
         click(btnChooseAddons);
         writeText(phoneNum ,"0581319515");

         click(btnFinalStepSubscribe);

         click(btnChooseAddons);
         }


}
    public void BasicType() {

        assertEquals(liteType,"لايت");
        assertEquals(PriceLite,"15");
        assertEquals(currency,"15 ريال سعودي/شهر");


        click(SelectionliteType);
         click(PaymentMethodBtn);
        click(btnChooseAddons);
        writeText(phoneNum ,"0581319515");

       click(btnFinalStepSubscribe);

        click(btnChooseAddons);
    }
    public void PreuimType() {

        assertEquals(liteType,"لايت");
        assertEquals(PriceLite,"15");
        assertEquals(currency,"15 ريال سعودي/شهر");


        click(SelectionliteType);
        click(PaymentMethodBtn);
        click(btnChooseAddons);
        writeText(phoneNum ,"0581319515");

        click(btnFinalStepSubscribe);

        click(btnChooseAddons);
    }
}
