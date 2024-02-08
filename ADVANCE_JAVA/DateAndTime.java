package ADVANCE_JAVA;

import java.time.LocalDateTime;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis()/1000/60/60/24/365);   // Java count milisecond from jan 1, 1970 and year from 1900
        //LocalDateTime d = LocalDateTime.now();  // This is the new methods of new API
        Date d1 = new Date();
        //System.out.println(d1);
        //System.out.println(d);

        System.out.println(String.format("%tc",d1));   // ⬇ These methods are from Reference book
        System.out.println(String.format("%tr",d1));
        System.out.println(String.format("%tA, %tB %td",d1,d1,d1));
        }
}
