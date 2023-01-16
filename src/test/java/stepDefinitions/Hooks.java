package stepDefinitions;

import com.stctv.core.TestFactory;
import com.stctv.utilities.TestConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

  @Before
  public void startUp() {
    TestFactory.launchApplication(TestConfig.getConfigDetails().get("browser"));
  }

  @After
  public static void cleanUp() {
    TestFactory.driver.close();
    TestFactory.driver.quit();
  }
}
