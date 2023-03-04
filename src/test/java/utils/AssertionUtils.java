package utils;

import models.ResponseModel;

import java.util.Objects;

public class AssertionUtils extends TestBase {

    public static void assertName(ResponseModel response, String value) {
        softAssert.assertEquals(response.getName(), value, "Invalid name");
    }

    public static void assertCanRelist(ResponseModel response, Boolean value) {
        softAssert.assertEquals(response.getCanRelist(), value, "Invalid state of CanRelist");
    }

    public static void assertPromotionDescriptionContains(ResponseModel response, String elementName, String value) {
        for (int i = 0; i < response.getPromotions().size(); i++) {
            if (Objects.equals(elementName, response.getPromotions().get(i).getName())) {
                softAssert.assertTrue(response.getPromotions().get(i).getDescription().contains(value), "Invalid Description found for promotion :" + response.getPromotions().get(i).getName());
            }
        }
    }
}
