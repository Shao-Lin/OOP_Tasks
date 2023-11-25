package Time_intervals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ParseTime {
    public static void main(String[] args) throws ParseException {
        parse();
    }
    public static void parse() throws ParseException {
        String dateStr = "2017-03-02 12:58";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String formated = dateFormat.format(dateFormat);

        System.out.println(dateFormat);

    }
}
