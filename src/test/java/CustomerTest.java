import LogRegUser.CustomerUser;
import LogRegUser.Login;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.open;

public class CustomerTest {
    @ParameterizedTest
    @CsvSource({
            "wwwoI@gmail.com,11111111,1,Vasia,Pupkin,jegm@mail.com",
    })
    @Test
    public void customerTest(String login,String password,int remember,String newFirstName,String newLastName,String newEmail){
        CustomerUser customerUser = new CustomerUser();
        Login objLogin = open(Url.urlLogin, Login.class);
        objLogin.loginTest(login,password,remember);
        //CustomerUser customerUser = new CustomerUser();
        customerUser.renameTest(newFirstName,newLastName,newEmail);
    }
}
