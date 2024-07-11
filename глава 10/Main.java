/*
Шарыгина Надежда Б763-2
Вариант А
3. В каждой строке найти слова, начинающиеся с гласной буквы.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] lines = {
                "Это примеры текста",
                "Анна и Олег пошли гулять",
                "Эти строки содержат слова"
        };
        String text = "АОИЕЁЭЫУЮЯаеёиоуыэюя";
        for (String line : lines) {
            String[] words = line.split("\\s+");
            List<String> Words = new ArrayList<>();
            for (String word : words) {
                if (word.length() > 0 && text.indexOf(word.charAt(0)) != -1) {
                    Words.add(word);
                }
            }
            System.out.println("Слово, начинающиеся с гласной в строке \"" + line + "\": " + Words);
        }
    }
}