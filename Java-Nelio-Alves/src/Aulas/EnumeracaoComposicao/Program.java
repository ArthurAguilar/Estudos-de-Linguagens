package Aulas.EnumeracaoComposicao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Aulas.EnumeracaoComposicao.entities.Departamento;
import Aulas.EnumeracaoComposicao.entities.HoraContrato;
import Aulas.EnumeracaoComposicao.entities.Trabalhador;
import Aulas.EnumeracaoComposicao.entities.enums.NivelTrabalhador;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.print("Adicione o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();

        System.out.println();
        System.out.println("Adicione os dados do trabalhador: ");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nível: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));

        System.out.println();
        System.out.print("Quantos contratos serão adicionados? ");
        int numContratos = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numContratos; i++) {
            System.out.println("Dados do #" + i + "º contrato: ");
            System.out.print("Data (DD/MM/YYYY): ");
            String dataContratoString = sc.nextLine();
            LocalDate dataContrato = LocalDate.parse(dataContratoString, fmt);
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração em horas: ");
            int duracao = sc.nextInt();
            sc.nextLine();
            HoraContrato contrato = new HoraContrato(dataContrato, valorPorHora, duracao);
            trabalhador.adicionarContrato(contrato);
            System.out.println();
        }

        System.out.println();
        System.out.print("Digite o mês e o ano para calcular a renda mensal (MM/YYYY): ");
        String mesAno = sc.nextLine();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.printf("Nome: %s%n", trabalhador.getNome());
        System.out.printf("Departamento: %s%n", trabalhador.getDepartamento().getNome());
        System.out.printf("Renda do mês %s: %.2f%n", mesAno, trabalhador.getRendaMensal(mes, ano)); 

        sc.close();
    }
}
