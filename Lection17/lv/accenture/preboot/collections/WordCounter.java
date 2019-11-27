package lv.accenture.preboot.collections;

import java.util.HashMap;

public class WordCounter {

    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        text = text.toLowerCase();
        String[] words = text.split(" ");
        HashMap<String, Integer> wordFrequencies = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("\\.", "");
            word = word.replaceAll(",", "");
            if (wordFrequencies.containsKey(word)) {
                int counter = wordFrequencies.get(word);
                counter = counter + 1;
                wordFrequencies.put(word, counter);
            } else {
                wordFrequencies.put(word, 1);
            }
        }

        for (String key : wordFrequencies.keySet()) {
            Integer value = wordFrequencies.get(key);
            System.out.println(key + " -> " + value);
        }

    }

}
