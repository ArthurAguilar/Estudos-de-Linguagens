package Aulas.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class Program3 {
    public static void main(String[] args) {
        
        Instant horaInstant = Instant.parse("2024-08-06T12:08:24Z");
        LocalDateTime dataAgora = LocalDateTime.now();

        LocalDate res1 = LocalDate.ofInstant(horaInstant, ZoneId.systemDefault());
        LocalDate res2 = LocalDate.ofInstant(horaInstant, ZoneId.of("Portugal"));

        LocalDateTime res3 = LocalDateTime.ofInstant(horaInstant, ZoneId.systemDefault());
        LocalDateTime res4 = LocalDateTime.ofInstant(horaInstant, ZoneId.of("Portugal"));

        
        System.out.println("Res1 = " + res1);
        System.out.println("Res2 = " + res2);
        System.out.println("Res3 = " + res3);
        System.out.println("Res4 = " + res4);

        System.out.println("Hora hoje = " + dataAgora.getHour());
        System.out.println("Hora hoje = " + dataAgora.getHour());
        System.out.println("Minutos hoje = " + dataAgora.getMinute());
        System.out.println("Segundos hoje = " + dataAgora.getSecond());
        System.out.println("Dia hoje = " + dataAgora.getDayOfMonth());
        System.out.println("Mês hoje = " + dataAgora.getMonthValue());
        System.out.println("Ano hoje = " + dataAgora.getYear());
        System.out.println("Dia Semana hoje = " + dataAgora.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));

    }
}
