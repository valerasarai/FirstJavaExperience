import org.apache.commons.lang3.StringUtils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TextProcessorImpl implements TextProcessor {

    public String concatenate(String text1, String string) {

        return text1 + string;
    }

    public String replace(String text, String original, String replacement) {
        return StringUtils.replace(text,original,replacement);
    }

    public String replace(String text, String original, int replacement) {
        return replace(text,original, String.valueOf(replacement));
    }

}
