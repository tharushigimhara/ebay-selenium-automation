package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestApp;

public class MenShoesPage {

    @FindBy(xpath = "//*[@id=\"w2-w1-w0-w0-multiselect[2]\"]/a/span[1]")
    private WebElement size9MenShoesElement;

    @FindBy(xpath = "//*[contains(text(),'Buy It Now')]")
    private WebElement byItNowElement;

    public MenShoesPage clickSize9MenShoes() {
        TestApp.getInstance().waitForElement(By.xpath("//*[@id=\"w2-w1-w0-w0-multiselect[2]\"]/a/span[1]"), 20);
        size9MenShoesElement.click();
        return this;
    }

    public MenShoesPage clickByItNow() {
        TestApp.getInstance().waitForElement(By.xpath("//*[contains(text(),'Buy It Now')]"), 20);
        byItNowElement.click();

        System.out.println(byItNowElement.getText());
        return this;
    }


}
