
import LogRegUser.Login;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.open;

public class CustomerTest {
    @ParameterizedTest
    @CsvSource({
            "www@gmail.com,11111111,1,Vasi4a,Pupki4n,jeg4m@mail.com",
    })
    @Test
    public void customerTest(String login,String password,int remember,String newFirstName,String newLastName,String newEmail){
        Login objLogin = open(Url.urlLogin, Login.class);
        objLogin.loginTest(login,password,remember);
        objLogin.renameTest(newFirstName,newLastName,newEmail);

    }
}
