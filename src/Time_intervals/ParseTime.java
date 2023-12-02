package Time_intervals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ParseTime {
    public static void main(String[] args) throws ParseException {
        parse();
    }

    public static void parse() throws ParseException {


        String string = "2023.12.01 22:21";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(string, formatter);
        System.out.println(dateTime);


        ZonedDateTime z = ZonedDateTime.parse("2022-10-30T20:59:59.999Z");
        System.out.println(z);

        OffsetDateTime o = z.withZoneSameInstant(ZoneId.of("UTC-3")).toOffsetDateTime();
        System.out.println(o);

    }
}
