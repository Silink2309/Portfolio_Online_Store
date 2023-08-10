package Sections;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;

public class Transitions {
    @FindBy(how = How.XPATH,using = "(//a[@href='/books'])[1]")
    private SelenideElement buttonBooks;
        @FindBy(how = How.XPATH,using = "//h1[text()='Books']")
        private SelenideElement textBooks;
    @FindBy(how = How.XPATH,using = "(//a[@href='/computers'])[1]")
    private SelenideElement buttonComputers;
    //Вкладки выюора пк
         @FindBy(how = How.XPATH,using = "(//a[@href='/desktops'])[4]")
         private SelenideElement buttonDesktops;
         @FindBy(how = How.XPATH,using = "//h1[text()='Desktops']")
         private SelenideElement textDesktops;
         @FindBy(how = How.XPATH,using = "(//a[@href='/notebooks'])[4]")
         private SelenideElement buttonNotebooks;
         @FindBy(how = How.XPATH,using = "//h1[text()='Notebooks']")
         private SelenideElement textNotebooks;
         @FindBy(how = How.XPATH,using = "(//a[@href='/accessories'])[4]")
         private SelenideElement buttonAccessories;
         @FindBy(how = How.XPATH,using = "//h1[text()='Accessories']")
         private SelenideElement textAccessories;

    @FindBy(how = How.XPATH,using = "(//a[@href='/electronics'])[1]")
    private SelenideElement buttonElectronics;
    //Вкладки электроники
        @FindBy(how = How.XPATH,using = "(//a[@href='/camera-photo'])[4]")///локатор проверить
         private SelenideElement buttonCameraPhoto;
         @FindBy(how = How.XPATH,using = "//h1[text()='Camera, photo']")
         private SelenideElement textCameraPhoto;
        @FindBy(how = How.XPATH,using = "(//a[@href='/cell-phones'])[4]")/// локатор поменять
        private SelenideElement buttonCellPhones;
        @FindBy(how = How.XPATH,using = "//h1[text()='Cell phones']")
        private SelenideElement textCellPhones;

    @FindBy(how = How.XPATH,using = "(//a[@href='/apparel-shoes'])[1]")
    private SelenideElement buttonApparelShoes;
         @FindBy(how = How.XPATH,using = "//h1[text()='Apparel & Shoes']")
        private SelenideElement textApparelShoes;

    @FindBy(how = How.XPATH,using = "(//a[@href='/digital-downloads'])[1]")
    private SelenideElement buttonDigitalDownloads;
        @FindBy(how = How.XPATH,using = "//h1[text()='Digital downloads']")
        private SelenideElement textDigitalDownloads;
    @FindBy(how = How.XPATH,using = "(//a[text()[normalize-space()='Jewelry']])[1]")
    private SelenideElement buttonJewelry;
        @FindBy(how = How.XPATH,using = "//h1[text()='Jewelry']")
        private SelenideElement textJewelry;
    @FindBy(how = How.XPATH,using = "(//a[@href='/gift-cards'])[1]")
    private SelenideElement buttonGiftCards;
    @FindBy(how = How.XPATH,using = "//h1[text()='Gift Cards']")
    private SelenideElement textGiftCards;

    public String actualResult(SelenideElement element){
        return element.getText();
    }
    public void waitSelector(SelenideElement element){
        element.shouldBe(enabled);
    }

    public void buttonBooksTest(){
        buttonBooks.click();
        waitSelector(textBooks);
        Assertions.assertEquals("Books", actualResult(textBooks));
    }
    public void buttonComputersDesktopsTest(){
        buttonComputers.click();
        buttonDesktops.click();
        Assertions.assertEquals("Desktops", actualResult(textDesktops));
    }
    public void buttonComputersNotebooksTest(){
        buttonComputers.click();
        buttonNotebooks.click();
        Assertions.assertEquals("Notebooks",actualResult(textNotebooks));
    }
    public void buttonComputersAccessoriesTest(){
        buttonComputers.click();
        buttonAccessories.click();
        Assertions.assertEquals("Accessories",actualResult(textAccessories));
    }
    public void buttonElectronicsCameraPhotoTest(){
        buttonElectronics.click();
        buttonCameraPhoto.click();
        waitSelector(textCameraPhoto);
        Assertions.assertEquals("Camera, photo",actualResult(textCameraPhoto));
    }
    public void buttonElectronicsCellPhonesTest(){
        buttonElectronics.click();
        buttonCellPhones.click();
        waitSelector(textCellPhones);
        Assertions.assertEquals("Cell phones",actualResult(textCellPhones));
    }
    public void buttonApparelShoesTest(){
        buttonApparelShoes.click();
        Assertions.assertEquals("Apparel & Shoes",actualResult(textApparelShoes));
    }
    public void buttonDigitalDownloadsTest(){
        buttonDigitalDownloads.click();
        Assertions.assertEquals("Digital downloads",actualResult(textDigitalDownloads));
    }
    public void buttonJewelryTest(){
        buttonJewelry.click();
        Assertions.assertEquals("Jewelry",actualResult(textJewelry));
    }
    public void buttonGiftCardsTest(){
        buttonGiftCards.click();
        Assertions.assertEquals("Gift Cards",actualResult(textGiftCards));
    }
}
