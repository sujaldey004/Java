package ADVANCE_JAVA;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(10,0.8f);
        hs.add(54);
        hs.add(89);
        hs.add(25);
        hs.add(37);
        hs.add(99);
        System.out.println(hs);
    }
}
