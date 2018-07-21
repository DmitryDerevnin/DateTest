package impl.date.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DaysBetweenTwoDates {

    public long findPeriod(String dateBefore, String dateAfter) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate oneDate = LocalDate.parse(dateBefore, formatter);
        LocalDate twoDate = LocalDate.parse(dateAfter, formatter);
        return ChronoUnit.DAYS.between(oneDate, twoDate);
    }
}
