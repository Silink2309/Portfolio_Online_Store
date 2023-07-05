package LogRegUser;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;

public class Login {
    //Account login page
    @FindBy(how = How.ID, using = "Email")
    private SelenideElement fildLogin;
    @FindBy(how = How.ID, using = "Password")
    private SelenideElement fildPassword;
    @FindBy(how = How.XPATH, using = "//input[@value='Log in']")
    private SelenideElement buttonLogin;
    @FindBy(how = How.ID,using = "RememberMe")
    private SelenideElement buttonRemember;
    //User Information Page
    @FindBy(how = How.XPATH,using = "(//a[@class='account'])[1]")
    private SelenideElement buttonUser;

        void clickButton(SelenideElement element){
        element.click();
    }
        void waitSelector(SelenideElement element){
        element.shouldBe(enabled);
    }
        public String actualResult(SelenideElement element){
        return element.getText();
    }
        public void filedFill(SelenideElement element,String meaning){element.sendKeys(meaning);}
    public void rememberMe(int i){
            switch (i) {
                case 1:
                    buttonRemember.click();
                    System.out.println("Пользователь сохранен");
                    break;
                case 2:
                    System.out.println("Пользователь не сохранен");
                default:
                    System.out.println("Введите верное значение : 1 - клик сохранить ,2 - вход без сохранения");
            }
    }

    public void loginTest(String login,String password,int remember){
            filedFill(fildLogin,login);
            filedFill(fildPassword,password);
            rememberMe(remember);
            clickButton(buttonLogin);
            waitSelector(buttonUser);
            clickButton(buttonUser);
        Assertions.assertEquals(login,actualResult(buttonUser));
    }
}
