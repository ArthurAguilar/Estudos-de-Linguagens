package Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Employees.entities.Employee;
import Employees.entities.Outsourced;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> empList = new ArrayList<>();
        System.out.print("Adicione o nº total de funcionários: ");
        int totalEmp = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalEmp; i++) {
            System.out.printf("#%dº Funcionário -%n", i + 1);
            System.out.print("É terceirizado? (S/N): ");

            while (true) {
                String outsourced = sc.nextLine().strip();

                if (!outsourced.isEmpty()) {
                    char firstChar = Character.toUpperCase(outsourced.charAt(0));

                    if (firstChar == 'S' || firstChar == 'N') {
                        System.out.print("Nome: ");
                        String name = sc.nextLine();
                        System.out.print("Horas Trabalhadas: ");
                        Integer hoursWorked = sc.nextInt();
                        System.out.print("Valor por hora: R$");
                        Double valuePHour = sc.nextDouble();

                        if (firstChar == 'S') {
                            System.out.print("Gasto adicional: R$");
                            Double addCharge = sc.nextDouble();

                            empList.add(new Outsourced(name, hoursWorked, valuePHour, addCharge));
                            break;
                        } else {
                            empList.add(new Employee(name, hoursWorked, valuePHour));
                            break;
                        }

                    } else {
                        System.out.print("Deu ruim, tente novamente! ");
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Pagamentos: ");
        for (Employee employee : empList) {
            System.out.printf("%s - R$%.2f%n", employee.getName(), employee.payments());
        }

        sc.close();
    }
}
