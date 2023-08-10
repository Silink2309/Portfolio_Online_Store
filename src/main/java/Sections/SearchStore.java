package Sections;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;

public class SearchStore {
    @FindBy(how = How.ID,using = "small-searchterms")
    private SelenideElement filedSearch;
    @FindBy(how = How.XPATH,using = "//input[@class='button-1 search-box-button']")
    private SelenideElement buttonSearch;
    @FindBy(how = How.XPATH,using = "//h2[@class='product-title']//a[1]")
    private SelenideElement textResult;
    public String actualResult(SelenideElement element){
        return element.getText();
    }
    public void waitSelector(SelenideElement element){
        element.shouldBe(enabled);
    }
    public void searchTest(String textSearch){
        filedSearch.sendKeys(textSearch);
        buttonSearch.click();
        Assertions.assertEquals(textSearch,actualResult(textResult));
    }
}
