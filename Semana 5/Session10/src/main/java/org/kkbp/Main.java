package org.kkbp;

import org.kkbp.models.Car;
import org.kkbp.models.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Dictionary
        Map<Integer, String> dictionary = new HashMap<Integer, String>();

        // Add elements to the dictionary
        dictionary.put(1, "Luis");
        dictionary.put(2, "Jorge");
        dictionary.put(3, "Maria");
        dictionary.put(4, "Pedro");
        dictionary.put(5, "Jose");

        // Get an element by key
        System.out.println(dictionary.get(4));

        Map<String, String> dictionary2 = new HashMap<String, String>();
        dictionary2.put("Kendrick", "Barrios");

        Map<String, Object> list = new HashMap<String, Object>();
        list.put("Kendrick", new Person("Kendrick", "Barrios"));
        list.put("Seltos", new Car("Kia", "Seltos", 2025));
    }
}