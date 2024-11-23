package Aulas.TrabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Writing {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        List<String> listaNomes = new ArrayList<>();
        String path = "D:\\Programação\\Estudos-de-Linguagens\\Java-Nelio-Alves\\Arquivos\\Lista-Nomes-Writer.txt";

        for (int i = 0; i < 3; i++) {
            listaNomes.add(sc.nextLine());            
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            
            for (String nome : listaNomes) {
                bw.write(nome);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
