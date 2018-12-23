package ru.zhugin.lesson3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> bookPhone = new HashMap<>();
    public void add(String lastname, String phone) {
        this.bookPhone.put(phone, lastname);
    }
    public ArrayList<String> get(String lastname) {
        ArrayList<String> result = new ArrayList<>();

        for(String key : this.bookPhone.keySet()) {
            if(this.bookPhone.get(key).equals(lastname)) {
                result.add(key);
            }
        }
        return result;
    }
}
