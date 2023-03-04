package api.functions;

import api.jackson.JacksonUtil;
import api.request.RequestBase;
import api.response.ResponseBase;
import api.restassured.RestUtil;
import data.RequestMethods;
import io.restassured.response.Response;
import lombok.SneakyThrows;

import java.util.HashMap;

import static api.restassured.RestUtil.API_HOST;
import static api.restassured.RestUtil.BASE_PATH;
import static org.apache.logging.log4j.core.net.ssl.SslConfigurationDefaults.PROTOCOL;

public class ApiFunction {

    public static void setProtocolHostAndBasePath(String protocol, String host, String basePath) {
        API_HOST = protocol + host;
        BASE_PATH = basePath;
    }

    @SneakyThrows
    public static ResponseBase getResponse(RequestBase apiRequest) {
        setProtocolHostAndBasePath(PROTOCOL, API_HOST, BASE_PATH);
        String baseRequestBody = JacksonUtil.getAsString(apiRequest);
        Response response = RestUtil.send(new HashMap<>(), baseRequestBody, "URI", RequestMethods.POST.toString());
        ResponseBase responseBase = (ResponseBase) JacksonUtil.getResponseAsObject(response.asString(), true, ResponseBase.class);
        //responseBase.setResponseCode(response.statusCode());
        return responseBase;
    }
}
