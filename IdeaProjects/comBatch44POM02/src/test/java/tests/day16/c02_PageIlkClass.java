package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class c02_PageIlkClass {

    @Test
    public void test01() {
        //Amazona gidleim
        Driver.getDriver().get("https://www.amazon.com");
        //arama kutusuna Nutella yazip aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);


        //Atama sonuclarinin Nutella icerdifini test edelim

        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("Nutella"));

        Driver.closeDriver();
    }

      @Test
    public void test02(){
        //amazona gidelim
          Driver.getDriver().get("https://www.amazon.com");

        //java icn arama yapalim
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java" +Keys.ENTER);
          //sonucun java icerdigini test edelim
          String sonucYazisiStr=amazonPage.sonucYazisiElementi.getText();
          Assert.assertTrue(sonucYazisiStr.contains("Java"));
      }
}
