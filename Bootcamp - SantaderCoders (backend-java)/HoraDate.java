import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class HoraDate {
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "br");
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        System.out.println(diaDaSemana);

        LocalDateTime agora = LocalDateTime.now();
        String saudacao;
        if (agora.getHour() > 0 && agora.getHour() < 12) {
            saudacao = "Bom dia!";
        } else if (agora.getHour() > 12 && agora.getHour() < 18) {
            saudacao = "Bom tarde!";
        } else {
            saudacao = "Boa noite!";
        } 

        System.out.println(agora);
        System.out.println(saudacao);


    }
}
