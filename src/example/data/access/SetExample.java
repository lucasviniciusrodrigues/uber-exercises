package example.data.access;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

public class SetExample {

    public static void main(String[] args) {
        // Example with HashSet (DESORDENADO)
        Set<String> hashSet = new HashSet<>();
        populateSet(hashSet);
        showContent("HashSet", hashSet);

        // Example with LinkedHashSet (ORDENADO PELA ENTRADA)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        populateSet(linkedHashSet);
        showContent("LinkedHashSet", linkedHashSet);

        // Example with TreeSet (ORDENADO PELO MÉTODO compareTo em Comparable)
        Set<String> treeSet = new TreeSet<>();
        populateSet(treeSet);
        showContent("TreeSet", treeSet);
    }

    private static void populateSet(Set<String> set) {
        // Adding elements
        set.add("Element 1");
        set.add("Element 2");
        set.add("Element 3");
        set.add("Element 4");
        set.add("Element 5");

        // Removing an element (if needed)
        set.remove("Element 3");
    }

    private static void showContent(String setName, Set<String> set) {
        // Iteration using for-each loop
        System.out.println("Content of the set " + setName + ":");
        for (String element : set) {
            System.out.println(element);
        }

        // Using stream for display
        System.out.println("\nUsing stream for display:");
        set.stream().forEach(System.out::println);

        System.out.println("\nUsing stream for display with atomic:");
        AtomicReference<Float> atomicReference = new AtomicReference<>(112124.2F);
        set.stream().forEach(value -> {
            atomicReference.set(1F);
            System.out.println(value);
        });

        System.out.println("\n-------------------------\n");
    }
}
