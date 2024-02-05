package example.data.access;

public class ArrayExample {

    public static void main(String[] args) {
        // Example with an array of Strings
        String[] stringArray = new String[]{"Element 1", "Element 2", "Element 3", "Element 4", "Element 5"};
        showContent("StringArray", stringArray);

        // Example with an array of ints
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        showContent("IntArray", intArray);

        // Example with an empty array of doubles
        double[] doubleArray = new double[0];
        showContent("DoubleArray (Empty)", doubleArray);

        // Example with an array of floats with an initial size
        float[] floatArray = new float[10];
        populateArray(floatArray);
        showContent("FloatArray (Initial Size)", floatArray);
    }

    private static void populateArray(float[] array) {
        // Adding values
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 1.5f;
        }
    }

    private static void showContent(String arrayName, Object array) {
        // Iteration using for-each loop
        System.out.println("Content of the array " + arrayName + ":");
        if (array instanceof String[]) {
            for (String element : (String[]) array) {
                System.out.println(element);
            }
        } else if (array instanceof int[]) {
            for (int element : (int[]) array) {
                System.out.println(element);
            }
        } else if (array instanceof double[]) {
            for (double element : (double[]) array) {
                System.out.println(element);
            }
        } else if (array instanceof float[]) {
            for (float element : (float[]) array) {
                System.out.println(element);
            }
        }

        System.out.println("\n-------------------------\n");
    }
}
