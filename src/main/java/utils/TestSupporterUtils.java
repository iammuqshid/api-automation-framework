package utils;

import common.LoggerUtil;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

public class TestSupporterUtils {
    private TestSupporterUtils() {
    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            LoggerUtil.logINFO("Interrupted!" + e.toString());
            Thread.currentThread().interrupt();
        }
    }
}
