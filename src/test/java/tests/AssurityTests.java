package tests;

import functions.APIRequestFunction;
import models.ResponseModel;
import org.testng.annotations.Test;
import utils.AssertionUtils;
import utils.TestBase;

import java.util.HashMap;
import java.util.Map;

import static api.jackson.ApiStatusCodes.RESPONSE_CODE_200;

public class AssurityTests extends TestBase {

    private static final Map<String,String> queryParam = new HashMap<>();

    @Test(description = "test with the listed acceptance criteria")
    public static void testVerifyAcceptanceCriteria() {
        queryParam.put("catalogue","false");
        ResponseModel response = APIRequestFunction.getApiResponse(queryParam, "6327");
        softAssert.assertEquals(response.getResponseCode(),RESPONSE_CODE_200);
        AssertionUtils.assertName(response, "Carbon credits");
        AssertionUtils.assertCanRelist(response, true);
        AssertionUtils.assertPromotionDescriptionContains(response, "Gallery", "Good position in category");
        softAssert.assertAll();
    }
}
