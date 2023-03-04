package utils;

import common.LoggerUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import static common.Constants.CONFIG_FILE_NAME;
import static common.Constants.PATH_TO_RESOURCE;

public class PropertyUtils {

    private static Properties properties = null;

    private PropertyUtils() {
    }

    private static void loadProperties() {
        properties = new Properties();
        try (InputStream input = Files.newInputStream(Paths.get(PATH_TO_RESOURCE + CONFIG_FILE_NAME))) {
            properties.load(input);
        } catch (IOException e) {
            LoggerUtil.logERROR(e.getMessage(), e);
        }
    }

    public static String getProperty(String key) {
        if (properties == null)
            loadProperties();

        String p = System.getProperty(key);
        return p != null ? p : properties.getProperty(key);
    }
}
