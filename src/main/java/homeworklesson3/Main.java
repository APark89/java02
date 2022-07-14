package homeworklesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        taskOne();

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "89051");
        phonebook.add("Popov","89052");
        phonebook.add("Petrov","89053");
        phonebook.add("Ivanov", "89054");

        phonebook.get("Ivanov");
        phonebook.get("Petrov");
    }


    private static void taskOne() {
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] words = {
                "MU", "MC", "Chelsea", "Arsenal",
                "Tottenham", "Everton", "Leeds", "Liverpool", "Leicester",
                "Newcastle", "MU"
        };

        for (String word : words) {
            Integer count = map.getOrDefault(word, 0);
            map.put(word, count + 1);
        }
        System.out.println(map);
    }
}


