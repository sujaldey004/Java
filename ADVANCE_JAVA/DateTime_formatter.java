package ADVANCE_JAVA;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_formatter {
    public static void main(String[] args) {
        LocalDateTime dt  = LocalDateTime.now();
        System.out.println(dt);

        //DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        //String obj = dt.format(f);
        //System.out.println(obj);

        //DateTimeFormatter fm = DateTimeFormatter.ISO_LOCAL_DATE;
        //String s = dt.format(fm);
        //System.out.println(s);

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-mm-yyyy --E H:m a");
        String s = dt.format(d);
        System.out.println(s);
    }
}
