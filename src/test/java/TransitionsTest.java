import Sections.Transitions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TransitionsTest {
    @Test
    @DisplayName("Переход к вкладке книги")
    public void testButtonBooks(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonBooksTest();
    }
    @Test
    @DisplayName("Переход к вкладке Настольные компьютеры")
    public void testButtonComputersDesktops(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonComputersDesktopsTest();
    }
    @Test
    @DisplayName("Переход к вкладке Ноутбуки")
    public void testButtonComputersNotebooks(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonComputersNotebooksTest();
    }
    @Test
    @DisplayName("Переход к вкладке акссесуары")
    public void testButtonComputersAccessories(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonComputersAccessoriesTest();
    }
    @Test
    @DisplayName("Переход к вкладке камеры")
    public void testButtonElectronicsCameraPhoto(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonElectronicsCameraPhotoTest();
    }
    @Test
    @DisplayName("Переход к в кладке телефоны")
    public void testButtonElectronicsCellPhones(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonElectronicsCellPhonesTest();
    }
    @Test
    @DisplayName("Переход к вкладке одежда обувь ")
    public void testApparelShoes(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonApparelShoesTest();
    }
    @Test
    @DisplayName("Переход к Цифровым товарам ")
    public void testDigitalDownloads(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonDigitalDownloadsTest();
    }
    @Test
    @DisplayName("Переход к вкладке Ювелириные изделия ")
    public void testJewelry(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonJewelryTest();
    }
    @Test
    @DisplayName("Переход к вкладке Карты для оплаты")
    public void testGiftCards(){
        Transitions objTransitions =open(Url.url,Transitions.class);
        objTransitions.buttonGiftCardsTest();
    }
}
