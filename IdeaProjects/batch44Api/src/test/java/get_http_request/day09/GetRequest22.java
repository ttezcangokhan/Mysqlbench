package get_http_request.day09;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import test_data.HerOkuAppTestData;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class GetRequest22 extends HerOkuAppTestData {
    @Test
    public void test22(){
        RequestSpecification spec05;
        Response response=given().spec(spec05).when().get("/{first}/{second}");
        response.prettyPrint();
        HashMap<String,Object> actualData=response.as(HashMap.class);
        System.out.println("Actual data" + actualData);
        Assert.assertEquals(expectedTestDataMap.get("firstname").actualData.get();

    }

}
