package LearnJavaFiles.DatesAndTimes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class main {

    public static void main(String[] args) {

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        // *************** TIME OF CHOOSING ************** //

        LocalDateTime dateTime = LocalDateTime.of(2024, 12, 25, 2, 24);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM:dd:yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);

        System.out.println(newDateTime);

        // ********** CURRENT DATE AND TIMES ************* //


        // date and time
        /* LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);*/

        // Exact time
        /* LocalTime time = LocalTime.now();
        System.out.println(time);*/

        // date
        /* LocalDate date = LocalDate.now();
        System.out.println(date);*/

        // UTC timestamp
        /* Instant instant = Instant.now();
        System.out.println(instant); */

        // Custom format

        /* LocalDateTime localDateTime = LocalDateTime.now();

        // Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newDateTime = localDateTime.format(formatter);

        System.out.println(newDateTime); */



    }
}
