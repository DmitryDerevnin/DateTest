package impl.date.test;

import impl.date.impl.AgePerson;
import impl.date.impl.DateConverter;
import impl.date.impl.DaysBetweenTwoDates;

import java.time.LocalDateTime;

public class TestDate {

    public void start() {

        AgePerson agePerson = new AgePerson();
        agePerson.determineAge(LocalDateTime.
                of(1993, 01, 02,
                        17, 30, 14));
        System.out.println("Текущий возраст: " + agePerson.getCurrentAge());


        DaysBetweenTwoDates daysBetweenTwoDates = new DaysBetweenTwoDates();
        System.out.println("Промежуток дней " +
                daysBetweenTwoDates.findPeriod
                        ("25.07.1921", "27.10.1921"));

        DateConverter dateConverter = new DateConverter();
        System.out.println(dateConverter.convertDate
                ("Friday, Aug 10, 2018 12:10:56 PM"));

    }

}
