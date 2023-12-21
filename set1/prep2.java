package set1;
import java.util.*;
class prep2{
    public static void main(String[] args) {
        String name = "Sujal";
        int digit = name.length();
        String lstr = name.toLowerCase();
        String ustr = name.toUpperCase();
        String naam = "         sujal            ";
        String cut = name.substring(2,5);
        System.out.println(name);
        System.out.println(digit);
        System.out.println(lstr);
        System.out.println(ustr);
        System.out.println(naam.trim());
        System.out.println(cut);
        System.out.println(name.replace('j','z'));
        System.out.println(name.startsWith("S"));
        System.out.println(name.endsWith("L"));
        System.out.println("and \"Thats all\"");
    }
}