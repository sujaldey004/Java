package practice_package;

import Access_modifier.For_Example;
public class sam2 {
    public static void main(String[] args) {
        For_Example f = new For_Example();
        System.out.println(f.p);  // --> Only public methods and properties can be used outside of the package
    }
}
