package steps;

import Araclar.Driver;
import PgeObjectModel.stepssPage;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class stepss {


    private WebDriver driver;
    stepssPage stepssPage = new stepssPage();


    @Given("^Kitapyurdu sitesine git$")
    public void kitapyurdu_sitesine_git() throws Throwable {

        driver= Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("https://www.kitapyurdu.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("Siteye gidildi");
    }

    @Given("^cok satan kitaplar sekmesinin uzerine gel$")
    public void cok_satan_kitaplar_sekmesinin_uzerine_gel() throws Throwable {
        stepssPage.clickencoksatankitap();

        System.out.println("cok satan kitaplar sekmesinin uzerine gelindi");
    }

    @Given("^cok satan edebiyat kitaplari uzerine tikla$")
    public void cok_satan_edebiyat_kitaplari_uzerine_tikla() throws Throwable {
        stepssPage.clickencoksatanedebiyat();

        System.out.println("cok satan edebiyat kitaplari uzerine tiklandi");
    }

    @Given("^bir ve yirmi arasi random bir kitaba tikla$")
    public void bir_ve_yirmi_arasi_random_bir_kitaba_tikla() throws Throwable {
        stepssPage.kitabatikla();

        System.out.println("bir ve yirmi arasi random bir kitaba tiklandi");
    }
    String price = "";

    @Given("^secilen kitabi sepete ekle$")
    public void secilen_kitabi_sepete_ekle() throws Throwable {
        stepssPage.clicksepeteekle();
        price = stepssPage.getpricevalue();

        System.out.println("secilen kitabi sepete ekledi ,Fiyatı:\n"+price);
    }
    @Given("^cikan popup'taki yazıyı karsilastirr //$")
    public void cikan_popup_taki_yazıyı_karsilastirr() throws Throwable {
        stepssPage.assertMassage();

        System.out.println("cikan popup'taki yazıyı karsilastirildi");
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^cikan popuptaki kitap ismi ile eklenen kitabin adini karsilastirr //$")
    public void cikan_popuptaki_kitap_ismi_ile_eklenen_kitabin_adini_karsilastirr() throws Throwable {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(sepete_git_butonuna_tikla()));
        stepssPage.clicksepetetikla();
        stepssPage.assertMassage2();

        System.out.println("cikan popuptaki kitap ismi ile eklenen kitabin adini karsilastirildi");
    }


    @Given("^arama bolumune kitap adi yaz$") //////////////////
    public void arama_bolumune_kitap_adi_yaz() throws Throwable {
        stepssPage.clickaramabuton();
        stepssPage.kitaspadiarat();
        stepssPage.arattikla();

        System.out.println("arama bolumune kitap adi yazdı");

    }

    @Given("^aranan kitabi sepete eklee$")////////////////
    public void aranan_kitabi_sepete_eklee() throws Throwable {
        stepssPage.clickkitabatikla();
        stepssPage.clickaratilankitapsepeteekle();

        System.out.println("aranan kitabi sepete ekleedi");
    }

    @Given("^aranan kitap ile cikan kitap adi dogrula$") //////////////////////////
    public void aranan_kitap_ile_cikan_kitap_adi_dogrula() throws Throwable {
        stepssPage.clicksepetetikla();
        stepssPage.assertMassagearatilan();

        System.out.println("aranan kitap ile cikan kitap adi dogrulandı");

    }

    @Given("^cikan popup'taki yazıyı karsilastir //$") ////yaptık
    public void cikan_popup_taki_yazıyı_karsilastir() throws Throwable {
        stepssPage.assertMassage();

        System.out.println("cikan popup'taki yazıyı karsilastirildi");

    }

    @Given("^sag ustteki sepetim butonuna tikla$")
    public void sag_ustteki_sepetim_butonuna_tikla() throws Throwable {
        //stepssPage.clicksepetetikla();
        //stepssPage.clicksagusttikla2();
        //stepssPage.clicksepetegit();
        stepssPage.clicksagusttikla2();//d

        System.out.println("sag ustteki sepetim butonuna tiklandi");
    }

    /*@Given("^cikan popuptaki kitap ismi ile eklenen kitabin adini karsilastir //$") //yaptık   sorun var galiba
    public void cikan_popuptaki_kitap_ismi_ile_eklenen_kitabin_adini_karsilastir() throws Throwable {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(sepete_git_butonuna_tikla()));
        stepssPage.assertMassage2();

        System.out.println("cikan popuptaki kitap ismi ile eklenen kitabin adini karsilastirildi");

    }*/

    @When("^sepete git butonuna tikla  //$")
    public void sepete_git_butonuna_tikla() throws Throwable {
        stepssPage.clicksepetegit();

        System.out.println("sepete git butonuna tiklandi");

    }

    @Then("^ayni kitabin eklendigini ve fiyatini dogrula //$") //
    public void ayni_kitabin_eklendigini_ve_fiyatini_dogrula() throws Throwable {
        stepssPage.tumurunsayisi();
        String chartpricevalue = stepssPage.getcartpricevalue();
        Assertions.assertEquals(price,chartpricevalue);


        Assertions.assertTrue(stepssPage.urunsayisi());
        System.out.println("ayni kitabin eklendigi ve fiyati dogrulandı ,Fiyatı:\n"+chartpricevalue);

    }
}

