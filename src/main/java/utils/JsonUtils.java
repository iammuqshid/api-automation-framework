package utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import common.LoggerUtil;

import java.io.IOException;

public class JsonUtils {

    private JsonUtils() {
    }

    public static <R> Object getResponseAsObject(String response, Class<R> classType) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        try {
            return mapper.readValue(response, classType);
        } catch (IOException var4) {
            LoggerUtil.logINFO(var4.getMessage());
            return null;
        }
    }
}
