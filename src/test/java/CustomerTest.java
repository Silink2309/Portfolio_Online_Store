
import LogRegUser.Login;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.open;

public class CustomerTest {
    @ParameterizedTest
    @CsvSource({
            "wwwo2@gmail.com,11111111,1,Vasid4a,Pupkfi4n,jeg43m@mail.com",

    })
    @Test
    @DisplayName("Изменения Имени Логина и почты  зарегистрированного пользователя")
    public void customerTest(String login,String password,int remember,String newFirstName,String newLastName,String newEmail){
        Login objLogin = open(Url.urlLogin, Login.class);
        objLogin.loginTest(login,password,remember);
        objLogin.renameTest(newFirstName,newLastName,newEmail);

    }

}
