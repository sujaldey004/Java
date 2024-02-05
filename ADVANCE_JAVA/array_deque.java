package ADVANCE_JAVA;

import java.util.ArrayDeque;

public class array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> n = new ArrayDeque<>();
        n.add(47);
        n.add(68);
        n.addLast(88);
        n.addFirst(54);
        Object[] a = n.toArray();
        for(int i = 0; i < n.size(); i++){
            System.out.println(a[i]);
                }
    }
}
