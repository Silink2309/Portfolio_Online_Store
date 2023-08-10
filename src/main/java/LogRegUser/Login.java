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



    ///// класс кастомер
        @FindBy(how = How.XPATH, using = "(//div[@class='inputs']//input)[3]")
    private SelenideElement findFirstName;//input[@value='Save']

    @FindBy(how = How.ID, using = "LastName")
    private SelenideElement findLastName;

    @FindBy(how = How.ID, using = "Email")
    private SelenideElement findEmail;
    @FindBy(how = How.XPATH, using = "//input[@value='Save']")
    private SelenideElement buttonSave;
    @FindBy(how = How.XPATH,using = "(//div[@class='header-links']//a)[1]")
    private SelenideElement buttonCustomer;
   // public String actualResult(SelenideElement element){
      //  return element.getText();
   // }

    public void changesFiled(SelenideElement element,String i){
        element.clear();
        element.sendKeys(i);
    }
    //void waitSelector(SelenideElement element){
    //    element.shouldBe(enabled);
   //}
    public void assertFiled(String actualFirstName,String actualLastName,String actualEmail){
        Assertions.assertEquals(actualFirstName,actualResult(findFirstName));
        Assertions.assertEquals(actualLastName,actualResult(findLastName));
        Assertions.assertEquals(actualEmail,actualResult(findEmail));
    }

    public void renameTest(String newFirstName,String newLastName,String newEmail){
        clickButton(buttonCustomer);
        waitSelector(findFirstName);
       // System.out.println("1");
        findFirstName.clear();
        System.out.println("2");
        findFirstName.sendKeys(newFirstName);
        changesFiled(findFirstName,newFirstName);
        System.out.println("1");
        changesFiled(findLastName,newLastName);
        System.out.println("2");
        changesFiled(findEmail,newEmail);
        System.out.println("3");
        clickButton(buttonSave);
      // assertFiled(newFirstName,newLastName,newEmail);
        Assertions.assertEquals(newFirstName,actualResult(findFirstName));
        Assertions.assertEquals(newLastName,actualResult(findLastName));
        Assertions.assertEquals(newEmail,actualResult(findEmail));

    }///удалить и вытащить в клас кастомер
}
