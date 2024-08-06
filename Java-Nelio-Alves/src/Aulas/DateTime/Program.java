package Aulas.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        
        LocalDate hr1 = LocalDate.now();
        LocalDateTime hr2 = LocalDateTime.now();
        Instant hr3 = Instant.now();

        LocalDate hr4 = LocalDate.parse("2024-08-05");
        LocalDateTime hr5 = LocalDateTime.parse("2024-08-05T15:30");
        Instant hr6 = Instant.parse("2024-08-05T20:30:00Z");
        Instant hr7 = Instant.parse("2024-08-05T20:30:00+05:00:00");

        DateTimeFormatter fmtWithoutTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmtWithTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDate hr8 = LocalDate.parse("06/08/2024" ,fmtWithoutTime);
        LocalDateTime hr9 = LocalDateTime.parse("06/08/2024 12:28", fmtWithTime);

        LocalDate hr10 = LocalDate.of(2025, 01, 01);
        LocalDateTime hr11 = LocalDateTime.of(2025, 01, 01, 12, 30);



        //----------------##-------------------------##---------------------##-----------------------##---------------------##--------------//

        System.out.println("LocalDate = "+ hr1);
        System.out.println("LocalDateTime = "+ hr2);
        System.out.println("Instant = "+ hr3);

        System.out.println("LocalDateParse = " + hr4);
        System.out.println("LocalDateTimeParse = " + hr5);
        System.out.println("InstantParse = " + hr6);
        System.out.println("InstantParse = " + hr7);

        System.out.println("LocalDateFmt = " + hr8);
        System.out.println("LocalDateTimeFmt = " + hr9);

        System.out.println("LocalDateOf = " + hr10);
        System.out.println("LocalDateTimeOf = " + hr11);


        //----------------##-------------------------##---------------------##-----------------------##---------------------##--------------//

        


        
        sc.close();
    }
}
