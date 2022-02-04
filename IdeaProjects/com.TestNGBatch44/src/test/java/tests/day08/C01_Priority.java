package tests.day08;

import com.google.common.annotations.VisibleForTesting;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_Priority extends TestBase {

    @Test
    public void youtubeTesti(){
        System.out.println("Youtube testi calisti");

    }
    @Test(priority = 8)
    public void amazonTesti(){
        System.out.println("Amazon testi calisti");

    }
    @Test(priority = 5)
    public void bestbuyTesti(){
        System.out.println("Bestbuy testi calsiti");

    }

}
