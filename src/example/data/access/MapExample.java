package example.data.access;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class MapExample {

    /* Uma maneira fácil de evitar colisiões de Hash é salvar na posição uma LinkedList, essa lista conterá objetos com
        as chaves e valores, assim todos as chaves com o mesmo valor em memória, apesar de diferentes, terão o
        retorno adequado
     */

    public static void main(String[] args) {

        // Example with HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        populateMap(hashMap);
        showContent("HashMap", hashMap);

        // Example with Hashtable (Syncronized -> Thread safe)
        Map<Integer, String> hashtable = new Hashtable<>();
        populateMap(hashtable);
        showContent("Hashtable", hashtable);

        // Example with TreeMap (Ordenado pelo método compareTo em Comparable)
        Map<Integer, String> treeMap = new TreeMap<>();
        populateMap(treeMap);
        showContent("TreeMap", treeMap);

    }

    private static void populateMap(Map<Integer, String> map) {
        // Adding elements
        map.put(1, "Element 1");
        map.put(2, "Element 2");
        map.put(3, "Element 3");
        map.put(4, "Element 4");
        map.put(5, "Element 5");
        map.put(5, "Element 5");

        // Removing an element
        map.remove(3);
    }

    private static void showContent(String mapName, Map<Integer, String> map) {
        // Iteration using entrySet and forEach
        System.out.println("Content of the " + mapName + ":");
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("\nUsing stream for display with atomic:");

        AtomicInteger integer = new AtomicInteger();
        AtomicReference<Float> atomicReference = new AtomicReference<>(112124.2F);
        AtomicReference<String> stringVariable = new AtomicReference<>("asd");

        map.entrySet().forEach(entry -> {
            integer.set(Integer.parseInt("1"));
            atomicReference.getAndSet(1F);
            stringVariable.set(entry.getValue());
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });

        System.out.println("\n-------------------------\n");
    }
}
