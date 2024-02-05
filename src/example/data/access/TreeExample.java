package example.data.access;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class TreeExample {

    // https://home.csulb.edu/~pnguyen/cecs277/lecnotes/hashtree.pdf

    public static void main(String[] args) {
        // Example with TreeSet
        Set<String> treeSet = new TreeSet<>();
        populateSet(treeSet);
        showContent("TreeSet", treeSet);

        SortedSet<String> sortedSet = new TreeSet<>();
        populateSet(sortedSet);
        showContent("SortedSet", sortedSet);

        // Example with TreeMap
        Map<String, String> treeMap = new TreeMap<>();
        populateMap(treeMap);
        showContent("TreeMap", treeMap.keySet());

    }

    private static void populateSet(Set<String> set) {
        // Adding elements
        set.add("Element5");
        set.add("Element2");
        set.add("Element4");
        set.add("Element1");
        set.add("Element3");
    }

    private static void populateMap(Map<String, String> map) {
        // Adding elements
        map.put("Key5", "Value5");
        map.put("Key2", "Value2");
        map.put("Key4", "Value4");
        map.put("Key1", "Value1");
        map.put("Key3", "Value3");
    }

    private static void showContent(String structureName, Iterable<String> iterable) {

        // Iteration using for-each loop
        System.out.println("Content of the " + structureName + ":");
        for (String element : iterable) {
            System.out.println(element);
        }

        System.out.println("Content of the " + structureName + " using forEach:");
        iterable.forEach(key -> System.out.println(key + ": " + iterable));

        System.out.println("\n-------------------------\n");
    }

    private static void showContent(String structureName, Map<String, String> map) {

        // Iteration using forEach Key and value
        map.keySet().forEach(key -> System.out.println(key + ": " + map.get(key)));
        map.values().forEach(value -> System.out.println(value + ": " + map.get(value)));

        // Iteration using entrySet and forEach
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("\n-------------------------\n");

    }
}
