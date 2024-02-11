package advanceJavaQuestion;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class que3 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        System.out.println(t);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("k:m:s");
        String s = t.format(df);
        System.out.println(s);
    }
}
