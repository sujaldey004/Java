package ADVANCE_JAVA;

import java.util.List;

public class LamdaExpression_2 {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22);
        long present = number.stream().filter(num -> num%2 == 0).count();   // The filter method taking a lambda expression as an argument that checks if a number is even.  The count method then counts the number of elements that pass the filter.
        System.out.println(present);
    }
}
