package com.stctv.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class TestConfig {

  public static HashMap<String, String> prjProperties = new HashMap<>();

  public static HashMap<String, String> getConfigDetails() {

    try {
      String userDir = System.getProperty("user.dir");
      // Create FileInputStream Object
      File fle = new File(userDir + "/src/test/resources/configuration/config.properties");
      FileInputStream fileInput = new FileInputStream(fle);
      // Create Properties object
      Properties prop = new Properties();
      // load properties file
      prop.load(fileInput);

      for (String key : prop.stringPropertyNames()) {
        String value = prop.getProperty(key);
        prjProperties.put(key, value);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return prjProperties;
  }
}
