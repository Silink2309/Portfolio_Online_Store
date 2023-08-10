package LogRegUser;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;

public class CustomerUser {
    @FindBy(how = How.ID, using = "FirstName")
    private SelenideElement findFirstName;//input[@value='Save']

    @FindBy(how = How.ID, using = "LastName")
    private SelenideElement findLastName;

    @FindBy(how = How.ID, using = "Email")
    private SelenideElement findEmail;
    @FindBy(how = How.XPATH, using = "//input[@value='Save']")
    private SelenideElement buttonSave;
    @FindBy(how = How.XPATH,using = "((//a[@class='account'])[1]")
    private SelenideElement buttonCustomer;
    public String actualResult(SelenideElement element){
        return element.getText();
    }

    public void changesFiled(SelenideElement element,String i){
        element.clear();
        element.sendKeys(i);
    }
    void waitSelector(SelenideElement element){
        element.shouldBe(enabled);
    }
    public void assertFiled(String actualFirstName,String actualLastName,String actualEmail){
        Assertions.assertEquals(actualFirstName,actualResult(findFirstName));
        Assertions.assertEquals(actualLastName,actualResult(findLastName));
        Assertions.assertEquals(actualEmail,actualResult(findEmail));
    }
    void clickButton(SelenideElement element){
        element.click();
    }
    public void renameTest(String newFirstName,String newLastName,String newEmail){
        clickButton(buttonCustomer);
        waitSelector(findFirstName);
        System.out.println("1");
        findFirstName.clear();
        System.out.println("2");
        findFirstName.sendKeys(newFirstName);
        changesFiled(findFirstName,newFirstName);
        changesFiled(findLastName,newLastName);
        changesFiled(findEmail,newEmail);
        clickButton(buttonSave);
        assertFiled(newFirstName,newLastName,newEmail);

    }//разобраться с зависимостями ыввапке исм 
}
