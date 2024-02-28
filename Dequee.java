package Queue;

import java.util.*;

public class Dequee {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);

        deque.addLast(3);
        deque.addLast(4);

        deque.removeFirst();

        System.out.println(deque.getFirst());

        System.out.println(deque.getLast());

        System.out.println(deque);
    }
}
