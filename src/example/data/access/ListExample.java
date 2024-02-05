package example.data.access;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ListExample {

    public static void main(String[] args) {
        // Example with ArrayList
        List<String> arrayList = new ArrayList<>();
        populateList(arrayList);
        showContent("ArrayList", arrayList);

        // Example with LinkedList
        List<String> linkedList = new LinkedList<>();
        populateList(linkedList);
        showContent("LinkedList", linkedList);

        // Example with Vector
        List<String> vector = new Vector<>();
        populateList(vector);
        showContent("Vector", vector);

        List<String> list = new ArrayList<>();

        arrayList.forEach( value -> {
            list.add(value);
            list.get(0);
        });
    }

    private static void populateList(List<String> list) {
        // Adding elements
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        list.add("Element 5");

        // Removing an element
        list.remove("Element 3");
    }

    private static void showContent(String listName, List<String> list) {

        // Iteration using for-each loop
        System.out.println("Content of the list " + listName + ":");
        for (String element : list) {
            System.out.println(element);
        }

        // Using stream for display
        System.out.println("\nUsing stream for display:");
        list.stream().forEach(System.out::println);

        System.out.println("\nUsing stream for display with atomic:");

        AtomicInteger integer = new AtomicInteger();
        AtomicReference<Float> atomicReference = new AtomicReference<>(new Float(112124.2F));
        AtomicReference<String> stringVariable = new AtomicReference<>("asd");

        list.stream().forEach(value -> {
            integer.set(Integer.parseInt("1"));
            atomicReference.getAndSet(1F);
            stringVariable.set(value);
            System.out.println(value);
        });

        System.out.println("\n-------------------------\n");
    }

}
