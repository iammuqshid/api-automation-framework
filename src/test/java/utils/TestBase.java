package utils;

import common.LoggerUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class TestBase {

    public static SoftAssert softAssert;

    @BeforeMethod
    public void init(Method method) {
        softAssert = new SoftAssert();
        LoggerUtil.logINFO("Running test - " + method.getName());
    }

    @BeforeTest(alwaysRun = true)
    public void init() {
        LoggerUtil.logINFO("Test Running " + this.getClass().toString());
    }

}
