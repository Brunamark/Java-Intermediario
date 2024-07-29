package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

       
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-07-20");
        Instant d05 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDateTime d06 = LocalDateTime.parse("20/07/2023 02:30", fmt2);

        LocalDate d07 = LocalDate.parse("20/07/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));


        System.out.println(d01.toString());
        System.out.println(d02.toString());
        System.out.println(d03.toString());
        System.out.println(d04.toString());
        System.out.println(d05.toString());
        System.out.println(d06.toString());
        System.out.println(d07.toString());
    }
    
}
