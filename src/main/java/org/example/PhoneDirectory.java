package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    private final Map<String, ArrayList<String>> directory = new HashMap<>();

    public void add(String surname, String phone_number){
        if(!directory.containsKey(surname)){
            directory.put(surname, new ArrayList<>());
        }
        if(directory.get(surname).contains(phone_number)){
            return;
        }
        directory.get(surname).add(phone_number);
    }

    public ArrayList<String> get(String surname){
        return directory.getOrDefault(surname, new ArrayList<>());
    }
}
