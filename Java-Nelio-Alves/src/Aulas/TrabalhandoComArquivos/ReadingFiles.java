package Aulas.TrabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) {
        File file = new File("D:\\Programação\\Estudos-de-Linguagens\\Java-Nelio-Alves\\Arquivos\\Lista-Nomes.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        
    }
}
