package SmallStudyGroup;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_dateTimeFormatter {

    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("M/yy/d mm:hh a");
        LocalDateTime bugun=LocalDateTime.now();
        System.out.println(dtf.format(bugun));
    }

}
