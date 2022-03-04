package get_http_request;


import base_url.DummyBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest08 extends DummyBaseUrl {
    /*
   http://dummy.restapiexample.com/api/v1/employees url'inde bulunan

  1) Butun calisanlarin isimlerini consola yazdıralim
  2) 3. calisan kisinin ismini konsola yazdıralim
  3) Ilk 5 calisanin adini konsola yazdiralim
  4) En son calisanin adini konsola yazdiralim
*/

    @Test
    public void test08(){

        spec02.pathParams("first", "api", "second", "v1", "third", "employees");

        // http://dummy.restapiexample.com
        Response response = given().spec(spec02).when().get("/{first}/{second}/{third}");
        // "/{first}/{second}/{third}" => /api/v1/employees

        response.prettyPrint();


        JsonPath json= response.jsonPath();
        System.out.println(json.getString("data.employee_name"));

        json.getString("data[2].employee_name");
    }
}