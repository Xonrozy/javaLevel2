package ru.zhugin.lesson3;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main{

    public static void main(String[] args) {
        compare(new String[]{
                "Яблоки",
                "Мандарины",
                "Виноград",
                "Мандарины"
        });
        String[][] phonesData = {
                {"Nash","89222451939"},
                {"Mccoy","89223439021"},
                {"Kelley","89221783489"},
                {"Francis","89229511581"},
                {"Mccoy","8128127721"},
                {"Schmitt","4952941555"},
                {"Francis","4953019243"},
                {"Mccoy","8129178142"},
        };

        PhoneBook pb = new PhoneBook();

        for(String[] record : phonesData) {
            pb.add(record[0], record[1]);
        }

        System.out.println("Search results:");
        System.out.println("Mccoy: " + pb.get("Mccoy"));
        System.out.println("Kelley: " + pb.get("Kelley"));
        System.out.println("Francis: " + pb.get("Francis"));
    }
    private static void compare (String[] data)
    {
        Set<String> duplicates = new HashSet<>();
        for (int i = 0; i < data.length; i++)
        {
            for (int j = i + 1; j < data.length; j++)
            {
                if (data[i].equals(data[j]))
                {
                    duplicates.remove(data[i]);
                } else {
                    duplicates.add(data[i]);
                }

            }
        }
        System.out.println("Уникальные слова в массиве: " + duplicates);
        HashMap<String, Integer> hm = new HashMap<>();

        for(String word : data) {
            if (hm.containsKey(word)) {
                hm.put(word, hm.get(word) + 1);
            } else {
                hm.put(word, 1);
            }
        }


        for(String key : hm.keySet()) {
            System.out.println("Слова в массиве встречаются: ");
            System.out.println(MessageFormat.format("{0}\t{1}", key, hm.get(key)));
        }
    }
}




