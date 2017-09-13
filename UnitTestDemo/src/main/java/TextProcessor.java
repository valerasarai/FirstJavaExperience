public interface TextProcessor {

    String concatenate(String text1, String string);

    String replace (String text, String original, String replacement);

    String replace(String text, String original, int replacement);

}
