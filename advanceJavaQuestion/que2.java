package advanceJavaQuestion;

import java.util.*;    // We cannot use Date class here because its too old Thats why wwe are using Clendar class

public class que2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
