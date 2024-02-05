package example.exercises.linked;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MergedList {

    static LinkedList<Integer> baseListOne = new LinkedList<Integer>(List.of(1,2,3,4));
    static LinkedList<Integer> baseListTwo = new LinkedList<Integer>(List.of(1,3,6,106));

    public static void main(String[] args) {

        System.out.println(
                mergeTwoLists(baseListOne, baseListTwo));

//        System.out.println(
//                mergeTwoListsWithIterator(baseListOne, baseListTwo)); // Não funciona dado o next e a necessidade de comparação das duas listas

    }

    private static LinkedList mergeTwoLists(LinkedList<Integer> listOne, LinkedList<Integer> listTwo) {

        LinkedList<Integer> mergedList = new LinkedList<>();

        while (listOne.size() > 0 && listTwo.size() > 0) {

            if (listOne.getFirst() <= listTwo.getFirst()) {
                mergedList.add(listOne.getFirst());
                listOne.removeFirst();
            } else {
                mergedList.add(listTwo.getFirst());
                listTwo.removeFirst();
            }

        }

        if(listOne.size() > 0)
            mergedList.addAll(listOne);
        else
            mergedList.addAll(listTwo);

        return mergedList;
    }

    private static LinkedList mergeTwoListsWithIterator(LinkedList<Integer> listOne, LinkedList<Integer> listTwo) {

        LinkedList<Integer> mergedList = new LinkedList<>();
        Iterator<Integer> iteratorOne = listOne.iterator();
        Iterator<Integer> iteratorTwo = listTwo.iterator();

        while ( iteratorOne.hasNext() && iteratorTwo.hasNext() ) {

            if (iteratorOne.next() <= iteratorTwo.next()) {
                mergedList.add(iteratorOne.next());
            } else {
                mergedList.add(iteratorTwo.next());
            }

        }

        if(iteratorOne.hasNext())
            iteratorOne.forEachRemaining( value -> mergedList.add(value));
        else
            iteratorTwo.forEachRemaining( value -> mergedList.add(value));

        return mergedList;
    }
}
