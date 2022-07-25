import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LocationSavePage extends driverFactory {

    public LocationSavePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /*
    Senaryo 1
    • Uygulama açılır
    • Anasayfada Konum alanına tıklanır.
    • İl, ilçe ve mahalle seçilir ve kaydet butonuna Kklanır.
    • Konumunuz Kaydedildi popup’ı kontrol edilir.
    • Elektronik kategorisi seçilip dizüstü bilgisayarlara tıklanarak laptoplar listelenir.
    • Listeleme sayfasında Yarın Kapında alanında gelen il bilgisi ile anasayfada seçilen il bilgisinin
    aynı olduğu kontrol edilir.
     */


    // Step 2: Anasayfada konum alanına tıklanır.
    private final By selectLocation = By.xpath("//div[contains(text(),'Konum seç')]");
    private final By newLocationBtn = By.xpath("//*[@id=\"shippingLocationFormArea\"]/div[3]/button\n");

    // Step 3: İl, ilçe, mahalle seçilir ve kaydet butonuna tıklanır.
    private final By citySelector = By.xpath("//*[@id=\"shippingLocationFormArea\"]/div[3]/div/div[1]/div/div/div[1]");
    private final By cityName = By.xpath("//div[contains(text(),'İSTANBUL')]");
    private final By townSelector = By.xpath("//*[@id=\"shippingLocationFormArea\"]/div[3]/div/div[2]/div/div/div");
    private final By townName = By.xpath("//*[@id=\"shippingLocationFormArea\"]/div[3]/div/div[2]/div/div/div[2]/div[19]");
    private final By districtSelector = By.xpath("//*[@id=\"shippingLocationFormArea\"]/div[3]/div/div[3]/div/div/div");
    private final By districtName = By.xpath("//*[@id=\"shippingLocationFormArea\"]/div[3]/div/div[3]/div/div/div[2]/div[29]");
    private final By locationSaveBtn = By.xpath("//button[contains(text(),'Kaydet')]");

    //Step 4: Elektronik kategorisi seçilir. Altında Bilgisayar Tablet seçilir.
    private final By selectElectronicCategory = By.xpath("//span[contains(text(),'Elektronik')]");
    private final By selectComputers = By.xpath("//a[contains(text(),'Bilgisayar/Tablet')]");
    private final By selectLaptops = By.xpath("//a[contains(text(),'Dizüstü Bilgisayar')]");
    private final By selectOneLaptop = By.xpath("//h3[contains(text(),'Lenovo IdeaPad Intel Celeron N4020 4GB 128GB SSD F')]");


    public void locationSave() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectLocation)).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(newLocationBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(citySelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityName)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(townSelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(townName)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtSelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtName)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locationSaveBtn)).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectElectronicCategory)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectComputers)).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(selectLaptops)).click();
        Thread.sleep(5000);
        js.executeScript("window.scrollTo(0,1000)");
        wait.until(ExpectedConditions.elementToBeClickable(selectOneLaptop)).click();
        Thread.sleep(5000);

    }
}

