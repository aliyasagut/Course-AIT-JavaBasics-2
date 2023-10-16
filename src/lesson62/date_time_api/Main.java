package lesson62.date_time_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class Main {
    /*
    Date / Time Api
    Начиная с Java 8 появились новые классы для работы с датой и временем.
    Существовавшие до этого классы имели ряд недостатков:
    1. не были потокобезопасными
    2. плохой дизайн и работа методов
    3. не учитывались временные зоны

    Основные новые классы для работы с датой и временем
    1. LocalDate
    2. LocalTime
    3/ LocalDateTime
    4. ZonedDateTime
    5. Period
    6. Duration

    Классы 1-3 наиболее часто используются. Используют местное время и как правильно указывать временные зоны не нужно.

    LocalTime
     */

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now(); // возвращает текущее время
        System.out.println("Now is " + localTime);

        LocalTime localTime1 = LocalTime.of(13, 35, 20); // создание объекта LocalTime
        System.out.println("Our time is " + localTime1);

        // получить часы
        System.out.println("Hour: " + localTime.getHour());

        // получить минуты
        System.out.println("Minutes: " + localTime.getMinute());

        // методы добавления часов, минут, секунд, наносекунд ко времени
        LocalTime newTime = LocalTime.of(17, 25, 34, 111111);
        System.out.println("Adding hors " + newTime.plusHours(2));
        System.out.println("Adding hors " + newTime.plusMinutes(20));
        System.out.println("Adding hors " + newTime.plusSeconds(20));
        System.out.println(newTime);

        // методы вычитания часов, минут, секунд, наносекунд ко времени
        System.out.println("Subtracting " + newTime.minusHours(2));

        // isBefore() and isAfter() - проверяют будет ли время localTime, на котором они вызываются,
        // позже или раньше, чем время с котором они сравниваются. Возвращает true или false соответственно

        LocalTime timeToCheck = LocalTime.of(13, 25);
        System.out.println(timeToCheck.isBefore(LocalTime.now()));
        System.out.println(timeToCheck.isAfter(LocalTime.now()));

        // константы
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);

        // LocalDate - представляет собой дату в формате год-месяц-день (year-month-day) без указания времени

        LocalDate localDate = LocalDate.of(2020,1,10);
        System.out.println(localDate);

        LocalDate dateNow = LocalDate.now();

        // проверяет високосный ли год
        System.out.println("is now a leap tear? " + dateNow.isLeapYear());
        System.out.println("is 2020 a leap tear? " + localDate.isLeapYear());

        // isBefore(), isAfter()

        System.out.println(dateNow.isBefore(localDate));
        System.out.println(dateNow.isAfter(localDate));

        //можно отнимать или прибавлять дни, недели, месяцы
        LocalDate yesterday = dateNow.minusDays(1);
        System.out.println("yesterday was "+yesterday);

        System.out.println(dateNow.getDayOfWeek());
        System.out.println(dateNow.getEra());

        System.out.println(dateNow.lengthOfMonth());
        System.out.println(dateNow.lengthOfYear());

        //LocalDateTime - представляет собой сочетание даты и времени

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2000, 10, 1, 10, 15);

        System.out.println(localDateTime1.getDayOfYear());
        System.out.println(localDateTime1.getMonth());
        System.out.println(localDateTime1.getMonthValue());

        // ZonedDateTime - время и дата с учетом временной зоны

        Set<String> availableZoneIDs = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIDs);

        LocalDateTime now = LocalDateTime.now();

        ZoneId london = ZoneId.of("Europe/London");
//        ZonedDateTime inLondon = ZonedDateTime.of(now, london);
//        System.out.println("Time in London is "+ inLondon);
//
        ZoneId berlin = ZoneId.of("Europe/Berlin");
//        ZonedDateTime inBerlin = ZonedDateTime.of(now, berlin);
//        System.out.println("Time in Berlin is "+ inBerlin);

        ZonedDateTime inLondon = ZonedDateTime.now(london);
        System.out.println(inLondon);
        ZonedDateTime inBerlin = ZonedDateTime.now();
        System.out.println(inBerlin);

//        Iterator<String> iterator = availableZoneIDs.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        availableZoneIDs.forEach(System.out::println);


        //Period - класс, используемый для изменения даты или получения разницы между двумя датами.
        // он работает с временными единицами: год, месяц, день

        System.out.println("---- Period ------");
        LocalDate nowDate = LocalDate.now();
        LocalDate finalDate = nowDate.plus(Period.ofDays(5));
        System.out.println(finalDate);

        int fiveDays = Period.between(nowDate, finalDate).getDays();
        System.out.println(fiveDays);

        System.out.println(ChronoUnit.DAYS.between(nowDate, finalDate));

        // Duration - класс можно использовать при работе со временем
        LocalTime initTime = LocalTime.of(10,30,0);
        LocalTime finalTime = initTime.plus(Duration.ofHours(2));
        long duration = Duration.between(initTime, newTime).getSeconds();
        System.out.println(duration);

        System.out.println(ChronoUnit.SECONDS.between(initTime, newTime));

        // форматирование даты и времени - DateTimeFormatter

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted = dateTimeFormatter.format(dateTime);
        System.out.println("Formatted with Basic Iso date format " +formatted);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String formatted1 = dateTimeFormatter1.format(dateTime);
        System.out.println("Formatted with Iso local date format " +formatted1);

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String formatted2 = dateTimeFormatter2.format(dateTime);
        System.out.println("Formatted with Iso local date format " +formatted2);

        // "2023/10/12 12:42:30" - представление текущего времени преобразовать к такому формату
        DateTimeFormatter ourFormatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd HH:mm:ss");
        dateTime = LocalDateTime.now();
        String res = ourFormatter.format(dateTime);
        System.out.println("DateTime formatted with out format " + res);

        /*
        y - year
        M - month in digit (01)
        MMM - month in letters (Jan)
        MMMM - full month name (January)
        d - day
        E - day of the week (Mon)
        EEEE - full name of the day of the week (Monday)
        h - hour 0-12
        H - hour 0-23
        m - minutes
        s - seconds
        a - am, pm

        yyyy-MM-dd "2023-12-10"
        dd-MMM-yyyy "12-Oct-2023"
        E, MMM dd yyyy "Mon, Oct 12 2023"
        h:mm a "12:58 PM"
         */


    }// end main
}









