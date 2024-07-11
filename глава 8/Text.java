public class Text {
    public static String func(String text, int k, char symbol) {
    String[] words = text.split("\\s+");
    StringBuilder new_text = new StringBuilder();
    for (String word : words) {
        if (k <= word.length()) {
            StringBuilder new_word = new StringBuilder(word);
            new_word.setCharAt(k - 1, symbol);
            new_text.append(new_word).append(" ");
        } else {
            new_text.append(word).append(" ");
        }
    }

    return new_text.toString().trim();
}
}
