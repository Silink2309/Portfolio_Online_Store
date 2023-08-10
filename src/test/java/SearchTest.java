import Sections.SearchStore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.open;

public class SearchTest {
    @ParameterizedTest
    @CsvSource({
            "Black & White Diamond Heart",
            "Computing and Internet",
            "Build your own cheap computer",
            "1MP 60GB Hard Drive Handycam Camcorder",

    })
    @Test
    public void testSearch(String searchText){
        SearchStore objSearchStore = open(Url.url,SearchStore.class);
        objSearchStore.searchTest(searchText);
    }
}
