package Aulas;

import java.util.Scanner;

public class LacosForEach {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] vetorNomes = new String[] {"Arthur", "Amanda"};

        // for (int i = 0; i < vetorNomes.length; i++) {
        //     System.out.println(vetorNomes[i]);
        // }
        
        for (String nome : vetorNomes) {
            System.out.println(nome);
        }

        sc.close();

    }
}
