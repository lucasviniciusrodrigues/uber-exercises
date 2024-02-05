package example.exercises.array;

import java.util.Arrays;

public class FindMissingNumber {

/*

    You are given an array containing ‘n’ distinct numbers taken from the range 0 to ‘n’.
    Since the array has only ‘n’ numbers out of the total ‘n+1’ numbers, find the missing number.


    Input:
    0,1,2,3,4,5,6,8,9,10 = 7
    0,2,3,4,5 = 1
    0,1,2,3,5 = 4
    0,1,2,3,4,5,6 = -1
    0 = -1
    [] = -1

    N -> LOG(N)

*/

    public static void main(String[] args){

        System.out.println("Expected -1: " + getMissingNumber(new int[] {}));
        System.out.println("Expected -1: " + getMissingNumber(new int[] { 1 }));
        System.out.println("Expected 7: " + getMissingNumber(new int[] { 0,1,2,3,4,5,6,8,9,10 }));
        System.out.println("Expected 1: " + getMissingNumber(new int[] { 0,2,3,4,5 }));
        System.out.println("Expected 4: " + getMissingNumber(new int[] { 0,1,2,3,5 }));
        System.out.println("Expected -1: " + getMissingNumber(new int[] { 0,1,2,3,4,5,6 }));

    }

    private static int getMissingNumber(int[] values) { // Busca em O( log(n) ) sendo N o tamanho da entrada

        if(values.length == 0)
            return -1;

        if(values.length == 1 && values[0] != 0){
            return 0;
        }

        int left = 0;
        int right = values.length - 1;
        int mid = 0;

        while(left < right){

            mid = (left + right) / 2;

            if(values[mid] == mid){

                if(values[mid + 1] != mid + 1)
                    return mid + 1;

                left = mid + 1;

                continue;
            }

            if(values[mid] != mid){

                if(values[mid - 1] == mid - 1)
                    return mid;

                right = mid - 1;
            }

        }

        return -1;

    }
    private static int getMissingNumberOld(int[] values) { // Busca em O(N) sendo N o tamanho da entrada

        if(values.length <= 1)
            return -1;

        int aux = 0;
        int totalSum = values.length;

        for(int i = 0; i < values.length; i++){
            aux += values[i];
            totalSum += i;
        }

        return totalSum - aux == values.length ? -1 : totalSum - aux;

    }

    // O(N)
    // log(N)
}
