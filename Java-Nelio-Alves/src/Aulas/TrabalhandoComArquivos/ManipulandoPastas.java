package Aulas.TrabalhandoComArquivos;

import java.io.File;

public class ManipulandoPastas {
    public static void main(String[] args) {

        String strPath = "D:\\Programação\\Estudos-de-Linguagens\\Java-Nelio-Alves\\Arquivos";

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for (File folder : folders) {
            System.out.println(folder.getName());
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Arquivos: ");
        for (File file : files) {
            System.out.println(file.getName());
        }

        boolean sucess = new File (strPath + "\\Testing-Creating-Folder").mkdir();
        System.out.println("Criação de pasta com sucesso -> " + sucess);

    }
}
