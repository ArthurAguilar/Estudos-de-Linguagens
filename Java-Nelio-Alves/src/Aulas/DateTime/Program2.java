package Aulas.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {
    public static void main(String[] args) {

        LocalDate hr1 = LocalDate.parse("2022-07-20");
		LocalDateTime hr2 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant hr3 = Instant.parse("2022-07-20T01:30:26Z");
        LocalDate hr4 = LocalDate.now();
        LocalDateTime hr5 = LocalDateTime.now();
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("LocalDate HR1 = " + hr1.format(fmt1));
        System.out.println("LocalDateTime HR2 = " + hr2.format(fmt2));
        System.out.println("Instant HR3= " + fmt3.format(hr3));
        System.out.println("LocalDate HR4 = " + hr4.format(fmt1));
        System.out.println("LocalDateTime HR5 = " + hr5.format(fmt2));

        System.out.println("Iso_Date = " + hr2.format(fmt4));
        System.out.println("Iso_Instant = " + fmt5.format(hr3));
        
    }
}
