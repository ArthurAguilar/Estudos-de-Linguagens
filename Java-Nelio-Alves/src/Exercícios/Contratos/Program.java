package Contratos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Contratos.entities.Worker;
import Contratos.entities.Department;
import Contratos.entities.HourContract;
import Contratos.entities.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String dpt = sc.nextLine();

        System.out.println("Adicione os dados do trabalhador:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Nível: ");
        String level = sc.nextLine();
        System.out.print("Salário base: ");
        Double baseSalary = sc.nextDouble();
        sc.nextLine();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level.toUpperCase()), baseSalary, new Department(dpt));

        System.out.print("Quantos contratos tem o trabalho? ");
        int numContracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numContracts; i++) {
            System.out.printf("Digite os dados do %dº contrato:%n", i + 1); // Corrigido
            System.out.print("Data (dd/mm/yyyy): ");
            String dateString = sc.nextLine();
            LocalDate date = LocalDate.parse(dateString, fmt);
            System.out.print("Valor por hora: R$");
            Double valueHour = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int duration = sc.nextInt();
            sc.nextLine();

            HourContract contract = new HourContract(date, valueHour, duration);
            worker.addContract(contract);
        }

        System.out.print("Digite o mês e o ano que deseja consultar (mm/yyyy): ");
        String MaY = sc.nextLine();
        int month = Integer.parseInt(MaY.substring(0, 2));
        int year = Integer.parseInt(MaY.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Receberá em " + MaY + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
