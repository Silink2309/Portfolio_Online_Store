package LogRegUser;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;

public class Register {
    @FindBy(how = How.XPATH, using = "(//input[@name='Gender'])[1]")
    private SelenideElement buttonGenderMale;

    @FindBy(how = How.XPATH, using = "(//input[@name='Gender'])[2]")
    private SelenideElement buttonGenderFemale;

    @FindBy(how = How.ID, using = "FirstName")
    private SelenideElement findFirstName;

    @FindBy(how = How.ID, using = "LastName")
    private SelenideElement findLastName;

    @FindBy(how = How.ID, using = "Email")
    private SelenideElement findEmail;

    @FindBy(how = How.ID, using = "Password")
    private SelenideElement findPassword;

    @FindBy(how = How.ID, using = "ConfirmPassword")  //register-button
    private SelenideElement findConfirmPassword;

    @FindBy(how = How.ID, using = "register-button")  //register-button
    private SelenideElement registerButton;
    @FindBy(how = How.CLASS_NAME,using = "result")
    private SelenideElement resultRegister;
    public String actualResult(SelenideElement element){
        return element.getText();
    }
    public void findFill(SelenideElement element, String fillObj) {
        element.sendKeys(fillObj);
    }
    void clickButton(SelenideElement element){
        element.click();
    }
    public void waitSelector(SelenideElement element){
        element.shouldBe(enabled);
    }

    public void sex(String gender){
        switch (gender){
            case "Male":
                buttonGenderMale.click();
                break;

            case "Female":
                buttonGenderFemale.click();
                break;
            default: System.out.println("Введите пол из перечисленных:Male(Мужской) или  Female(Женский)");
        }
    }
    public void registerTest(String firstName,String lastName,String email, String password,String confPassword,String gender) {
        sex(gender);
        findFill(findFirstName, firstName);
        findFill(findLastName, lastName);
        findFill(findEmail, email);
        findFill(findPassword, password);
        findFill(findConfirmPassword, confPassword);
        clickButton(registerButton);
        waitSelector(resultRegister);
        Assertions.assertEquals("Your registration completed",actualResult(resultRegister));
    }
}
