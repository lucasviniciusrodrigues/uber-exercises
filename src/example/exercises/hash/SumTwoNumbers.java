package example.exercises.hash;

import java.util.HashMap;

public class SumTwoNumbers {

/*

1,4,3,25,104 = 0,1


 */

    public static void main(String[] args) {

        int[] response = sumAvaliable(5, new int[]{1,4,3,25,104});

        for (int value : response){
            System.out.println(value);
        }

    }

    private static int[] sumAvaliable(int goal, int[] values) {

        HashMap<Integer, Integer> goalDifference = new HashMap<>();

        for (int i = 0; i < values.length; i++) {

            if(goalDifference.containsKey(values[i])) {
                return new int[]{ goalDifference.get(values[i]) , i };
            }

            goalDifference.put(goal - values[i], i);
        }

        return new int[]{0,0};

    }
}
