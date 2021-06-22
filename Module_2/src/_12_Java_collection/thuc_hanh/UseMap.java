package _12_Java_collection.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class UseMap {
    public static void main(String[] args) {
        Map<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Smith", 30);
        myHashMap.put("Anderson", 31);
        myHashMap.put("Lewis", 29);
        myHashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(myHashMap);

        Map<String, Integer> myTreeMap = new TreeMap<>();
        myTreeMap.put("Smith", 30);
        myTreeMap.put("Anderson", 31);
        myTreeMap.put("Lewis", 29);
        myTreeMap.put("Cook", 29);
        System.out.println("Display entries in TreeMap");
        //Sort theo Key
        System.out.println(myTreeMap);

        Map<String, Integer> myLinkedMap = new LinkedHashMap<>();
        myLinkedMap.put("Smith", 30);
        myLinkedMap.put("Anderson", 31);
        myLinkedMap.put("Lewis", 29);
        myLinkedMap.put("Cook", 29);
        System.out.println("Display entries in LinkedHashMap");
        System.out.println(myLinkedMap);
    }
}
