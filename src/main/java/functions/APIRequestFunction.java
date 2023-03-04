package functions;

import api.restassured.RestUtil;
import data.RequestMethods;
import io.restassured.response.Response;
import models.ResponseModel;
import utils.JsonUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static common.Constants.*;

public class APIRequestFunction {

    private APIRequestFunction() {
    }

    public static String setProtocolHostAndBasePath(String protocol, String host, String basePath) {
        RestUtil.API_HOST = protocol + host;
        RestUtil.BASE_PATH = basePath;
        return protocol;
    }

    public static ResponseModel getApiResponse(Map<String,String> queryParam,String categoryId) {
        setProtocolHostAndBasePath(BASE_HTTP_PROTOCOL,BASE_DOMAIN,BASE_PATH);
        Response response = RestUtil.send(new HashMap<>(), "", URI.replace("{categoryId}",categoryId), RequestMethods.GET.getRequestMethod(), queryParam);
        ResponseModel resp = (ResponseModel) JsonUtils.getResponseAsObject(response.asString(), ResponseModel.class);
        Objects.requireNonNull(resp).setResponseCode(response.getStatusCode());
        return resp;
    }
}
