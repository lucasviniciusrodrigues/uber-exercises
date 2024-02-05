package example.objects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicExample {

    public static void main(String[] args) {
        // AtomicBoolean
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        System.out.println("AtomicBoolean: " + atomicBoolean.get());

        // AtomicInteger
        AtomicInteger atomicInteger = new AtomicInteger(42);
        System.out.println("AtomicInteger: " + atomicInteger.get());

        // AtomicLong
        AtomicLong atomicLong = new AtomicLong(123456789L);
        System.out.println("AtomicLong: " + atomicLong.get());

        // AtomicReference
        AtomicReference<String> atomicReference = new AtomicReference<>("Hello");
        System.out.println("AtomicReference: " + atomicReference.get());

        // AtomicIntegerArray
        int[] intArray = {1, 2, 3, 4, 5};
        AtomicIntegerArray atomicIntArray = new AtomicIntegerArray(intArray);
        System.out.println("AtomicIntegerArray: " + atomicIntArray.get(2));

        // AtomicLongArray
        long[] longArray = {10L, 20L, 30L, 40L, 50L};
        AtomicLongArray atomicLongArray = new AtomicLongArray(longArray);
        System.out.println("AtomicLongArray: " + atomicLongArray.get(3));

        // AtomicReferenceArray
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        AtomicReferenceArray<String> atomicReferenceArray = new AtomicReferenceArray<>(stringArray);
        System.out.println("AtomicReferenceArray: " + atomicReferenceArray.get(1));

        // AtomicStampedReference
        Integer initialValue = 100;
        Integer initialStamp = 0;
        AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(initialValue, initialStamp);
        System.out.println("AtomicStampedReference: Value=" + atomicStampedReference.getReference() + ", Stamp=" + atomicStampedReference.getStamp());

        // AtomicIntegerFieldUpdater
        class ExampleClass {
            volatile int intValue;
        }
        AtomicIntegerFieldUpdater<ExampleClass> updater = AtomicIntegerFieldUpdater.newUpdater(ExampleClass.class, "intValue");
        ExampleClass exampleObject = new ExampleClass();
        updater.set(exampleObject, 42);
        System.out.println("AtomicIntegerFieldUpdater: " + updater.get(exampleObject));
    }
}
