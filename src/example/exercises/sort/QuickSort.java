package example.exercises.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{30, 9, 46, 14, 22};
        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.println(i);
        }
    }
    private static void quickSort(int[] values, int left, int right) {

        int pivot = values[left];
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if(values[j] <= pivot){
                i += 1;
                swap(values, i, j);
            }
            
        }

        swap(values, left, i);

        if(left < right){
            quickSort(values, i + 1,right);
            quickSort(values, left, i - 1);
        }
    }

    private static void swap(int[] values, int i, int j) {

        int aux = values[i];
        values[i] = values[j];
        values[j] = aux;
    }

}
