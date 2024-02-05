package ADVANCE_JAVA;

// we have linkedlist package and methods in collection framework

// methods are same as arraylist only two are different     
// 1. addFirst()
// 2. addLast()
import java.util.LinkedList;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> n = new LinkedList<>();
        n.add(55);
        n.addLast(87);
        n.add(69);
        n.addFirst(88);
        for(int i = 0; i < n.size(); i++){
            System.out.println(n.get(i));
        }
    }
}
