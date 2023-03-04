package common;

import utils.PropertyUtils;

public class Constants {

    public static final String PATH_TO_RESOURCE = System.getProperty("user.dir") + "/src/main/resources/";
    public static final String CONFIG_FILE_NAME = System.getProperty("config.file.name", "config.properties");
    public static final String BASE_HTTP_PROTOCOL = "https://";
    public static final String BASE_DOMAIN = PropertyUtils.getProperty("base.domain");
    public static final String BASE_VERSION = "/v1";
    public static final String BASE_PATH = BASE_VERSION + "/Categories";
    public static final String URI = "{categoryId}/Details.json";
}
