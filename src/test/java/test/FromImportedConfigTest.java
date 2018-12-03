package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@WebMvcTest
@Import(Config.class)
public class FromImportedConfigTest {

    @Autowired
    Environment env;

    @Test
    public void testProperty() {
        final String test = env.getProperty("test");
        System.out.println(test);
        assertEquals("test", test);
    }
}