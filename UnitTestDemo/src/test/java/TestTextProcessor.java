import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTextProcessor {

    private static TextProcessor textProcessor;

    @BeforeClass
    public static void setUp() {
        textProcessor = new TextProcessorImpl();
    }

    @Test
    public void concatenateTest() {

        String str1 = "Alfa + ";
        String str2 = "Beta";

        String result = textProcessor.concatenate(str1, str2);
        Assert.assertEquals("Concatenated!", str1 + str2, result);
    }

    @Test
    public void replaceTest() {
        String text = "Afara inca este vara!";
        String original = "vara";
        String replacement = "toamna";

        String result = textProcessor.replace(text, original, replacement);

        assertNotEmpty(result);
        Assert.assertEquals("Replaced!", "Afara inca este toamna!", result);

        result = textProcessor.replace(text, original, 1);
        assertNotEmpty(result);
        Assert.assertEquals("Replaced!", "Afara inca este 1!", result);
    }

    private void assertNotEmpty(String result) {
        Assert.assertNotNull("Result is NULL!", result);
        Assert.assertTrue("Empty string!", result.length() > 0);
    }
}
