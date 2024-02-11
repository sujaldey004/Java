package advanceJavaQuestion;

import java.util.ArrayList;

public class que1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Student 1");
        list.add("Student 2");
        list.add("Student 3");
        list.add("Student 4");
        list.add("Student 5");
        list.add("Student 6");
        list.add("Student 7");
        list.add("Student 8");
        list.add("Student 9");
        list.add("Student 10");
        for(int i = 0; i < 10; i++){
            System.out.println(list.get(i));
        }
    }
}
