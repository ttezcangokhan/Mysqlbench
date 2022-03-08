package get_http_request.day09;


import org.junit.Test;
import test_data.HerOkuAppTestData;

import java.util.HashMap;

public class GetRequest22 extends HerOkuAppBaseUrl {
       /*
   https://restful-booker.herokuapp.com/booking/47
          {
              "firstname": "Ali",
              "lastname": "Can",
              "totalprice": 500,
              "depositpaid": true,
              "bookingdates": {
                                "checkin": "2022-02-01",
                                    "checkout": "2022-02-11"
             }
          }
   1) JsonPhat
   2) De-Serialization
   */

    @Test
    public void test22(){
        //1) URL OLUSTUR
        spec05.pathParams("first", "booking", "second", 47);

        //2) EXPECTED DATA OLUSTUR
        HerOkuAppTestData expectedObje = new HerOkuAppTestData();

        HashMap<String , Object> expectedTestDataMap = expectedObje.setUpTestData();

        System.out.println("TEST DATA iCiNDEKi EXPECTED DATA: " + expectedTestDataMap);
        // {firstname=Ali,
        // bookingdates={
        //               checkin=2022-02-01,
        //               checkout=2022-02-11},
        // totalprice=500,
        // depositpaid=true,
        // lastname=Can}
    }
}