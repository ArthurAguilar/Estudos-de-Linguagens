package Aulas.Enumeracao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import Aulas.Enumeracao.entities.Order;
import Aulas.Enumeracao.entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm", new Locale("pt", "BR"));
        String dataFormatada = LocalDateTime.now().format(fmt);
        
        Order ordem = new Order(15, dataFormatada, OrderStatus.AGUARDANDO_PAGAMENTO);

        System.out.println(ordem);

        OrderStatus os1 = OrderStatus.ENTREGUE;
        OrderStatus os2 = OrderStatus.valueOf("PROCESSANDO");

        System.out.println(os1);
        System.out.println(os2);
    }
}
