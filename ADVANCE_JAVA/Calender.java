package ADVANCE_JAVA;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());    // show normal time and date
        System.out.println(c.get(Calendar.DATE));    // show date
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE));   // show normal time
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));    // 24 hour time format
        

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));

        /*for(int i = 0; i < 1000; i++){
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }*/

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
