package ADVANCE_JAVA;

import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);   // Java count milisecond from jan 1, 1970 and year from 1900
        Date d = new Date();
        System.out.println(d);
    }
}
