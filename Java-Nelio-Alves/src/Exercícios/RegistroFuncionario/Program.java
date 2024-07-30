package RegistroFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import RegistroFuncionario.entities.Registro;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // ADICIONAR FUNCIONÁRIOS
        
        System.out.println("Quantos funcionários serão adicionados?");
        System.out.print("Digite o valor: ");
        int numFuncionario = sc.nextInt();
        System.out.println();

        List<Registro> listaDosFuncionarios = new ArrayList<>();

        for (int i = 0; i < numFuncionario; i++) {
            System.out.println("| #" + (i + 1) + " Funcionário. |");
            System.out.print("Adicione um ID: ");
            int idFuncionario = sc.nextInt();

            while (Registro.temId(listaDosFuncionarios, idFuncionario)) {
                System.out.println("Já tem um funcionário com este ID.");
                System.out.print("Tente outro: ");
                idFuncionario = sc.nextInt();
            } 
            sc.nextLine();

            System.out.print("Nome: ");
            String nomeFuncionario = sc.nextLine();

            System.out.print("Salário: ");
            float salarioFuncionario = sc.nextFloat();
            sc.nextLine();

            System.out.println("Funcionário #" + (i + 1) + " adicionado sucesso!\n");
            listaDosFuncionarios.add(new Registro(idFuncionario, nomeFuncionario, salarioFuncionario));
        }

        // ESCOLHER FUNCIONÁRIO PARA AUMENTO SALARIAL

        Registro funcionario = null;
        while (funcionario == null) {
            System.out.print("Digite o ID do funcionário que receberá aumento salarial: ");
            int idFuncionarioAumentoSalarial = sc.nextInt();  
            funcionario = listaDosFuncionarios.stream().filter(x -> x.getId() == idFuncionarioAumentoSalarial).findFirst().orElse(null);
                        
            if (funcionario != null) {
                System.out.print("Digite o valor em porcentagem que deseja aumentar: ");
                float valorAumentoSalarial = sc.nextFloat();
                funcionario.setAumentoSalarial(valorAumentoSalarial);
                System.out.printf("O valor do funcionário #%d foi aumentado em %.1f%% com sucesso!", idFuncionarioAumentoSalarial, valorAumentoSalarial);
            } else {
                System.out.println("Não há ninguém com este ID, tente novamente!");
            }
        }
        System.out.println();

        // IMPRESSÃO DOS DADOS

        System.out.println("\n*--- LISTA DOS FUNCIONÁRIOS ---*");
        for (Registro registro : listaDosFuncionarios) {
            System.out.println(registro.toString());
        }       

        sc.close();
    }
}
