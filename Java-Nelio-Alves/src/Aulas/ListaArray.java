package Aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        List<String> lista = new ArrayList<>();

        lista.add("Arthur");
        lista.add("Amanda");
        lista.add("Renner");
        lista.add("Gaby");
        lista.add("Sofhia");

        System.out.println(lista);
        for (String nome : lista) {
            System.out.println(nome);
        }

        System.out.println("-------------------------");

        // lista.remove("Gaby");
        // lista.remove(3);

        // System.out.println(lista);
        // for (String nome : lista) {
        //     System.out.println(nome);
        // }        

        // System.out.println("-------------------------");

        // lista.removeIf(x -> x.charAt(0) == 'A');

        // System.out.println(lista);
        // for (String nome : lista) {
        //     System.out.println(nome);
        // }

        List<String> listaFiltrada = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(listaFiltrada);

        System.out.println("-------------------------");

        String primeiroNome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse("Não há nomes com essa letra.");
        System.out.println(primeiroNome);

        sc.close();
    }
}
