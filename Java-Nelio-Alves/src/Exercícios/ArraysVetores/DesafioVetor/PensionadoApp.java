package ArraysVetores.DesafioVetor;

import java.util.Locale;
import java.util.Scanner;

import ArraysVetores.DesafioVetor.Entities.Pensionado;

public class PensionadoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int numEstudantes = Pensionado.getNumEstudantes(sc);

        Pensionado[] aluguelQuartos = Pensionado.alugarQuarto(sc, numEstudantes);
        
        Pensionado.mostrarRelatorio(aluguelQuartos);
        

        sc.close();
    }
}
