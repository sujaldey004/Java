package ADVANCE_JAVA;
import java.util.Calendar;
import java.util.TimeZone;
public class Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getCalendarType());
    }
}
