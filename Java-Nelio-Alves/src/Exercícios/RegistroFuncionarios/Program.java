package RegistroFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import RegistroFuncionarios.entities.Registro;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //REGISTRO DE FUNCIONÁRIOS

        List<Registro> listaFuncionarios = new ArrayList<>();
        
        System.out.print("Quantos funcionários serão adicionados? ");
        int numFunc = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numFunc; i++) {
            System.out.println("\nEmpregado #" + (i + 1) + ":" );
            System.out.print("ID: ");
            int id = sc.nextInt();

            while (Registro.hasId(listaFuncionarios, id)) {
                System.out.println("Esse número já foi adicionado.");
                System.out.print("ID: ");
                id = sc.nextInt();
            }
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            float salario = sc.nextFloat();
            sc.nextLine();

            listaFuncionarios.add(new Registro(id, nome, salario));
        }

        //SELECIONAR FUNCIONARIO QUE TERÁ AUMENTO DE SALÁRIO

        System.out.println();
        Registro funcionario = null;
        while (funcionario == null) {
            System.out.print("Digite o ID do funcionário que terá aumento de salário: ");
            int idAumento = sc.nextInt();

            funcionario = listaFuncionarios.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
            if (funcionario == null) {
                System.out.println("Erro! Não há ninguém com este ID! Tente novamente.");
            } else {
                System.out.println("Digite a porcentagem do aumento salarial: ");
                float aumentoSalarial = sc.nextFloat();
                funcionario.aumentarSalario(aumentoSalarial);
            }
        }

        //LISTA DE FUNCIONÁRIOS E SEUS SALÁRIOS

        System.out.println("\nLISTA DE FUNCIONÁRIOS: \n");
        for (Registro registro : listaFuncionarios) {
            System.out.println(registro);
        }

        sc.close();
    }


}
