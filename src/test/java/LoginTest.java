import LogRegUser.Login;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    @ParameterizedTest
    @CsvSource({
            "wwwojkI@gmail.com,11111111,1",
    })
    @Test
    public void loginTest(String login,String password,int remember){
        Login objLogin = open(Url.urlLogin, Login.class);
        objLogin.loginTest(login,password,remember);
    }
}
