package org.example;

import java.util.Map;
import java.util.TreeMap;

public class App
{
    public static void main(String[] args) {
        firstPart();
        secondPart();
    }

    public static void secondPart(){
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("AAA", "123456");
        phoneDirectory.add("AAA", "23456");
        phoneDirectory.add("AAA", "6533");
        phoneDirectory.add("AAA", "6533");
        phoneDirectory.add("DDD", "444");
        phoneDirectory.add("CCC", "5555");

        System.out.println("AAA: " + phoneDirectory.get("AAA"));
        System.out.println("DDD: " + phoneDirectory.get("DDD"));
        System.out.println("CCC: " + phoneDirectory.get("CCC"));

    }

    public static void firstPart(){
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape",
                "apple", "pear", "grape", "banana", "melon", "kiwi", "kiwi"};
        Map<String, Integer> words_map = new TreeMap<>();
        for (String elements: words) {
            words_map.put(elements, words_map.getOrDefault(elements, 0)+1);
        }
        System.out.println("All unique words: ");
        for (String elements: words_map.keySet()) {
            System.out.println(elements);
        }
        System.out.println();
        System.out.println("Count of each word: ");
        for (Map.Entry<String, Integer> e: words_map.entrySet()) {
            if(e.getValue() == 1){
                System.out.println(e.getKey() + " was " + e.getValue() + " time");
            }
            else System.out.println(e.getKey() + " was " + e.getValue() + " times");
        }
        System.out.println();
    }

}
