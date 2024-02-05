import java.util.TreeMap;

public class Application {

    public static void main(String[] args){
        System.out.println(checkPossibleTrip(4, new int[][]{{2,3,6},{1,2,3}}));
        System.out.println(checkPossibleTrip(2, new int[][]{{2,3,6},{1,2,4}}));
        System.out.println(checkPossibleTrip(2, new int[][]{{2,3,6}}));
        System.out.println(checkPossibleTrip(0, new int[][]{{2,3,6}}));
    }

    public static boolean checkPossibleTrip(int max_passenger, int[][] trips){

        TreeMap<Integer, Integer>  countedTrips = new TreeMap<>();

        for(int i = 0; i < trips.length; i++){

            int auxValue = countedTrips.get(trips[i][1]) != null ? countedTrips.get(trips[i][1]) : 0;

            countedTrips.put(trips[i][1], auxValue + trips[i][0]);
            countedTrips.put(trips[i][2], auxValue - trips[i][0]);

        }

        int auxValue = 0;

        for(Integer value : countedTrips.values()){

            auxValue += value;

            if (auxValue > max_passenger)
                return false;
        }

        return true;
    }

}
