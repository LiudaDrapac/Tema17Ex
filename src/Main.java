import java.time.*;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024, Month.JANUARY, 2);
        System.out.println(date);

        LocalTime time = LocalTime.of(13,20);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(2024, Month.JANUARY, 2, 13, 20);
        System.out.println(dateTime);

        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zone = ZonedDateTime.of(date, time, zoneId);
        System.out.println(zone);

        LocalDateTime dataTimePlus = LocalDateTime.of(2024, Month.JANUARY, 2, 13, 20);
        dataTimePlus = dataTimePlus.plusYears(1);
        dataTimePlus = dataTimePlus.plusMonths(1);
        dataTimePlus = dataTimePlus.plusDays(1);
        dataTimePlus = dataTimePlus.plusHours(1);
        dataTimePlus = dataTimePlus.plusMinutes(1);
        System.out.println(dataTimePlus);
    }

}