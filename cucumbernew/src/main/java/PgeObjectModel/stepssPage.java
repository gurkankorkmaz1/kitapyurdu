package PgeObjectModel;

import Araclar.Driver;
import cucumber.api.CucumberOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class stepssPage extends AbstractClass{
    By sayfakitapfiyat = new By.ByXPath("//div[@class='price__item']");

    WebDriver driver;
    public stepssPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[normalize-space()='Çok Satan Kitaplar']")
    private WebElement encoksatankitap;

    public void clickencoksatankitap(){
        clickFunction(encoksatankitap);
    }
    @FindBy(xpath = "//strong[normalize-space()='Edebiyat']")
    private WebElement encoksatanedebiyat;

    public void clickencoksatanedebiyat(){
        clickFunction(encoksatanedebiyat);
    }

    @FindBy(className = "product-cr")
        private List<WebElement> tumkitaplar;
            public void kitabatikla(){
            Random rand = new Random();
            int randomBook = rand.nextInt(tumkitaplar.size());
            tumkitaplar.get(randomBook).click();
    }
    @FindBy(xpath = "/html/body/div[5]/div/div/div[8]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/a")
    private WebElement sepeteekle;
    public void clicksepeteekle(){
        clickFunction(sepeteekle);
    }

    @FindBy(xpath = "/html/body/div[5]/div/div/div[8]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div")
    private WebElement price;
    public String getpricevalue(){
        return price.getText();
    }
    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/div[1]/table/tbody/tr[2]/td[7]") //,/html/body/div[5]/div/div/div[2]/div/div[1]/table/tbody/tr/td[6]/spansorun bunda 2 tane var
    private WebElement cartprice;
    public String getcartpricevalue(){
        return cartprice.getText();
    }



    By kitapismi = new By.ByXPath("//h2[@id='swal2-title']");
    @FindBy(xpath = "//h2[@id='swal2-title']") // popuptaki kitap adı ile kitabın adını doğrula
    private WebElement eklendipopup;
     public void assertMassage(){
         Assertion(eklendipopup, find(kitapismi).getText());
     }

     @FindBy(xpath = "//h4[@class='common-sprite']")
    private WebElement sepetetikla;

    public void clicksepetetikla(){
        clickFunction(sepetetikla);
    }
    @FindBy(xpath = "//div[@class='ellipsis']")
    private WebElement sepetisim;
    @FindBy(xpath = "//h1[@class='pr_header__heading']")
    private WebElement kontrolpopup;
    public void assertMassage2(){
        Assertion((sepetisim), kontrolpopup.getText());
    }

    By urunsayisi = new By.ById("sprite-cart-icon");
    @FindBy(id = "sprite-cart-icon")
    private WebElement sepettekiurunsayisi;

    public int tumurunsayisi() {
        String urunmiktari = find(urunsayisi).getText();
        return Integer.parseInt(urunmiktari);
    }
    public boolean urunsayisi() {
        return tumurunsayisi() > 0;
    }
    /*@FindBy(xpath = "/html/body/div[5]/div/div/div[7]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div")/// deneme sayfa fiyat
    private WebElement sayfafiyat;
    public boolean sayfafiyatal(){
        clickFunction(sayfafiyat);
        return true;
    }*/
    @FindBy(xpath = "//a[@id='js-cart']")
    private WebElement sepetegit;
     public void clicksepetegit(){
         clickFunction(sepetegit);
     }
     @FindBy(xpath = "//td[@class='price narrow']") //
    private WebElement sepetfiyat;
     public int fiyatlar(){
         Assertion((WebElement) sayfakitapfiyat, sepetfiyat.getText());
         return Integer.parseInt(String.valueOf(sayfakitapfiyat));
     }

     @FindBy(xpath = "//input[@id='search-input']")
    private WebElement aramabutontikla;
     public void clickaramabuton(){clickFunction(aramabutontikla);}
    public void kitaspadiarat(){sendKeysFunction(aramabutontikla, "Oyun Terapisi");}
    @FindBy(xpath = "//span[@class='common-sprite button-search']")
    private WebElement arat;
     public void arattikla(){clickFunction(arat);}
    @FindBy(xpath = "//ul[@class='product-grid small jcarousel-skin-opencart']//img[@alt='Oyun Terapisi']")
    private WebElement kitap;
     public void clickkitabatikla(){clickFunction(kitap);}
    @FindBy(xpath = "//span[normalize-space()='Sepete Ekle']")
    private WebElement aratilankitap;
     public void clickaratilankitapsepeteekle(){clickFunction(aratilankitap);}

    By kitapismi2 = new By.ByXPath("/html/body/div[5]/div/div/div[8]/div/div[2]/div[1]/h1");///deneme
    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div[4]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/a") // aranan kitap adı ile kitabın adını doğrula
    private WebElement aratilankitapadi;
    public void assertMassagearatilan(){
        Assertion(aratilankitapadi, find(kitapismi2).getText());
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[4]")
    private WebElement sagustsepetetikla2;
    public void clicksagusttikla2(){clickFunction(sagustsepetetikla2);}
    @FindBy(xpath = "//a[@id='js-cart']")
    private WebElement sepetetikla2;
    public void clicksepetetiklaaa2(){clickFunction(sepetetikla2);}

}
