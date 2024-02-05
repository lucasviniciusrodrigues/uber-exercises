package example.exercises.linked;

import java.util.HashMap;

public class ArbitraryPointer {

    public static void main(String[] args) {

        LinkedListNode three = new LinkedListNode(21, null, null);
        LinkedListNode two = new LinkedListNode(14, three, null);
        LinkedListNode head = new LinkedListNode(7, two, null);

        three.arbitrary = head;
        head.arbitrary = three;

        System.out.println(head);

        System.out.println(deepCopy(head, new HashMap<Integer, LinkedListNode>()));

    }

    public static LinkedListNode deepCopy(LinkedListNode head, HashMap<Integer, LinkedListNode> hash){

        LinkedListNode newHead = new LinkedListNode(head.value);
        hash.put(newHead.value, newHead);

        newHead.next = deepCopy(head.next, hash);
        newHead.arbitrary = hash.get(head.arbitrary.value);

        return newHead;

    }


}

class LinkedListNode {

    int value;

    LinkedListNode next;

    LinkedListNode arbitrary;

    public LinkedListNode(int value, LinkedListNode next, LinkedListNode arbitrary) {
        this.value = value;
        this.next = next;
        this.arbitrary = arbitrary;
    }

    public LinkedListNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "value=" + value +
                ", next=" + (next == null ? "null" : next.toString()) +
                ", arbitrary=" + (arbitrary == null ? "null" : arbitrary.toString()) +
                '}';
    }
}
