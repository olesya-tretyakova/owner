package io.qaguru.owner;

import io.qaguru.owner.config.HugeWebDriverConfig;
import io.qaguru.owner.config.SimpleWebDriverConfig;
import io.qaguru.owner.config.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {
    private final SimpleWebDriverConfig config = ConfigFactory.create(SimpleWebDriverConfig.class,System.getProperties());

    private final WebDriverProvider provider = new WebDriverProvider(config);

    @Test
    public void testTitle(){
        WebDriver driver = provider.get();
        driver.get(config.getBaseUrl());
        assertEquals("GitHub: Where the world builds software · GitHub",
                driver.getTitle());
        driver.quit();
    }
}
