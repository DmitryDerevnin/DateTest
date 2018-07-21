package impl.date.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateConverter {

    public String convertDate(String originalDate) {
        DateTimeFormatter oldFormat = DateTimeFormatter.
                ofPattern("EEEE, MMM dd, yyyy hh:mm:ss a");
        DateTimeFormatter newFormat = DateTimeFormatter.
                ofPattern("yyyy-MM-dd");
        LocalDateTime parsedDate = LocalDateTime.parse
                (originalDate, oldFormat.withLocale(Locale.ROOT));
        return newFormat.format(parsedDate);
    }
}
