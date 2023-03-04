package api.jackson;

import api.request.RequestBase;
import api.response.ResponseBase;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;

public class JacksonUtil {

    private JacksonUtil() {
    }

    public static String getAsString(RequestBase requestBase) {
        return getAsString(requestBase, false);
    }

    public static String getAsString(RequestBase body, boolean ignoreNull) {
        ObjectMapper mapper = new ObjectMapper();
        if (ignoreNull) {
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        }

        String jsonInString = "";

        try {
            jsonInString = mapper.writeValueAsString(body);
        } catch (JsonProcessingException var5) {
            jsonInString = Arrays.toString(var5.getStackTrace());
        }

        return jsonInString;
    }

    public static ResponseBase getResponseAsObject(String jsonString, boolean ignoreNull, Class<?> cls) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        if (ignoreNull) {
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        }

        return (ResponseBase) mapper.readValue(jsonString, cls);
    }
}
