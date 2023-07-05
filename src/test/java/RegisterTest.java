import LogRegUser.Register;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.open;

public class RegisterTest {
    @ParameterizedTest
    @CsvSource({
            "Maks,Silink,wwwoI@gmail.com,11111111,11111111,Male",
    })

    @Test
    public void registerTest(String firstName,String lastName,String email, String password,String confPassword,String gender){
        Register register = open(Url.urlRegister, Register.class);
        register.registerTest(firstName,lastName,email,password,confPassword,gender);
    }
}
