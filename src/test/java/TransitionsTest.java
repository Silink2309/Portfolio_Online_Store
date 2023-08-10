import Sections.Transitions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TransitionsTest {
    @Test
    public void testButtonBooks(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonBooksTest();
    }
    @Test
    public void testButtonComputersDesktops(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonComputersDesktopsTest();
    }
    @Test
    public void testButtonComputersNotebooks(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonComputersNotebooksTest();
    }
    @Test
    public void testButtonComputersAccessories(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonComputersAccessoriesTest();
    }
    @Test
    public void testButtonElectronicsCameraPhoto(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonElectronicsCameraPhotoTest();
    }
    @Test
    public void testButtonElectronicsCellPhones(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonElectronicsCellPhonesTest();
    }
    @Test
    public void testApparelShoes(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonApparelShoesTest();
    }
    @Test
    public void testDigitalDownloads(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonDigitalDownloadsTest();
    }
    @Test
    public void testJewelry(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonJewelryTest();
    }
    @Test
    public void testGiftCards(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonGiftCardsTest();
    }
}
