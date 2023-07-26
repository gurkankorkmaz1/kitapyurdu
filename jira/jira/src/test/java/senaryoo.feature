Feature: Sepete Urun Ekleme Testi

  Scenario: Kitapyurdu sitesine git ve istenen kategorideki kitabı sepete ekleyip sepet kontrolu yap

    Given Kitapyurdu sitesine git
    And cok satan kitaplar sekmesinin uzerine gel
    And cok satan edebiyat kitaplari uzerine tikla
    And bir ve yirmi arasi random bir kitaba tikla
    And secilen kitabi sepete ekle
    And cikan popup'taki yazıyı karsilastirr //
    And  cikan popuptaki kitap ismi ile eklenen kitabin adini karsilastirr //
    And arama bolumune kitap adi yaz
    And aranan kitabi sepete eklee
    And aranan kitap ile cikan kitap adi dogrula
    And sag ustteki sepetim butonuna tikla
    When sepete git butonuna tikla  //
    Then ayni kitabin eklendigini ve fiyatini dogrula //