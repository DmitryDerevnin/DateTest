package impl.date.impl;

import java.time.*;

public class AgePerson {
    private String currentAge;

    public void determineAge(LocalDateTime birthDate) {
        LocalDate now = LocalDate.now();
        Period period = Period.between(now, birthDate.toLocalDate());

        int hours = LocalDateTime.now().getHour() - birthDate.getHour();
        int min = LocalDateTime.now().getMinute() - birthDate.getMinute();
        int sec = LocalDateTime.now().getSecond() - birthDate.getSecond();
        this.currentAge = period.toString() + " "
                + Math.abs(hours) + ":"
                + Math.abs(min) + ":"
                + Math.abs(sec);
    }

    public String getCurrentAge() {
        return currentAge;
    }

}
