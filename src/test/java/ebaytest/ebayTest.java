package ebaytest;

import ebay.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import utils.TestApp;

public class ebayTest {

    HomePage homePage;
    FashionPage fashionPage;
    ShoesPage shoesPage;
    MenShoesPage menShoesPage;
    MensShoesSize9Page mensShoesSize9Page;
    FirstlyDisplayedShoesPage firstlyDisplayedShoesPage;

    @BeforeMethod
    public void setUp() {

        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();

        homePage = PageFactory.initElements(TestApp.getInstance().getDriver(), HomePage.class);
        fashionPage = PageFactory.initElements(TestApp.getInstance().getDriver(), FashionPage.class);
        shoesPage = PageFactory.initElements(TestApp.getInstance().getDriver(), ShoesPage.class);
        menShoesPage = PageFactory.initElements(TestApp.getInstance().getDriver(), MenShoesPage.class);


    }

    @Test
    public void testName() {

        homePage.clickshopbycategory();
        homePage.clickfashion();
        fashionPage.clickshoes();
        shoesPage.clickMensShoes();
        menShoesPage.clickSize9MenShoes();
        menShoesPage.clickByItNow();


    }
}
