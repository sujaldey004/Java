package ADVANCE_JAVA;
import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);    // add method to add element into arraylist
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(13);

        // list.clear();    // clear method used to remove element from array

        System.out.println(list.contains(14));   // contain method is used to check if the object or element is present or not   It gives true or false

        list.add(3,10);

        list.addAll(list2);     // addAll method to combine 2  lsit or more

        System.out.println(list.subList(2, 7));

        Object[] a = list.toArray();  // toArray method for 
        System.out.println(list.indexOf(10));
        System.out.println(list.lastIndexOf(10));
        for(int i = 0; i < list.size(); i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }

        /*for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
            System.out.print(", ");
        }*/
    }
}
